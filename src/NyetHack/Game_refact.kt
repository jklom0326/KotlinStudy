package Part04

import NyetHack.Player
import NyetHack.Room

fun main() {
    val player = Player("Madrigal")
    player.name = "estragon"
    println(player.name + "TheBrave")
    player.castFireball()

    var currentRoom = Room("Foyer")
    println(currentRoom.description())
    println(currentRoom.load())

    // 아우라
//    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
//    val healthStatus = foramtHealthStatus(healthPoints, isBlessed)

    printPlayerStatus(player)
    performCombvat()
    performCombvat("Ulrich")
    performCombvat("Hildr",true)
}

private fun printPlayerStatus(player: Player) {
    println("Aura: ${player.auraColor()}")
    println("Blessed: ${if (player.isBlessed) "YES" else "NO"}")
    println("${player.name} ${player.healthPoints}")
}


fun performCombvat(){
    println("적군이 없다!")
}

fun performCombvat(enemyName: String){
    println("$enemyName 과 전투를 시작함")
}

fun performCombvat(enemyName: String, isBlessed: Boolean){
    if (isBlessed){
        println("$enemyName 과 전투를 시작함. 축복을 받음!")
    } else {
        println("$enemyName 과 전투를 시작함.")
    }
}