(ns dstest.core
  (:require [clojure.browser.repl :as repl]
            [datascript :as d]))

(enable-console-print!)

(let [db (-> (d/empty-db)
             (d/db-with [ { :db/id 1, :name  "Ivan", :age   15 }
                          { :db/id 2, :name  "Petr", :age   37 }
                          { :db/id 3, :name  "Ivan", :age   37 }
                          { :db/id 4, :age 15 }]))]
  (print (d/q '[:find ?e
                :where
                [?e :name]] db)))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))
