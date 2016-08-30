(ns cheatsheet.styles
  (:require [garden.core :refer [css]]))

(defn app-styles []
  [:#app
   [:.group
    {:border [["1px" "solid" "red"]]
     :margin "1em"}

    [:.list
     {:border [["1px" "solid" "green"]]
      :margin "1em"}

     [:.item


      [:.meta

       ]]]]])

(defn styles-view []
  [:style
   {:type "text/css"
    :dangerouslySetInnerHTML
    {:__html (css
               {:auto-prefix #{:transition
                               :flex-direction
                               :flex-shrink
                               :align-items
                               :animation
                               :flex-grow}
                :vendors ["webkit"]}
               (app-styles))}}])
