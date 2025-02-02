(defproject magnet/payments.stripe "0.3.5-SNAPSHOT"
  :description "A Duct library for interacting with the Stripe API"
  :url "http://github.com/magnetcoop/payments.stripe"
  :license {:name "Mozilla Public License 2.0"
            :url "https://www.mozilla.org/en-US/2.0/"}
  :min-lein-version "2.9.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [integrant "0.8.0"]
                 [http-kit "2.3.0"]
                 [diehard "0.9.4"]
                 [org.clojure/data.json "1.0.0"]
                 [com.stripe/stripe-java "19.23.0"]]
  :deploy-repositories [["snapshots" {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]
                        ["releases"  {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]]
  :profiles {:dev [:project/dev :profiles/dev]
             :profiles/dev {}
             :project/dev {:plugins [[jonase/eastwood "0.3.11"]
                                     [lein-cljfmt "0.6.7"]]}
             :repl {:repl-options {:init-ns magnet.payments.stripe
                                   :host "0.0.0.0"
                                   :port 4001}}})
