(ns clojure-noob.trystuff
  (:gen-class))

(str "Hi " "Emma")

(vec '(1 2 3 4))

(list 1 2 3 4)

(hash-map :a 1 :b 2 :c 3)

(hash-set :a :a :b :c :c :c :d :e)

(defn adds100 [n]
  (+ 100 n)
  )

(defn dec-maker [n]
  (dec n)
  )

(defn mapset [v]
  (let new-set set v)
  (inc new-set)
  )