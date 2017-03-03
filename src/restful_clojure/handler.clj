(ns restful-clojure.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes app-routes
           (route/not-found "{\"message\":\"Page not found\"}"))

(def app app-routes)