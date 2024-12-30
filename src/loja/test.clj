(ns loja.test)

(def pedido1 {:usuario 20,
              :itens
              {:mochila {:id :mochila, :quantidade 2, :preco-unitario 80},
               :camiseta {:id :camiseta, :quantidade 10, :preco-unitario 40},
               :tenis {:id :tenis, :quantidade 1}}})

(defn print-elemento
  [elemento]
  (
   :elemento elemento
  ))

(map print-elemento pedido1)


(def precos [30 700 1000])

(println (get precos 0))
(println (get precos 1))
(println (get precos 2))
(println (get precos 3 nil))