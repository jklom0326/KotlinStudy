package part5.section3

fun main() {
    val calc = Calc()
    println(calc.add(3,2))
    println(calc.add(3.3,2.5))
    println(calc.add(3,2,4))
    println(calc.add("Hello","world"))
}
class Calc{

    fun add(x: Int,y: Int) : Int = x+y
    fun add(x: Double,y: Double) : Double = x + y
    fun add(x: Int,y: Int,z: Int) : Int = x + y + z
    fun add(x: String,y: String) : String = x + y

}