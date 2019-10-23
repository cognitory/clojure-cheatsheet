(ns cheatsheet.data
  (:require
    [clojure.data]
    [clojure.string]))

(def data
  (apply array-map
    [; BASICS

     "fundamentals" {"define" ["def" "defonce" "defn" "let" "declare" "ns"]
                     "branch" ["if" "if-not" "if-let" "when" "when-not" "when-let" "cond" "case"]
                     "compare" [#'= #'not= "and" "or" #'not #'compare]}


     "functions" {"create" ["fn" "defn" #'identity #'constantly #'partial #'memoize]
                  "call" [#'apply "->" "->>" "some->" "some->>"]
                  "test" [#'fn?]}

     "atoms" {"create" [#'atom]
              "change" [#'swap! #'reset!]
              "read" ["@" #'deref]}


     "misc" {"repl" ["*1" "*2" "*e" "pst" "pprint"
                     "doc" "source" "require"]
             "print" [#'println #'prn]
             "exceptions" ["throw" "try" "ex-info"]
             "files" ["spit" "slurp"]
             "comments" ["#_(...)" "comment" "; ..."]
             "loop" ["for" "doseq" "dotimes" "while" "loop" "recur"]
             "do" ["do" #'doall]
             #_#_"misc" [#'hash #'clojure.data/diff #'pr-str "read-string"]}

     "booleans & nil" {"create" ["true" "false" "nil"]
                       "test " [#'true? #'false? #'nil? #'some?]}

     "numbers" {"literals"   ["1" "-1.5" "22/7"]
                "arithmetic" [#'+ #'- #'* #'/ #'max #'min #'inc #'dec #'mod]
                "compare"    [#'== #'< #'> #'<= #'>=]
                "random"     [#'rand #'rand-int]
                "test"       [#'zero? #'pos? #'neg? #'even? #'odd? #'number?]}

     "keywords" {"create"    [":some-keyword"
                              ":some-ns/some-keyword"
                              "::keyword-in-current-ns"
                              "::alias/keyword-in-aliased-ns"
                              #'keyword]
                 "->str"     [#'name
                              #'namespace]
                 "test" [#'keyword?]}

     "strings" {"create"     ["\"some text\"" #'str]
                "use"        [#'count
                              #'clojure.string/join
                              #'clojure.string/split
                              #'clojure.string/trim
                              #'clojure.string/reverse
                              #'clojure.string/index-of
                              #'clojure.string/last-index-of]
                "letters"    [#'clojure.string/upper-case
                              #'clojure.string/lower-case
                              #'clojure.string/capitalize]
                "regex"      ["#\"some-pattern\""
                              #'re-find
                              #'re-matches
                              #'re-pattern
                              #'re-seq
                              "re-groups"
                              #'clojure.string/replace
                              #'clojure.string/replace-first]
                "test"       [#'string?
                              #'clojure.string/blank?
                              #'clojure.string/starts-with?
                              #'clojure.string/ends-with?
                              #'clojure.string/includes?]}

     #_#_"js interop" {"create" ["#js { }" "#js [ ]"]
                       "shorthand" ["." ".." "doto"]
                       "properties" ["aget" "set" "aset"]
                       "convert" ["cljs->js" "js->clj"]}

     ; COLLECTIONS

     "collections" {"misc" [#'map
                            #'map-indexed
                            #'mapcat
                            #'reduce
                            #'count
                            #'group-by
                            #'flatten
                            #'partition
                            #'partition-all
                            #'partition-by
                            #'split-at
                            #'split-with]
                    "create" [#'repeat
                              #'range
                              #'repeatedly
                              #'iterate
                              #'into]
                    "longer" [#'conj
                              #'concat
                              #'cycle
                              #'interleave
                              #'interpose]
                    "test content" [#'empty?
                                    #'some
                                    #'not-any?
                                    #'distinct?
                                    #'every?
                                    #'not-every?]
                    "shorter" [#'filter
                               #'remove
                               #'keep
                               #'rest
                               #'distinct
                               #'dedupe
                               #'take
                               #'take-last
                               #'take-nth
                               #'drop
                               #'drop-while]
                    "reorder" [#'shuffle
                               #'reverse
                               #'sort
                               #'sort-by]
                    "extract one" [#'nth
                                   #'first
                                   #'second
                                   #'last
                                   #'rand-nth
                                   #'some]}

     "vectors" {"create" ["[]"
                          #'vector
                          #'vec]
                "examine" ["(your-vec idx)"
                           #'nth
                           #'get
                           ".indexOf"]
                "change" [#'conj
                          #'pop
                          #'subvec
                          #'assoc
                          #'assoc-in
                          #'update
                          #'update-in]
                "test" [#'vector?]}

     "maps" {"create" ["{}" #'group-by #'frequencies #'zipmap]
             "examine" ["(some-map key)"
                        "(key some-map)"
                        #'get
                        #'get-in
                        #'contains?
                        #'keys
                        #'vals]
             "change" [#'assoc
                       #'assoc-in
                       #'dissoc
                       #'merge
                       #'merge-with
                       #'select-keys
                       #'update
                       #'update-in
                       #'clojure.set/rename-keys]
             "test" [#'map?]}

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

     #_#_"symbols" {"create" ["some.symbol" "some.ns/some-symbol" #'symbol]
                    "test" [#'symbol?]}

     ]))
