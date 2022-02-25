// composite function using closure

Closure toInt = {String v ->
    v.toInteger()
}

Closure twice = {Integer v ->
    v * 2
}

Closure getData = {
    "123"
}

assert 246 == twice(toInt(getData()))

// composite
Closure cf1 = getData >> toInt >> twice
Closure cf2 = twice << toInt << getData

assert 246 == cf1()
assert 246 == cf2()
