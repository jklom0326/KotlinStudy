package part6.section3

// (1) object 키워드를 사용한 방식
object OCustomer {
    var name = "JoonSik"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init!")
    }
}

// (2) 컴패니언 객체를 사용한 방식
class CCustomer {
    companion object{
        const val HELLO = "hello" // 상수표현
        var name = "Chanho"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun greeting() = println("Hello World!")
     }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting() // 객체의 접근시점
    OCustomer.name = "Inuk"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}
