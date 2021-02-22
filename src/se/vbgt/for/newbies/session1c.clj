(ns se.vbgt.for.newbies.session1c
  (:import (java.util Date)))

(System/getProperty "some-value")
(System/getenv "PATH")


; Date x = new Date();
(def my-date (Date.))

my-date
; x.setMonth(7)
(.setMonth my-date 7)
my-date

(.getMonth my-date)

; fun metadata

(defn example-fn
  "This is a text about example-fn"
  [the-way]
  (println "this is the way" the-way)
  )


