(ns cheatsheet.data
  (:require [clojure.pprint]))

(def data
  {; BASICS

   "basics" {"define" ["def" "defonce" "defn" "let" "declare" "ns"]
             "branch" ["if" "when" "if-not" "when-not" "cond" "case" "condp" "if-let" "when-let"]
             "compare" [#'= #'not= "and" "or" #'not]
             "comments" ["#_(...)" "comment" "; ..."]}

   "functions" {"create" ["fn" "defn" #'identity #'constantly #'comp #'partial]
                "arrange" ["->" "->>"]}

   "numbers" {"literals"   ["1" "-1.5"]
              "arithmetic" [#'+ #'- #'* #'/ #'max #'min #'inc #'dec]
              "compare"    [#'== #'not= #'< #'> #'<= #'>=]
              "random"     [#'rand #'rand-int]}

   "strings" {"create"     ["\"some-text\"" #'str]
              "use"        [#'count
                            #'clojure.string/join
                            #'clojure.string/split
                            #'clojure.string/replace]
              "letters"    [#'clojure.string/upper-case
                            #'clojure.string/lower-case
                            #'clojure.string/capitalize]
              "regex"      ["#\"some-pattern\""
                            #'re-find
                            #'re-matches
                            #'re-pattern
                            #'clojure.string/replace]
              "test"       [#'clojure.string/blank?
                            #'clojure.string/includes?]}

   "atoms" {"create" [#'atom]
            "change" [#'swap! #'reset!]
            "read" ["@" #'deref]}

   "js interop" {"create" ["#js { }" "#js [ ]"]
                 "shorthand" ["." ".." "doto"]
                 "properties" ["aget" "set" "aset"]
                 "convert" ["cljs->js" "js->clj"]}

   ; COLLECTIONS

   "sequences" {"misc" [#'map
                        #'map-indexed
                        #'reduce
                        #'apply
                        #'count
                        #'some
                        #'group-by]
                "create" [#'repeat
                          #'range]
                "loop" ["for" "doseq"]
                "longer" [#'conj
                          #'concat]
                "test" [#'some?
                        #'empty?
                        #'every?]
                "shorter" [#'filter
                           #'remove
                           #'rest
                           #'drop
                           #'keep]
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
                         #'nth
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

; OTHER

"literals" {"create" ["true" "false" "nil"]
            "test " [#'true? #'false? #'nil?]}

"keywords" {"create"    [":some-keyword"
                         ":some-ns/some-keyword"
                         #'keyword]
            "->str"     [#'name
                         #'namespace]}

"io" {"files" ["spit"
               "slurp"]
      "*out*" [#'println #'clojure.pprint/pprint]}

"repl" ["*1" "clojure.repl/pst"]})
