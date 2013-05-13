(ns dojo-voter.db.entities
  (:use [korma.db]
        [korma.core]))

(defdb dev (mysql {:db "dojo-voter" :host "localhost" :user "root" :password ""}))
(defentity topics)