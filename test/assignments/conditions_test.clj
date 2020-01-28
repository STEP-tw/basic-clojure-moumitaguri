(ns assignments.conditions-test
  (:require [clojure.test :refer :all]
            [assignments.conditions :refer :all]))

(deftest safe-division
  (testing "non zero denominator"
    (is (= 2 (safe-divide 4 2))))
  (testing "zero denominator"
    (is (nil? (safe-divide 3 0))))
)

(deftest informative-division
  (testing "non zero denominator"
    (is (= 2 (informative-divide 4 2)))
   )
  (testing "zero denominator"
    (is (= :infinite (informative-divide 3 0)))
  )
)

(deftest harishchandra-bachan
  (testing "satya bachan"
    (is (= true (harishchandra true)))
    (is (= 4 (harishchandra 4)))
    (is (= true (harishchandra (= 4 4))))
   )
  (testing "asatya bachan"
    (is (= nil (harishchandra nil)))
    (is (= nil (harishchandra false)))
    (is (= nil (harishchandra (= 3 0))))
   )
)

(deftest yudishtira-bachan
  (testing "satya bachan"
    (is (= true (yudishtira true)))
    (is (= 4 (yudishtira 4)))
    (is (= true (yudishtira (= 4 4))))
  )
  (testing "ashwathama bachan"
    (is (= :ashwathama (yudishtira nil)))
    (is (= :ashwathama (yudishtira false)))
    (is (= :ashwathama (yudishtira (= 3 0))))
  )
)

(deftest duplication-of-first-element
  (testing "empty collection"
    (is (= nil (duplicate-first [])))
  )
  (testing "duplication of first element"
    (is (= [1 1] (duplicate-first [1]))) "vector"
    (is (= [1 1 2 3] (duplicate-first [1 2 3])))
    (is (= [1 1] (duplicate-first '(1)))) "list"
    (is (= [1 1] (duplicate-first #{1}))) "set"
  )
)

(deftest five-point-who
  (testing "chetan bhagat"
    (is (= "chetan-bhagat" (five-point-someone 1 5)))
  )
  (testing "satan bhagat"
    (is (= "satan-bhagat" (five-point-someone 5 3)))
  )
  (testing "greece"
    (is (= "greece" (five-point-someone 7 6)))
  )
  (testing "universe"
    (is (= "universe" (five-point-someone 1 1)))
  )
)

(deftest zero-like-value
  (testing "zero"
    (is (= :zero (zero-aliases 0)))
  )
  (testing "empty-vector"
    (is (= :empty (zero-aliases [])))
  )
  (testing "empty-list"
    (is (= :empty (zero-aliases '())))
  )
  (testing "empty-set"
    (is (= :empty-set (zero-aliases #{})))
  )
  (testing "empty-map"
    (is (= :empty-map (zero-aliases {})))
  )
  (testing "empty-string"
    (is (= :empty-string (zero-aliases "")))
  )
  (testing "not-zero"
    (is (= :not-zero (zero-aliases 4)))
  )
)