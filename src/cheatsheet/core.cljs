(ns cheatsheet.core
  (:require [reagent.core :as r]
            [cheatsheet.data :refer [data]]
            [cheatsheet.eval :refer [eval-code]]
            [cheatsheet.styles :refer [styles-view]]))

(enable-console-print!)

(defonce state (r/atom {}))

(defn get-docs [string]
  (eval-code (str "(meta #'" string ")")
             (fn [output]
               (swap! state assoc string output))))

(defn function-hover-view [item]
  (let [string (if (namespace item)
                 (str (namespace item)
                      "/"
                      (name item))
                 (name item))
        meta (get-in @state [string])
        _ (when-not meta
            (get-docs string))]
    [:div.meta
     [:div.ns (:ns meta)]
     [:div.name (:name meta)]
     [:div.arglists
      (for [arglist (or (get meta :arglists)
                        (get-in meta [:top-fn :arglists]))]
        [:div.arglist (str arglist)])]
     [:div.doc (:doc meta)]]))

(defn item-view [item]
  [:div.item
   (cond
     (string? item) item
     (keyword? item) [:div
                      (name item)
                      [function-hover-view item]])])

(defn list-view [items]
  [:div.list
   (doall
     (for [item items]
       [item-view item]))])

(defn group-view [[title items]]
  [:div.group
   [:h1 title]
   [:div
    (if (map? items)
      (doall
        (for [item items]
          [group-view item]))
      [list-view items])]])

(defn app-view []
  [:div.app
   [styles-view]
   [group-view ["Cheatsheet" data]]])

(r/render-component [app-view] (.. js/document (getElementById "app")))
