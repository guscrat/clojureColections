(ns loja.aula5
  (:require [loja.db :as l.db]
            [loja.logic :as l.logic]))

; KEEP -> returns boolean
(defn gastou-bastante?
  [info-do-usario]
  (> (:preco-total info-do-usario) 500))

(let [pedidos (l.db/todos-os-pedidos)
      resumo (l.logic/resumo-por-usuario pedidos)]
  (keep gastou-bastante? resumo))

(defn gastou-bastante?
  [info-do-usuario]
  (println "gastou-bastante?" (:usuario-id info-do-usuario))
  (> (:preco-total info-do-usuario) 500))