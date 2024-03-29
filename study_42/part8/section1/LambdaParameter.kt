package part8.section1

fun <T> add(a: T , b: T, op:(T,T) -> T): T{
    return op(a,b)
}

fun main() {
    val result1 = add(2,3,{a,b -> a+b})
    val result2 = add(2,3){a,b -> a+b}
    println(result1)
    println(result2)
}
