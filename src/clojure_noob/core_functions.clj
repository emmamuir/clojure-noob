(ns clojure-noob.core-functions)

(take 3 [1 2 3 4 5 6 7 8 9 10])

(drop 3 [1 2 3 4 5 6 7 8 9 10])

(def food-journal
  [{:month 1 :day 1 :human 5.3 :critter 2.3}
   {:month 1 :day 2 :human 5.1 :critter 2.0}
   {:month 2 :day 1 :human 4.9 :critter 2.1}
   {:month 2 :day 2 :human 5.0 :critter 2.5}
   {:month 3 :day 1 :human 4.2 :critter 3.3}
   {:month 3 :day 2 :human 4.0 :critter 3.8}
   {:month 4 :day 1 :human 3.7 :critter 3.9}
   {:month 4 :day 2 :human 3.7 :critter 3.6}])

;; returns values which match perdicate
(filter #(< (:human %) 5) food-journal)

;; returns whether food-journal contains values that match the predicate
(some #(< (:month %) 3) food-journal)


(sort [3 1 2])

(sort-by count ["aaa" "c" "bb"])

(concat [1 2] [3 4])

(take 3 (repeatedly (fn [] (rand-int 10))))
;; same as...
(take 3 (repeatedly #(rand-int 10)))

(defn even-numbers
  ([] (even-numbers 0))
  ([n] (cons n (lazy-seq (even-numbers (+ n 2))))))

(take 10 (even-numbers))

(empty? [])

(empty? ["Help!"])
