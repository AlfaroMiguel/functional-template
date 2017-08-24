(ns exercise4)

(defn summary [seq]
  "Adds up the numbers in the sequence and returns the value"
  (reduce + seq)
  )