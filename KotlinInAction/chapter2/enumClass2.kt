package chapter2

fun getMnemonic(color: Color) =
    when (color){
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }
fun mix(c1: Color, c2: Color) = // when 식의 인자로 아무 객체나 사용할 수 있다.
    when (setOf(c1, c2)) {      // 이렇게 인자로 받은 객체가 각 분기 조건에 있는 객체와 같은지 테스트한다
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color") // 매치되는 분기 조건이 없으면 이 조건을 실행한다
    }