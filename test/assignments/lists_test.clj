(ns assignments.lists-test
  (:require [clojure.test :refer :all]
            [assignments.lists :refer :all]))


((deftest lists
   ;(testing "map"
   ;  (testing "identity with single coll"
   ;    (is (= [1 2 3] (map' identity [1 2 3])))))

   (testing "filter"
     (is (= [2 4] (filter' even? [1 2 3 4])))
     (is (= [1 3] (filter' odd? (range 4)))))

   (testing "count"
     (testing "count of empty collection"
       (is (= 0 (count' []))))
     (testing "count of non-empty collection"
       (is (= 2 (count' [1 2]))) "vector"
       (is (= 2 (count' '(1 2)))) "list"
       (is (= 2 (count' #{1 2}))) "set"
       (is (= 2 (count' {:a :b :c :d}))) "map"))))