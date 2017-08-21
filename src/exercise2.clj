(ns exercise2)

(defn only-greater-than-five
  "Filters the numbers, keeping only the ones greater than five"
  [coll]
  (filter
   (fn [y] (> y 5) )
     coll)
   )