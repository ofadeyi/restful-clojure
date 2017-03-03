(ns restful-clojure.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :refer [response]]
            [ring.middleware.json :refer :all]))

;; Routes
(defroutes app-routes
           (route/not-found
             (response {:message "Page not found"}) ))

;; Middleware
(defn wrap-log-info [handler]
  (fn [request]
    (println request)
    (handler request)))

;; Main Handler
(def app
    (-> app-routes
        wrap-log-info
        wrap-json-response
        wrap-json-body))