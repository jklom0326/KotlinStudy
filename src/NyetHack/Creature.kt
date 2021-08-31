package NyetHack

import java.util.*

interface Fightable {
    var healthPoints: Int
    val diceCount: Int
    val diceSides: Int
    val damageRoll: Int
        get() = (0 until diceCount).map {
            Random().nextInt(diceSides) + 1
        }.sum()

    fun attack(oppenent: Fightable): Int
}

abstract class Monster(
    val name: String,
    val description: String,
    override var healthPoints: Int) : Fightable {
    override fun attack(oppenent: Fightable): Int {
        val damageDealt = damageRoll
        oppenent.healthPoints -= damageDealt
        return damageDealt
    }
    }