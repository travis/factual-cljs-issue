(defproject factual-cljs-issue "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[tvachon/factual-clojure-driver "1.5.2"]
                 [org.clojure/clojurescript "0.0-3196" :scope "provided"]]

  :plugins [[lein-cljsbuild "1.0.5"]]
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :compiler {:output-to "target/main.js"}}]})
