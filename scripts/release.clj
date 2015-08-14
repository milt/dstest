(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:output-to "release/dstest.js"
     :output-dir "release"
     :source-map "release/map.js.map"
     :optimizations :advanced
     :verbose true
     :pretty-print true
     :pseudo-names true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
