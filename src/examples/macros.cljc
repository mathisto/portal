(ns ^:no-doc examples.macros
  #?(:cljs (:require-macros examples.macros)))

#?(:clj  (defmacro read-file [file-name] (slurp file-name))
   :cljr (defmacro read-file [file-name] (slurp file-name :enc "utf8")))
