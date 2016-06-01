(defn square [x]
  (* x x))

(defn abs [x]
  (cond
    (< x 0) (- x)
    (= x 0) 0
    (> x 0) x))

(defn average [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn good-enough? [guess x]
  (< (abs
       (- (square guess) x))
     0.001))

(defn check [guess x]
  (if (good-enough? guess x)
    guess
    (check (improve guess x) x)))

(defn sqrt [x] (check 1 x))
