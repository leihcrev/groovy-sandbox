// List

List list = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]

for (/*def */i = 0, n = list.size(); i < n; i++) {
    println list[i]
}

list.each { // closure
    println it // it is implicit variable
}

// change variable name of closure
list.each {val ->
    println val
}

// typed variable
list.each {Integer i ->
    println i
}

// collect returns new list closure result
println list.collect {
    it * 2
}
println list // list is reserved

println list.inject {a, b -> // sum
    a + b
}

println list.inject {a, b -> // max
    a > b ? a : b
}

println list.find { // returns first hit element only
    it % 2 == 0
}

println list.findAll { // returns all hits
    it % 2 == 0
}

