(ns cheatsheet.data
  (:require [clojure.pprint]))

(def data
  {"misc" {"comments" ["#_(...)" "comment" "; ..."]
           "define" ["def" "defonce" "defn"]
           "let" ["let" "if-let" "when-let"]
           "arrange" ["->" "->>"]
           "namespace" ["ns"]
           "function" ["fn"]}

   "branching" {"logic" ["if" "when" "if-not" "when-not" "cond" "case" "condp"]
                "predicates" [#'= #'not=]
                "operators" ["and" "or" #'not]}


   "literals" {"create" ["true" "false" "nil"]
               "test " [#'true? #'false? #'nil?]}

   "numbers" {"create"     ["1" "-1.5" #'int #'long]
              "arithmetic" [#'+ #'- #'* #'/ #'max #'min #'inc #'dec]
              "compare"    [#'== #'< #'> #'<= #'>=]
              "random"     [#'rand #'rand-int]}

   "strings" {"create"     ["\"some-text\"" #'str]
              "use"        [#'count
                            #'clojure.string/join
                            #'clojure.string/split
                            #'clojure.string/replace]
              "test"       [#'clojure.string/blank?
                            #'clojure.string/includes?]
              "regex"      ["#\"some-patern\""
                            #'re-find
                            #'re-matches]}

   "keywords" {"create"    [":some-keyword"
                            ":some-ns/some-keyword"
                            #'keyword]
               "->str"     [#'name
                            #'namespace]}

   "sequences" {"misc" [#'map
                        #'reduce
                        #'apply
                        "for"
                        "doseq"
                        #'concat
                        #'count
                        #'some
                        ]
                "loop" ["for" "doseq"]
                "test" [#'some?
                        #'empty?
                        #'every?]
                "shorter" [#'filter
                           #'remove
                           #'rest
                           #'drop]
                "reorder" [#'shuffle
                           #'reverse
                           #'sort
                           #'sort-by]
                "extract one" [#'nth
                               #'first
                               #'last
                               #'rand-nth]}

   "vectors" {"create" ["[]"
                        #'vec]
              "examine" ["(your-vec idx)"
                         #'get]
              "change" [#'assoc
                        #'assoc-in
                        #'conj]}

   "maps" {"create" ["{}" #'group-by #'hash]
           "examine" ["(some-map k)"
                      "(k some-map)"
                      #'get
                      #'get-in
                      #'contains?
                      #'keys
                      #'vals]
           "change" [#'assoc
                     #'assoc-in
                     #'dissoc
                     #'merge
                     #'select-keys
                     #'update-in]}

   "sets" {"create" ["#{}"
                     #'set]
           "examine" ["(your-set k)"
                      #'get
                      #'contains?]
           "change" [#'conj
                     #'disj]
           "ops"  [#'clojure.set/union
                   #'clojure.set/difference
                   #'clojure.set/intersection]
           "test" [#'clojure.set/subset?
                   #'clojure.set/superset?]}

   "atoms" {"create" [#'atom]
            "change" [#'swap! #'reset!]
            "read" ["@" #'deref]}

"io" {"files" ["spit"
               "slurp"]
      "*out*" [#'println #'clojure.pprint/pprint]}

"js interop" ["." ".." "cljs->js" "js->clj" "doto"
              "#js { }"]

"repl" ["*1" "clojure.repl/pst"]})
