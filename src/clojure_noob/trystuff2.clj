(ns clojure-noob.trystuff2)

(def application {:name "emma"
                  :age 21
                  :address {
                            :number 31
                            :street "Smith Street"
                            :town   "Paisley"
                            :postcode "P11 4HN"
                            }})

;; get the name out of the application   (:name application)
;; get the number out of the address (:number (:address application))

(let [name (:name application)
      age  (:age  application)
      number (:number (:number (:address application)))])



#_(let [{name :name
       age :age :as all} application]
  (prn "My name is " name "and I am " age ". This is all the info from my application " application))

;; shortened version of destructuring
(let [{:keys [name age]} application]
     (prn "Hi I'm " name "and I'm " age))

#_(defn print-coordinates-1 [point]
  (let [x (first point)
        y (second point)
        z (last point)]
    (println "x:" x ", y:" y ", z:" z)))


(defn print-coordinates-2 [point]
  (let [[x y z] point]
    (println "x:" x ", y:" y ", z:" z)))
;;(print-coordinates-2 [2 3 4])

(def john-smith {:f-name "John"
                 :l-name "Smith"
                 :phone "555-555-5555"
                 :company "Functional Industries"
                 :title "Sith Lord of Git"})

(defn print-contact-info [{:keys [f-name l-name phone company title]}]
  (println f-name l-name "is the" title "at" company)
  (println "You can reach him at" phone))

;;(print-contact-info john-smith)
