(ns se.vbgt.for.newbies.session1b)

; lokalt "def"

(let [pi 3.141592]
  (* pi pi))
;pi

(if-let [value 123]
  (str "value was " value)
  "what da fuck?")

(if-let [value false]
  (str "value was " value)
  "what da fuck?")

(def example-list (range 1 1000))
example-list

(filter
  (fn [v] (= (mod v 12) 0))
  example-list)

(map
  (fn [v] (* v 10))
  example-list)

(map
  (fn [v] (* v 10))
  (filter
    (fn [v] (= (mod v 12) 0))
    example-list))

(defn divisible-by-12?
  [v]
  (= (mod v 12) 0))

(defn multiple-ten
  [v]
  (* v 10))

(->> example-list
     (filter divisible-by-12?)
     (map multiple-ten))

(->> example-list
     (filter divisible-by-12?)
     (map multiple-ten)
     (reduce +))

(defn red-thing
  [a b]
  (if (= (mod a 123) 0)
    (*' a b)
    (+' a b)))

(->> example-list
     (filter divisible-by-12?)
     (map multiple-ten)
     (reduce red-thing))

; loopies

(defn n-fak
  [index]
  (loop [inner-index index
         result 1]
    (if (= inner-index 0)
      result
      (recur
        (dec inner-index)
        (*' inner-index result)))))

(n-fak 1)
(n-fak 2)
(n-fak 3)
(n-fak 4)

(defn n-fak-2
  [index]
  (if (= 0 index)
    1
    (*' index (n-fak-2 (dec index)))))

(n-fak-2 3)

(n-fak-2 100000000)
(n-fak 100000000)































