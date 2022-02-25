// use List like Optional
def emptyList = []
def filledList = ["yeay"]

// meta programming
List.metaClass.orElse = {def alternativeValue ->
    println delegate
    println delegate.class
    delegate ? delegate.head() : alternativeValue
}

println emptyList.orElse(99)
println filledList.orElse(99)
println emptyList.class
