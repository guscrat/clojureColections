(ns loja.aula4
  (:require [loja.db :as l.db]
            [loja.logic :as l.logic]))

(l.db/todos-os-pedidos)

(l.logic/resumo-por-usuario (l.db/todos-os-pedidos))