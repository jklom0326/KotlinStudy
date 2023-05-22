package part3

fun main() {
    noParam({ "Hello World" })
    noParam { "Hello World" }

    oneParam { a -> "Hello World $a" }
    oneParam { "Hello World $it" }

    moreParam { _, b -> "Hello World! $b" }
}

fun noParam(out: () -> String) = println(out())
fun oneParam(out: (String) -> String) = println(out("OneParam"))
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam","TwoParam"))
}