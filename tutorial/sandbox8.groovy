// duck typing example

class Value1{ def test() {"This is Value1 Object"}}
class Value2{ def test() {"This is Value2 Object"}}

class Hoge2 {

    def test(a)  { // a is Object variable
        a.test() // But can call test() -> Duck typing!
    }
}

def obj2 = new Hoge2()

assert obj2.test(new Value1()) == "This is Value1 Object"
assert obj2.test(new Value2()) == "This is Value2 Object"

class Value3{}
obj2.test(new Value3()) // MissingMethodException!
