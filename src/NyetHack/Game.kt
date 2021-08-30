package Part04

import NyetHack.Player
import NyetHack.Room
import NyetHack.TownSquare

fun main() {

    Game.play()
}

object Game {
    private val player = Player("Madrigal")
    private var currentRoom: Room = TownSquare()

    init {
        println("방문을 환영합니다.")
        player.castFireball()
    }

    fun play() {
        while (true) {
            // 게임 시작
            println(currentRoom.description())
            println(currentRoom.load())
            // 플레이어 상태 출력
            printPlayerStatus(player)

            print("> 명령을 입력하세요: ")
            println("최근 명령: ${GameInput(readLine()).processCommand()}")
            println()
        }
    }

    private class GameInput(arg: String?) {
        private val input = arg ?: ""
        val command = input.split(" ")[0]
        val argument = input.split(" ").getOrElse(1, { "" })

        fun processCommand() = when (command.toLowerCase()) {

            else -> commandNotFound()
        }

        private fun commandNotFound() = "적합하지 않은 명령입니다!"
    }

    private fun printPlayerStatus(player: Player) {
        println("Aura: ${player.auraColor()}")
        println("Blessed: ${if (player.isBlessed) "YES" else "NO"}")
        println("${player.name} ${player.healthPoints}")
    }
}

fun performCombvat() {
    println("적군이 없다!")
}

fun performCombvat(enemyName: String) {
    println("$enemyName 과 전투를 시작함")
}

fun performCombvat(enemyName: String, isBlessed: Boolean) {
    if (isBlessed) {
        println("$enemyName 과 전투를 시작함. 축복을 받음!")
    } else {
        println("$enemyName 과 전투를 시작함.")
    }
}