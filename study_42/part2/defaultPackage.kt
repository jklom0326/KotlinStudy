package part2

import part2.edu.Person as User

fun main() {
    val user1 = User("Sangwan", 27)
    val user2 = Person("A123", "Sangwan")

    println(user1.name)
    println(user2.name)
}
class Person(val id:String,val name: String)