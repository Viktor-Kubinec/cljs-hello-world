(defproject viktor "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]
                 [org.clojure/clojurescript "0.0-2665"]
                 [domina "1.0.2"]]
  :source-paths ["src/clj" "src/cljs"]
  :plugins [[lein-ring "0.8.10"] [lein-cljsbuild "1.0.4"]]
  :ring {:handler viktor.core/app }
  :cljsbuild {:builds
              [{:source-paths ["src/cljs"]
                :compiler {;; CLS generated JS script filename
                           :output-to "resources/public/js/viktor.js"
                           :optimizations :advanced
                           :pretty-print false}}]})
