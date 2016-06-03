(defn + [x y]
  (if (= x 0)
    y
    (+ (dec x) (inc y))))

; (+ 3 4)
; (+ 2 5)
; (+ 1 6)
; (+ 0 7)
; 7

; time = O(x)
; space = O(1)
