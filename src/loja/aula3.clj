(ns loja.aula3
  (:require [loja.db :as l.db]))


(defn preco-por-pedido
  [itens-do-pedido]
  itens-do-pedido)

(defn pedidos-por-usuario
  [[usuario pedido]]
  {:usuario usuario
   :quantidade-pedidos (count pedido)
   :preco-total (preco-por-pedido pedido)})

(->> (l.db/todos-os-pedidos)
     (group-by :usuario)
     (map pedidos-por-usuario))