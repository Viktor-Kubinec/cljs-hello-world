(ns viktor.core
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [compojure.core :refer [GET POST ANY defroutes]]
            [hiccup.core :as hic]
            [hiccup.page :as page]))

(defroutes app
  (GET "/" [] (page/html5 [:div
                           (page/include-js "/resources/js/viktor.js")]))
  (route/resources "/resources"))