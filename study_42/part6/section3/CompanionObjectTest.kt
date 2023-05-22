package part6.section3

class Person {
    var id: Int = 0
    var name: String = "Hansangwan"
    companion object {
        var language: String = "Korean"
        fun work(){
            println("studying....")
        }
    }
}

fun main() {
    println(Person.language)
    Person.language = "English"
    println(Person.language)
    Person.work()
}