(ns loja.aula2)

(def myList ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"])


(defn conta
  [total elementos]
  (println total elementos)
  (if (next elementos)
    (recur (inc total) (next elementos))
    (inc total)))

(conta 0 myList)
