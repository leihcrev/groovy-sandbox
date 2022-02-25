// Groovy Truth
// conditional context evaluation

println([] ? "true" : "false") // false
println([0] ? "true" : "false")
println([0, 0] ? "true" : "false")
println([0, 1, 2] ? "true" : "false")

println([:] ? "true" : "false") // false
println(['a':1, 'b':2] ? "true" : "false")

println(0 ? "true" : "false") // false
println(1 ? "true" : "false")
println(-1 ? "true" : "false")

println("" ? "true" : "false") // false
println(" " ? "true" : "false")
println("hogepiyo" ? "true" : "false")
