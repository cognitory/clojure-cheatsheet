(defproject cognitory.cheatsheet "0.0.1"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.227"]
                 [reagent "0.6.0-rc"]]

  :plugins [[lein-figwheel "0.5.6"]]

  :figwheel {:server-port 3453}

  :cljsbuild {:builds [{:id "example"
                        :source-paths ["src/"]
                        :figwheel true
                        :compiler {:main "cheatsheet.core"
                                   :asset-path "js/out"
                                   :output-to "resources/public/js/cheatsheet.js"
                                   :output-dir "resources/public/js/out" }}]})
