package NyetHack

class Player {
    var name = "Madrigal"
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    val healthPoints = 89
    val isBlessed = true
    // 플레이어 클래스 외부에서 사용되지 않기 때문에 캡슐화 해주는게 좋다
    private val isImmortal = false


    fun castFireball(numFireballs: Int = 2) =
        println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")


    fun auraColor(): String {
        val auraVisible = isBlessed && healthPoints > 50 || isImmortal
        val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0 * 20).toInt())
        val auraColor = when (karma) {
            in 0..5 -> "RED"
            in 6..10 -> "ORANGE"
            in 11..15 -> "PURPLE"
            in 16..20 -> "GREEN"
            else -> "NONE"
        }
        return auraColor
    }

    fun foramtHealthStatus() =
        when (healthPoints) {
            100 -> " 최상의 상태임!"
            in 90..99 ->
                " 약간의 찰과상만 있음."
            in 75..89 -> if (isBlessed) {
                " 경미한 상처가 있지만 빨리 치유됨!"
            } else {
                " 경미한 상처만 있음"
            }
            in 15..79 -> "많이 다친 것 같음."
            else -> " 최악의 상태임!"
        }
}