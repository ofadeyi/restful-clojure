(defproject restful-clojure "0.1.0-SNAPSHOT"
  :description "Following the 'Writing a RESTful web service in Clojure'"
  :url "https://kendru.github.io/restful-clojure/2014/02/16/writing-a-restful-web-service-in-clojure-part-1-setup/"
  :min-lein-version "2.0.0"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.5.0"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [compojure "1.5.1"]]

  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler restful-clojure.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}}
  )
