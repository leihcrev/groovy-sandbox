List data = [
    "-5",
    "-4",
    null,
    "-3",
    "-2",
    null,
    "-1",
    "0",
    null,
    "1",
    "2",
    "3",
    null,
    "4",
    "5",
    null
]

// use Optional
def c1 = {List l ->
    l.collect {
        Optional.ofNullable(it)
    }.collect {
        it.map {
            it.toInteger()
        }
    }.collect {
        it.filter {
            it % 2 == 0 && it > 0
        }
    }.collect {
        it.map {
            it * 2
        }
    }.collect {
        it.orElse(0)
    }.sum()
}
println c1(data)

// use safe navigation
def c2 = {List l ->
    l.collect {
        it?.toInteger() ?: 0
    }.findAll {
        it % 2 == 0 && it > 0
    }.collect {
        it * 2
    }.sum()
}
println c2(data)
