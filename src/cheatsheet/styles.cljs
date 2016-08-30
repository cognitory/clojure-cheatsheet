(ns cheatsheet.styles
  (:require [garden.core :refer [css]]))

(defn app-styles []
  [:.app
   {:font-family "Courier New"
    :font-size "13px"
    :line-height "1.25"}

   [:.group
    {:padding "0.5em"}

    [:h1
     {:font-size "1em"
      :margin [[0 "0.5em" 0 0]]
      :display "inline-block"
      :vertical-align "top"}]

    [:.children
     {:display "inline-block"
      :vertical-align "top"}

     [:.list
      {:display "inline-block"
       :vertical-align "top"}

      [".item:hover .meta"
       {:display "block"}]

      [:.item
       {:position "relative"
        :display "inline-block"
        :vertical-align "top"
        :margin-right "0.5em"}

       [:.meta
        {:display "none"
         :position "absolute"
         :top "-1.7em"
         :left "-0.5em"
         :background "white"
         :z-index 100
         :box-shadow [[0 "1px" "4px" 0 "#ccc"]]
         :width "30em"
         :padding "0.5em"}

        [:.ns
         {:color "#999"}]

        [:.name
         {:display "inline-block"
          :vertical-align "top"
          :margin-right "0.5em"}]

        [:.arglists
         {:display "inline-block"
          :vertical-align "top"}

         [:.arglist]]

        [:.doc
         {:margin-top "1em"
          :color "#999"}]]]]]]

   ["> .group"
    {:white-space "inherit"
     :width "100vw"}

    ["> h1"
     {:display "block"}]

    ["> .children > .group"
     {:display "inline-block"
      :vertical-align "top"
      :width "26em"
      :box-sizing "border-box"}

     ["> h1"
      {:display "block"}]]]])

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
