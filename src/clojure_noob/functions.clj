(ns clojure-noob.functions
  (:gen-class))

(map (fn [name] (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"])

(def my-special-multiplier (fn [x] (* x 3)))

(#(* % 3) 8)

(map #(str "Hi, " %)
     ["Darth Vader" "Mr. Magoo"])

(#(str %1 " and " %2) "cornbread" "butter beans")
; => "cornbread and butter beans"

(#(identity %&) 1 "blarg" :yip)

(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))
