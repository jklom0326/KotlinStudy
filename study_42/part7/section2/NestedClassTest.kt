package part7.section2

class Outer{
    val ov =5
    class Nested{
        val nv= 10
        fun greeting() = "[Nested] Hello ! $nv"
    }
    fun outside() {
        val msg = Nested().greeting()
        println("[Outer] $msg , ${Nested().nv}")
    }
}

fun main() {
    // static 처럼 Outer의 객체 생성없이 Nested객체를 생성 사용할 수 있음
    val output = Outer.Nested().greeting()
    println(output)

    //Outer().outside // 에러 객체생성 필요
    val outer = Outer()
    outer.outside()
}
