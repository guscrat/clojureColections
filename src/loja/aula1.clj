(ns loja.aula1)


(def myList ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"])
(def myListWFalse ["daniela" false "carlos" "paulo" "lucia" "ana"])


(map println myList)
(first myList)
(first nil)
(rest myList)
(next myList)
(rest [])
(next [])
(seq myList)


;; TAIL RECURSION
(defn printaFirst
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (if (not (nil? primeiro))
      (do
        (funcao primeiro)
        (recur funcao (rest sequencia))))))

(printaFirst println myList)
(printaFirst println myListWFalse)
(printaFirst println [])
(printaFirst println (range 8000))