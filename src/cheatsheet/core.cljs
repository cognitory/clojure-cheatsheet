(ns cheatsheet.core
  (:require [reagent.core :as r]))

(defn app-view []
  [:h1 "Hello World"])

(r/render-component [app-view] (.. js/document (getElementById "app")))
