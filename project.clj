(defproject cognitory.cheatsheet "0.0.1"

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [garden "1.3.9"]
                 [reagent "0.8.1"]]

  :plugins [[lein-figwheel "0.5.19"]
            [lein-cljsbuild "1.1.7"]]

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
