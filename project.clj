(defproject dojo-voter "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]
                           [korma "0.3.0-RC5"]
                           [mysql/mysql-connector-java "5.1.6"]
                           [environ "0.4.0"]]
            :main dojo-voter.server
            :profiles {:production {:env {:production true :port 80}}})

