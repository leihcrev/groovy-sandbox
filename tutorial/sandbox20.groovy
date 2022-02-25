// trait
// trait can have some fields
// trait can implemented methods

trait Human {
    // default fields
    String name = "Human"
    public Integer age = 43
    private String twitter = "@human"

    // default methods
    public String speak() {
        "I am ${name}"
    }

    public Integer getAge() {
        age
    }

    public String getTwitter() {
        twitter
    }
}

class Man implements Human { // trait implements
    String name = "Man"
    public String getTwitter() {
        "@man"
    }
}

def man = new Man()
println man.speak()
println man.name
println man.age
println man.Human__twitter
println man.twitter
