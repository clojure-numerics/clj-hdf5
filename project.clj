(defproject clj-hdf5 "0.2.1"
  :description "HDF5 interface for Clojure based on JHDF5"
  :url "https://github.com/clojure-numerics/clj-hdf5"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot [clj-hdf5.core]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [net.mikera/core.matrix "0.3.0"]
                 [cisd/jhdf5 "13.06.2"]
		 ;Figure out what is needed from old contrib
                 ;[org.clojure/clojure-contrib "1.2.0"]
                 ]
  :repositories {"project" "file:repo"}
  :plugins [[codox "0.6.4"]])
