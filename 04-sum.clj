(defn + [x y]
  (if (= x 0)
    y
    (inc (+ (dec x) y))))

; (+ 3 4)
; (inc (+ 2 4))
; (inc (inc (+ 1 4)))
; (inc (inc (inc (+ 0 4))))
; (inc (inc (inc 4)))
; (inc (inc 5))
; (inc 6)
; 7

; time = O(x)
; space = O(x)
