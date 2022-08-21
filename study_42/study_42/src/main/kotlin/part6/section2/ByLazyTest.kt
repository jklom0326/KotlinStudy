package part6.section2

class LazyTest {
    init {
        println("init block") // 2
    }
    val subject by lazy {
        println("lazy initialzied") // 6
        "Kotlin programming"// lazy 반환값
    }
    fun flow() {
        println("not initailized") // 4
        println("subject one : $subject") // 5 최초 초기화 시점
        println("subject two : $subject") // 8 이미 초기화 된 값을 사용
    }
}

fun main() {
    val test = LazyTest() // 1
    test.flow()     // 3
}