package part6.secion1.user

class User(_id: Int, _name: String, _age: Int){
    val id: Int = _id
        get() = field

    var name: String= _name
    get()=field
    set(value){
        field= value
    }

    var age: Int =_age
    get() = field
    set(value){
        field=value
    }
}

fun main() {
    val user1 = User(1, "kildong", 30)
    user1.age = 35 // 세터작동
    println("user1.age = ${user1.age}") // 게터동작

}