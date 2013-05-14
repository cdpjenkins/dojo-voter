(ns dojo-voter.db.entities
  (:use [korma.db]
        [korma.core]
        [environ.core]))

(def dbconfig (if (env :production) 
          {:db "heroku_0f35f4734e8d48c" :host "us-cdbr-east-03.cleardb.com" :user "b92a75f2140f1f" :password (env :database-password)}
          {:db "dojo-voter" :host "localhost" :user "root" :password ""}))

(defdb db (mysql dbconfig))
(defentity topics)