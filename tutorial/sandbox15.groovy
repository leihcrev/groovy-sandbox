// Map

Closure echo = {
    println it
    println it.class // Map literal -> LinkedHashMap?
}

Map map1 = [foo: "bar", bar: "foo"]
println map1.class // why null??
map1.each echo
map1.each {
    println "key = ${it.key} / value = ${it.value}"
}
println map1.foo
println map1.bar
println map1.class // is equivalent of map1.get('class') -> null
println map1.getClass()

List listOfMap = [
    ["name": "hoge", age: 20],
    ["name": "fuga", age: 25],
    ["name": "moge", age: 30],
    ["name": "piyo", age: 35],
]

listOfMap.each {
    println it.name
    println it.age
}