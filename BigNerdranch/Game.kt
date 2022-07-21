package Part03.NyetHack

import NyetHack.Player

fun main() {
    val name = "마드리갈"
    val healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    // 아우라
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0 * 20).toInt())
    val auraColor = when(karma) {
        in 0..5 ->"RED"
        in 6..10 ->"ORANGE"
        in 11..15 ->"PURPLE"
        in 16..20 ->"GREEN"
        else -> "NONE"
    }


    val healthStatus = when (healthPoints) {
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

    println("Aura: $auraColor")
    println("Blessed: ${if (isBlessed) "YES" else "NO"}")
    println("$name $healthStatus")

}