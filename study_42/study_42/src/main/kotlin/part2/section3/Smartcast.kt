package part2.section3

fun main() {
    var test: Number = 12.2 // 12.2 에 의해 test는 Float형으로 스마트캐스트
    println("$test")

    test = 12 // Int형으로 다시 스마트캐스트
    println("$test")
    test = 120L //Long형으로 스마트캐스트
    println("$test")
    test += 12.0f // Float형으로 스마트캐스트
    println("$test")

    val s = readLine()!!.toString()
    println(isLetterSting(s))
}

fun isLetterSting(s: String?):Boolean {
    // 널 검사를하면 Stiring? 타입도 쓸 수 있다.
    if (s == null) return false

    // s는 여기서 null이 될 수 없다.
    if(s.isEmpty()) return false

    for (ch in s) {
        if (!ch.isLetter()) return false
    }
    return true
}