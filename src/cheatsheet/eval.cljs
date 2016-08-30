(ns cheatsheet.eval
  (:require [cljs.js :refer [empty-state eval-str js-eval]]))

(defn eval-code [code cb]
  (eval-str (empty-state)
            code
            'dummy-symbol
            {:ns 'cljs.user
             :static-fns true
             :def-emits-var false
             :eval js-eval
             ; NOTE: load does nothing; libs must be reqd by this ns
             :load (fn [name cb] (cb {:lang :clj :source "."}))
             :context :statement}
            (fn [{:keys [error value] :as x}]
              (cb value)
              (if error
                (do
                  (def *er x)
                  (js/console.log (str error)))))))
