package NyetHack

fun main() {
    var swordJuggling: Int? = null
    val isJuhhlingProficient = (1..3).shuffled().last() == 3
    if (isJuhhlingProficient) {
        swordJuggling = 2
    }
    proficiencyCheck(swordJuggling)
    swordJuggling = swordJuggling!!.plus(1)

    println("$swordJuggling 개의 칼로 저글링합니다!")
}

fun proficiencyCheck(swordJuggling : Int?) {
    checkNotNull(swordJuggling, {"플레이어가 저글링을 할 수 없음"})
//    swordJuggling ?: throw IllegalStateException("플레이어가 저글링을 할 수 없음")
}
