(ns loja.logic 
  (:require
    [loja.db :as l.db]))

(defn total-do-item
  [[item-id detalhes]]
  (* (get detalhes :quantidade 0) (get detalhes :preco-unitario 0)))

(defn total-do-pedido
  [pedido]
  (reduce + (map total-do-item pedido)))

(defn total-dos-pedidos
  [pedidos]
  (->> pedidos
       (map :itens)
       (map total-do-pedido)
       (reduce +)))

(defn pedidos-por-usuario
  [[usuario pedido]]
  {:usuario usuario
   :quantidade-pedidos (count pedido)
   :preco-total (total-dos-pedidos pedido)})

(defn resumo-por-usuario 
  [pedidos]
  (->> pedidos
       (group-by :usuario)
       (map pedidos-por-usuario)))