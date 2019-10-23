(ns cheatsheet.styles
  (:require
    [garden.core :refer [css]]
    [garden.stylesheet :refer [at-import at-media]]))

(defn app-styles []
  [:.app
   {:font-family "'Source Code Pro', 'Courier New'"
    :font-size "14px"
    :font-weight "400"
    :line-height "1.25"}

   (at-media {:print true}
     [:&
      {:font-size "15px"}])

   [:.group
    {:padding "0 0 0.5em 0"}



    [:>h1
     {:font-size "1em"
      :font-weight "700"
      :margin [[0 "0.5em" 0 0]]
      :display "inline-block"
      :vertical-align "top"}]

    [:>.children
     {:display "inline-block"
      :vertical-align "top"}

     [:>.list
      {:display "inline-block"
       :vertical-align "top"}

      [">.item:hover>.meta"
       {:display "block"}]

      [:>.item
       {:position "relative"
        :display "inline-block"
        :vertical-align "top"
        :margin-right "0.5em"}

       [:>.meta
        {:display "none"
         :position "absolute"
         :top "-1.7em"
         :left "-0.5em"
         :background "white"
         :z-index 100
         :box-shadow [[0 "1px" "4px" 0 "#ccc"]]
         :width "30em"
         :padding "0.5em"}

        [:&.core
         {:top "-0.5em"}]

        [:>.ns
         {:color "#777"}]

        [:>.name
         {:display "inline-block"
          :vertical-align "top"
          :margin-right "0.5em"}]

        [:>.arglists
         {:display "inline-block"
          :vertical-align "top"}

         [:>.arglist]]

        [:>.doc
         {:margin-top "1em"
          :color "#777"}]]]]]]

   [:>.group
    {:white-space "inherit"}

    [:>h1
     {:display "block"
      :font-size "2em"
      :padding "0.75em 0 0 0.75em"}

    (at-media {:print true}
      [:&
       {:display "none"}])]

    [:>.children
     {:padding "0.5em"
      :display "flex"
      :flex-wrap "wrap"}

     [:>.group
      {:min-width "26em"
       :width "25%"
       :box-sizing "border-box"
       :padding "0 1em"
       :margin "1em 0"}

      (at-media {:print true}
        [:&
         {:width "50%"
          :break-inside "avoid"}])

      [:>h1
       {:display "block"
        :font-size "1.25em"
        :font-weight "900"
        :padding "0.85em 0 0.75em"
        :text-transform "uppercase"
        :border-top "1px solid black"}]]]]])

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
               (at-import "https://fonts.googleapis.com/css?family=Source+Code+Pro:400,700,900")
               [:body
                {:margin 0
                 :padding 0}]
               (app-styles))}}])
