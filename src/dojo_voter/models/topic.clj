(ns dojo-voter.models.topic
  (:use [korma.core]
        [dojo-voter.db.entities]))

(defn save
  [{:keys [topicname]}]
(insert topics 
  (values {:name topicname :votes 0})))