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

;; TRAIN LOOP 1
(defn conta-loop
  [array]
  (loop [total-ate-agora 0
         elementos-restantes array]
    (if (seq elementos-restantes)
      (recur (inc total-ate-agora) (next elementos-restantes))
    total-ate-agora)))

(conta-loop myList)

;; TRAIN LOOP 2
(defn conta-loop2
  [array]
  (loop [step 0
         rest_array array]
    (if (seq rest_array)
      (recur (inc step) (next rest_array))
      step)))

(conta-loop2 myList)

;; TRAIN LOOP 3
(defn conta-loop3
  [array]
  (loop [step 0
         next_array array]
    (if (seq array)
      (recur (inc step) (next array))
      step)))



(conta-loop2 myList)

;; TAIL RECURSSION
(defn conta-recur
  [init array] 
  (if (seq array)
    (recur (inc init) (next array))
    init))

(conta-recur 0 myList)