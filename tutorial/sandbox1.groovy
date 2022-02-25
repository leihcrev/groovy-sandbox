def x = (1..10).findAll {
    it % 2 == 0
}.collect {
    it * 2
}.inject {l, r ->
    l * r
}
println x

// filter
def x1 = (1..10).findAll {
    it % 2 == 0
}
println x1

// map
def x2 = x1.collect {
    it * 2
}
println x2

// reduce
def x3 = x2.inject {l, r ->
    l * r
}
println x3
println 4 * 8 * 12 * 16 * 20

// reduce
def x4 = x2.inject {l, r ->
    l + r
}
println x4
println 4 + 8 + 12 + 16 + 20
