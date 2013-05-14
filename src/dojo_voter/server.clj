(ns dojo-voter.server
  (:require [noir.server :as server]))

(server/load-views-ns 'dojo-voter.views)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (prn "SERVER STARTING ON PORT" port)
    (server/start port {:mode mode
                        :ns 'dojo-voter})))

