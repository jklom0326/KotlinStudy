package kidinterface

interface PersonData {
    val name: String
    val age: Int
}

open class Person(
    override val name: String,
    override val age: Int
) : PersonData

data class Book(val title: String, val author: PersonData) {
    override fun toString(): String = "$title by ${author.name}"
}

class Alias(
    private val realIdentity: PersonData,
    private val newIdnetity: PersonData
) : PersonData by newIdnetity


fun main() {
    val valWatts = Person("valWatts", 30)
    val johnDoe = Alias(valWatts, Person("John Doe", 25))
    val introKotlin = Book("Introduction to Kotlin", valWatts)
    val introjava = Book("Introduction to Java", valWatts)
    println(introKotlin) // Introduction to Kotlin by valWatts
    println(introjava)  //  Introduction to Java by JohnDoe
}