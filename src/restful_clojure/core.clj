(ns restful-clojure.core
  (:require [compojure.core :refer :all]))

(defn- str-to [number]
  (apply str (interpose  ", " (range 1 (inc number)))))

(defn- str-from [number]
  (apply str (interpose  ", " (reverse (range 1 (inc number))))))

(defroutes app
           (GET "/count-to/:to" [to] (str-to (Integer. to)))
           (GET "/count-from/:from" [from] (str-from (Integer. from))))