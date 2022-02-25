// closure
def sigma = {Integer k, Integer to, Closure exp ->
    (k..to).collect {
        exp(it) // what is Closure? single arg function?
    }.sum()
}
def ans = sigma(1, 5) {it + 2}
println ans

// assertion
assert 25 == ans
