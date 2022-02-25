class SomeClass {
    def someMethod() {
        "Groovy"
    }
}

def someClass = new SomeClass()
// power assert
assert "Groovy" == someClass.someMethod() // pass
assert "groovy" == someClass.someMethod() // fail
