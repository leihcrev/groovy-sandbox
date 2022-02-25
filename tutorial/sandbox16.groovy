// Optional

String nullVar = null
Optional<String> optVar = Optional.ofNullable(nullVar)
println optVar.map {
    it.toInteger() * 2
}.orElse(0)

// analyze
Closure twice = {
    it.toInteger() * 2
}
def x = optVar.map twice
println x
println x.getClass()
def y = x.orElse(0)
println y
println y.getClass()

// filter
println optVar.filter {
    it % 2 == 0
}

Optional one = Optional.ofNullable("1")
println one.class
println one.filter {
    it.toInteger() % 2 == 0
}

Optional<String> two = Optional.ofNullable("2")
println two.class
println two.filter {
    it.toInteger() % 2 == 0
}

// safe navigation
println nullVar?.toInteger()
println nullVar?.toInteger()?.class?.name ?: 'this is null'

nullVar = "1"
println nullVar?.toInteger()
println nullVar?.toInteger()?.class?.name ?: 'this is null'
