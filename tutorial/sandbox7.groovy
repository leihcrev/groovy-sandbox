class Hoge {
    Hoge() {
        println "Constructor of Hoge"
    }

    def piyo(/* def */ value) { // 'def' keyword is optional
        println value
    } // piyo returns Object
}

def hoge = new Hoge()
println hoge.piyo('This is my value') // return null
