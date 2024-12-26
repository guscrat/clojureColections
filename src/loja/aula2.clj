(ns loja.aula2)

(def myList ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"])


(defn conta
  [total elementos]
  (if (seq elementos)
    (recur (inc total) (next elementos))
    total))

(conta 0 myList)


(defn minha-funcao
  ([parametro1] (println "p1" parametro1))
  ([parametro1 parametro2] (println "p2" parametro1 parametro2)))


(minha-funcao 1)
(minha-funcao 1 2)




(defn conta
  ([elementos] 
   (conta 0 elementos))

  ([total elementos]
   (if (seq elementos)
     (recur (inc total) (next elementos))
     total)))

(conta myList)
(conta [])

