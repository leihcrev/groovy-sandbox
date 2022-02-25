def a = 1
def b = 0.1
def c = "hello groovy"
// type of def variable is Object

println a
println b
println c
println a.class
println b.class
println c.class

// assignable because def variable is Object variable
a = c
println a
println a.class

// typed variable
Integer x = 1
Double y = 0.1
String z = "Hello, Groovy!"

println x
println y
println z
