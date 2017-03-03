(ns restful-clojure.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :refer :all]
            [restful-clojure.handler :refer :all]))

(deftest test-app
  (testing "users endpoint"
    (let [response (app (request :get "/users"))]
      (is (= (:status response) 200))
      (is (= (get-in response [:headers "Content-Type"]) "application-json"))))

  (testing "lists endpoint"
    (let [response (app (request :get "/lists"))]
      (is (= (:status response) 200))
      (is (= (get-in response [:headers "Content-Type"]) "application-json"))))

  (testing "not-found route"
    (let [response (app (request :get "/bogus-route"))]
      (is (= (:status response) 404)))))