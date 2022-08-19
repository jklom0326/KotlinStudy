package part5.section2.secondary

class Bird{
    // 1. 프로퍼티 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String
    // 2. 부생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(name: String, wing: Int, beak: String, color: String){
        this.name = name // 3.this.name은 선언된 현재 클래스의 프로퍼티를 나타냄
        this.wing = wing
        this.beak = beak
        this.color= color
    }
    fun fly() = println("Fly Wing : $wing")
    fun sing(vol: Int)= println("Sing Vol: $vol")
}

fun main() {
    val coco = Bird("MyBird",2,"Short","yellow") // 4. 생성자의 인자로 객체 생성과 동시에 초기화
    coco.color = "blue"
    println("coco.color: ${coco.color} ")
    coco.fly()
    coco.sing(7)
}