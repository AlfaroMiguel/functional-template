(ns exercise3)

(defn fibonacci [n]
  "Calculates the fibonacci sequence for n"
  (if(or (= n 0) (= n 1)) n
  (+ (fibonacci (- n 1)) (fibonacci (- n 2)))
    )
)