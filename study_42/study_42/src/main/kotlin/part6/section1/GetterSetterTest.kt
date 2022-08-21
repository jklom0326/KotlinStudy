package part6.secion1.property2

// 주 생성자에 3개의 매개변수 정의
class User(_id: Int, _name: String, _age: Int){
    //프로퍼티들
    val id: Int = _id           // 불변(읽기전용
    var name: String = _name    // 가변
    var age: Int = _age         // 가변
}

class User2(val id :Int, var name: String, var age: Int)
// 간소화 가능함

fun main() {
    val user = User(1, "Sean", 30)

    val name = user.name // 게터에 의한 값 획득

    user.age = 41   // 세터에 의한 값지정
    println("name: $name, ${user.age}")
}