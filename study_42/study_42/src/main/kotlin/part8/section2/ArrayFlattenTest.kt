package part8.section2

fun main() {
    val numbers = arrayOf(1,2,3)
    val strs = arrayOf("one","two","three")
    val simplArray = arrayOf(numbers, strs)
    simplArray.forEach { println(it) }

    val flattenSimpleArray = simplArray.flatten()
    println(flattenSimpleArray)
}
