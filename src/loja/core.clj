(ns loja.core
  (:gen-class))

(def myList ["Gustavo" "Cleciane" "Lavinia" "Kedma" "Leonel" "Danilo"])


(defn percorreLista
  [lista]
  (let [elemento (first lista)]
    (if (next lista)
      (do
        (println elemento)
        (percorreLista (next lista)))
      (println elemento))))

(percorreLista myList)