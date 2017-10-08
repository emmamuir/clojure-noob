(ns clojure-noob.regex
  (:gen-class))

(re-find #"^left-" "left-eye")

(re-find #"^left-" "cleft-chin")

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-")
   :size (:size part)})

;;(matching-part {:name "left-eye" :size 1})

