(ns loja.test
  (:require [loja.db :as l.db]))

(defn valor-por-item
  [[_ key]]
  (* (get key :quantidade 0) (get key :preco-unitario 0)))

(defn percorre-pedido
  [item]
  (reduce + (map valor-por-item item)))

(defn retorna-itens
  [itens]
  (->> itens
       (map :itens)
       (map percorre-pedido)
       (reduce +)))

(defn retorna-pedios
  [[usuario elementos]]
  {:usuario usuario
   :quantidade-de-pedidos (count elementos)
   :preco-total (retorna-itens elementos)})

(->> (l.db/todos-os-pedidos)
     (group-by :usuario)
     (map retorna-pedios)
     (sort-by :preco-total)
     (reverse))