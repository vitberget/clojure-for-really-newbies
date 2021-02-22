(ns se.vbgt.for.newbies.session1)

; Tal
1
1.0
2/5
'100000000000000000000000000000000000000000000000000

; Text
"Hello"
; character
\1

; listor & vektorer
; en lista är länkad lista
(list 1 2 3)
'(1 2 3)
; not a list of numbers (1 2 3)

; en vektor är klump allokerat minne
[1 2 3]


; Funktioner

(+ 1 1)
(+ 10 10 10 10 10 10 10)

(defn hello-there
  [argument1 argument2]
  (println "Hello there" argument1 argument2)
  (* argument1 argument2))

(hello-there 1 2)

; Mappar
{} ; tom map

{:key "value"}

{1 "one"}

{hello-there "is a funktion that does hello"}

{:key 1
 1 "one"
 hello-there "fun fun "}

{:key 1
 :inner-map {:some "thing"
             :more (list 12 3 4 5 )}}

; Manipulera grejer...

(+ 23 43)
(- 45 23)
(* 56 23)

(inc 12)
(dec 12)

(def my-list (list 1 2 3 4 5 6))
my-list

(conj my-list \a)
(cons \a my-list)

(def my-vector [1 2 3 4 5 6])
my-vector

(conj my-vector \a)
(cons \a my-vector)

(concat my-vector [\a \b] my-list)

(first my-list)
(take 3 my-list)
(drop 3 my-list)
(drop 300 my-list)
(take 300 my-list)
(drop-last 2 my-list)

(nth my-list 3)

(def my-map {:key1 1 :key2 2})

(get my-map :key1)
(get my-map :keyyy 432) ; default värde...

(my-map :key1)
(:key1 my-map)

(assoc my-map :the-new-key "kids on the block?")
(assoc my-map :key2 "kids on the block?")

(update my-map :key1 inc)
(update my-map :key1 (fn[val] (* val 10)))

; mutera saker!

(def my-atom (atom {}))

my-atom
@my-atom
(deref my-atom)

(reset! my-atom {:my-key "some vale"
                 :number 1})
@my-atom

(swap! my-atom update :number inc)
@my-atom

; thuthy /falsy
true
false

(when true "I am true")
(when false "I am true")

(if true "I am true" "I am flase")
(if false "I am true" "I am flase")
(if false "no false thingie")

(when nil "is nil truthy?")
(when 100 "is 100 truthy?")

(or "123" "abc")
(or nil "123" "abc")
(or nil "abc" "123")

(and "abc" "123")

; on thingies

(empty? (list))
(empty? (list 1 2 3))
(empty? {})
(empty? {:some "thing"})


; "switch"
(cond
  true 1)

(cond
  false 10
  true 1)

(defn my-little-pcond
  [value]
  (condp = value
    1 "one"
    2 "two"
    3 "three"))

(my-little-pcond 1)
(my-little-pcond 4)

(defn my-little-pcond-with-default
  [value]
  (condp = value
    1 "one"
    2 "two"
    3 "three"

    "unknown"))

(my-little-pcond-with-default 1)
(my-little-pcond-with-default 2)
(my-little-pcond-with-default 4)















































