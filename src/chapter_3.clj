(ns exercises.chapter-3)

(def name "Emma")
(str "Hi " name)

(vec '(1 2 3 4 5))

(list 1 2 3 4 5)

(hash-map :a 1 :b 2 :c 3)

(hash-set 1 2 3 3 3 4 4 5)

(#(+ 100 %)4)


(defn dec-maker
  [dec-by]
  #(- % dec-by))

(def dec9 (dec-maker 9))

(dec9 10)

(defn mapset
  [op args]
  (into #{} (map op args)))

(mapset inc [1 1 2 2])
