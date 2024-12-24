(ns loja.core
  (:gen-class))


(def myList ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"])

(map println myList)
(rest myList)
(next myList)
(rest [])
(next [])
(seq myList)