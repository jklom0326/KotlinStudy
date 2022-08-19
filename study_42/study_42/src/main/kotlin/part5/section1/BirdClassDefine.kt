package part5.section1

class Bird { // 1. 클래스의 정의
    //2. 프로퍼티(속성)
    var name: String = "MyBird"
    var wing: Int = 2
    var beak: String = "Short"
    var color: String = "Blue"

    // 3. 메서드(함수)
    fun fly()= println("Fly Wing : $wing")
    fun sing(vol: Int) = println("Sing Vol : $vol")

}

fun main() {
    val coco = Bird()  // 4. 클래스의 생성자를 통한 객체의 생성
    coco.color = "Red" // 5. 객체의 프로퍼티에 값 할당

    println("coco.color : ${coco.color}") // 6. 객체의 멤버 프로퍼티 읽기
    coco.fly()   // 7. 객체의 멤버 메서드 사용
    coco.sing(4)
}