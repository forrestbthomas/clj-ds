(ns clj-ds.core
  (:gen-class))

(defn two-sum [nums target]
  (let [nums-idx (map-indexed (fn [k v] [k v]) nums)]
    (for [n nums-idx
          x nums-idx
      :let [a (get n 1)
            b (get x 1)
            a-idx (get n 0)
            b-idx (get x 0)
            result (+ a b)]
      :when (and (= target result) (not (= a-idx b-idx)))]
      a-idx)))

(defn weird-adding [s]
  (let [re-fn (fn [st] (clojure.string/replace st #" |-|\(|\)|>" ""))
        spl (clojure.string/split s #" \+ ")
        nums (map (comp read-string (partial apply str) reverse re-fn) spl)
        is (reduce + nums)
        result (apply str (interpose " -> " (str is)))]
    (str "(" result ")")))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
