package part3

fun main() {
    withArgs("Arg1", "Arg2", {a, b -> "Hello World! $a $b"})
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b" }
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a,b))
}