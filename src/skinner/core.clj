(ns skinner.core)

; ACC
(def memory (atom 0))
; BAK
(def temp-storage (atom 0))
; make sure that my atoms aren't nil
(defn myswap!
  [myatom fn]
  (if (= (@myatom) nil)
    (reset! myatom 0)
    (swap! myatom fn)))
; Language Parser
(defmulti parse (fn [my-var]
  (first my-var)))
; adds a value to the primary memory
(defmethod parse :ADD [x]
  (myswap! memory (fn [memory] (+ memory (last x)))))
; subtracts a value from the primary memory
(defmethod parse :SUB [x]
  (myswap! memory (fn [memory] (- memory (last x)))))
