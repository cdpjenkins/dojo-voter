(ns dojo-voter.server
  (:require [noir.server :as server]))

(server/load-views-ns 'dojo-voter.views)

(defn -main [& [port]]
  (let [port (Integer. (or port 5000))]
    (server/start port {:mode :dev :ns 'dojo-voter})))

