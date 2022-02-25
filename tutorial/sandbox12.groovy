// Closure

// define closure
Closure clj = {
    println "Hello Closure!"
}

Closure clj2 = {String value ->
    println "Hello ${value}!"
}

// execute closure
clj()
clj2('hogepiyo')

// arg of each() method is Closure
Closure echo = {
    println it
}
[1, 2, 3].each(echo)
[1, 2, 3].each echo // () is optional
[1, 2, 3].each({println it})
[1, 2, 3].each {println it} // () is optional
