(defproject cognitory.cheatsheet "0.0.1"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.227"]
                 [garden "1.3.2"]
                 [reagent "0.6.0-rc"]]

  :plugins [[lein-figwheel "0.5.6"]
            [lein-cljsbuild "1.1.4"]]

  :figwheel {:server-port 3453}

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src/"]
                        :figwheel true
                        :compiler {:main "cheatsheet.core"
                                   :asset-path "js/out"
                                   :output-to "resources/public/js/cheatsheet.js"
                                   :output-dir "resources/public/js/out" }}
                       {:id "prod"
                        :source-paths ["src/"]
                        :compiler {:main "cheatsheet.core"
                                   :asset-path "js/out"
                                   :output-to "docs/js/cheatsheet.js"
                                   :output-dir "docs/js/out"
                                   :optimizations :advanced
                                   :pretty-print false}}]})
