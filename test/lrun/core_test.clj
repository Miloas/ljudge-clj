(ns lrun.core-test
  (:require [clojure.test :refer :all]
            [lrun.core :refer :all]
	    [clojure.java.shell :refer [sh]]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 (sh "ls")))))
