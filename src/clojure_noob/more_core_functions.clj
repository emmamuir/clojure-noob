(ns clojure-noob.more-core-functions)


;; into

(map identity {:sunlight-reaction "Glitter!"})

(into {} (map identity {:sunlight-reaction "Glitter!"}))

(map identity [:garlic-clove :garlic-clove])

(into #{} (map identity [:garlic-clove :garlic-clove]))

(into {:favorite-emotion "gloomy"} [[:sunlight-reaction "Glitter!"]])

;; conj

(conj [0] [1])
;; should use...
(conj [0] 1)

(conj {:time "midnight"} [:place "ye olde cemetarium"])


;; apply

(max [0 1 2])
;; should use...
(apply max [0 1 2])



;; partial

(def add10 (partial + 10))

(def add-missing-elements
  (partial conj ["water" "earth" "air"]))

;;  call with (add-missing-elements "gold" "silver")

;;  Use 'complement' to get the negation of a Boolean function

