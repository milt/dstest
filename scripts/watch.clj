(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'dstest.core
   :output-to "out/dstest.js"
   :output-dir "out"})
