(ns restful-clojure.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

;; Routes
(defroutes app-routes
           (route/not-found "{\"message\":\"Page not found\"}"))

;; Middleware
(defn wrap-log-info [handler]
  (fn [request]
    (println request)
    (handler request)))

;; Main Handler
(def app
    (-> app-routes
        wrap-log-info))