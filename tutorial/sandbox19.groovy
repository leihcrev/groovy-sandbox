// setter, getter convension

class Hoge {
    String name
    String piyo

    Hoge(String name) {
        this.name = name
    }

    def setName(String name) {
        this.name = "${name}!!"
    }

    def getName() {
        "${name}??"
    }

    def setPiyo(Integer piyo) {
        this.piyo = "[${piyo}]"
    }
}

def hoge = new Hoge("test")
println hoge.name

hoge.name = "test1"
println hoge.name

hoge.piyo = 1
println hoge.piyo
hoge.piyo = "@"
println hoge.piyo
hoge.piyo = "moge" // GroovyCastException
println hoge.piyo
