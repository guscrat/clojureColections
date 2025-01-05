(ns loja.aula4
  (:require [loja.db :as l.db]
            [loja.logic :as l.logic]))

(l.db/todos-os-pedidos)

(l.logic/resumo-por-usuario (l.db/todos-os-pedidos))


;; sort-by, reverse, get-in ..
(let [resumo (l.logic/resumo-por-usuario (l.db/todos-os-pedidos))
      pedidos (l.db/todos-os-pedidos)]
  (println "Resumo" resumo)
  (println "Ordenado" (sort-by :preco-total resumo))
  (println "Reverse" (reverse (sort-by :preco-total resumo)))

  (println (get-in pedidos [4 :itens :mochila :quantidade])))

;; Implementacao do sort-by e reverse em uma funcao
(defn ordenado-por-usuario-resumo
  [pedidos]
  (->> pedidos
       l.logic/resumo-por-usuario
       (sort-by :preco-total)
       reverse))

;; first, second, rest, count, class, nth, get, take ...
(let [pedidos (l.db/todos-os-pedidos)
      resumo (ordenado-por-usuario-resumo pedidos)]
  (println "Primeiro" (first resumo))
  (println "Segundo" (second resumo))
  (println "Resto" (rest resumo))
  (println "Total/Conta" (count resumo))
  (println "Class/Tipo" (class resumo))
  (println "nth 1/posicao" (nth resumo 1))
  (println "get 1" (get resumo 1)) ; Nao existe a posicao 1, nosso objeto nao permite ser acessado com get. Utilizar o "nth"
  (println "Take" (take 2 resumo)) ; Devolve os N primeiro elementos
  )

;; Filter

(let [pedidos (l.db/todos-os-pedidos)
      resumo (ordenado-por-usuario-resumo pedidos)]
  (println "> 500 filter excluded" (filter #(> (:preco-total %) 500) resumo))
  (println "> 500 filter some" (some #(> (:preco-total %) 500) resumo)))