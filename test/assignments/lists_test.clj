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
       (testing "vector"
         (is (= 2 (count' [1 2]))))
       (testing "list"
         (is (= 2 (count' '(1 2)))) "list")
       (testing "set"
         (is (= 2 (count' #{1 2}))) "set")
       (testing "map"
         (is (= 2 (count' {:a :b :c :d}))) "map")))

   (testing "reverse"
     (is (= [3 2 1] (reverse' [1 2 3])))
     (is (= [3 2 1 0] (reverse' (range 4)))))

   (testing "every"
     (is (= true (every?' even? [0 2 4])))
     (is (= false (every?' odd? [1 2 3])))
     (is (= true (every?' even? []))))

   (testing "some"
     (is (= false (some?' odd? [ 2 4])))
     (is (= true (some?' even? [1 2 3]))))

   (testing "sum-of-adjacent-numbers"
     (is (= [3 5] (sum-of-adjacent-digits [1 2 3]))))

   (testing "difference"
     (is (= [4 5] (difference [1 2 3] [2 3 4 5]))))

   (testing "union"
     (is (= [1 2 3 4 5] (union [1 2 3] [2 3 4 5]))))

   (testing "sqr-of-the-first"
     (is (= [16 16 16] (sqr-of-the-first [ 4 5 6]))))

   (testing "muted-thirds"
     (is (= [0 1 0 3 4 0] (muted-thirds (range 6)))))

   (testing "index-of"
     (is (= -1 (index-of [1 2 3] 5)))
     (is (= 2 (index-of [ 1 2 3 4] 3))))
   ))