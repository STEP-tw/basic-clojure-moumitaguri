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
       (is (= 2 (count' {:a :b :c :d}))) "map"))

   (testing "reverse"
     (is (= [3 2 1] (reverse' [1 2 3])))
     (is (= [3 2 1 0] (reverse' (range 4)))))

   (testing "every"
     (is (= true (every?' even? [0 2 4])))
     (is (= false (every?' odd? [1 2 3])))
     (is (= true (every?' even? []))))

   (testing "some"
     (is (= false (some?' odd? [ 2 4])))
     (is (= true (some?' even? [1 2 3]))))))