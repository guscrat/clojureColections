(ns loja.test2)


(def my-list {:mochila {:quantidade 2 :preco-unitario 50}
              :camiseta {:quantidade 5 :preco-unitario 25}})

(defn percorre-my-list
  [[key elemento]]
  (* (elemento :quantidade) (elemento :preco-unitario)))

(map percorre-my-list my-list)