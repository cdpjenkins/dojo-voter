(ns dojo-voter.server
  (:require [noir.server :as server])
  (:use [environ.core]))

(server/load-views-ns 'dojo-voter.views)

(defn -main [& [port]]
  (prn "ENV" (env :production) "PORT" (env :port))
  (let [port (Integer. (or port (env :port) 5000))]
    (server/start port {:mode :dev :ns 'dojo-voter})))

