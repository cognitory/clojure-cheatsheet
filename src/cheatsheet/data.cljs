(ns cheatsheet.data)

(def data
  {"literals" ["true" "false" "nil"]

   "numbers" {"create"     ["1" "-1.5" #'int #'long]
              "arithmetic" [#'+ #'- #'* #'/ #'max #'min #'inc #'dec]
              "compare"    [#'= #'< #'> #'<= #'>=]
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

   "keywords" {"create"    ["#'some-keyword"
                            "#'some-ns/some-keyword"
                            #'keyword]
               "->str"     [#'name
                            #'namespace]}

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
            "read" ["@" #'deref]}})
