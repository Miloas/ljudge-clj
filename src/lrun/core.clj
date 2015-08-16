(ns lrun.core
  (:require [clojure.string :as string]))

(defn- join-test-cases [list option]
;  "-> join-cmd [1 2 3] "--op"
;   => "--op 1 --op 2 --op 3"
;  "
  (string/join " " (reduce #(conj %1 %2 option) '() list)))

(defn- construct-test-cases [inputs outpus]
  (let [inputstr "--input"
        outputstr "--output"]
    (str (join-test-cases inputs inputstr) " " (join-test-cases outpus outputstr))))

(defn judge
  "max-cpu: max time of cpu use (such as 1.0)
   max-mem: max memory that program can use  (such as 32m)
   user-code: (such as 1000.c)
   test-case-input: A list of test cases input file name (such as [1.in]])
   test-case-output: Same as test-case-input."
  [ & {:keys [max-cpu max-mem user-code test-case-input test-case-output]}]
  ())
