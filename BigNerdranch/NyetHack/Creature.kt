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
// 추상클래스는 인스턴스가 생성되지 않는다.
abstract class Monster(
    val name: String,
    val description: String,
    override var healthPoints: Int
) : Fightable {
    override fun attack(oppenent: Fightable): Int {
        val damageDealt = damageRoll
        oppenent.healthPoints -= damageDealt
        return damageDealt
    }
}

class Goblin(
    name: String = "Goblin",
    description: String = "초 공격적인 고블린",
    healthPoints: Int = 20
) : Monster(name, description,healthPoints){
    override val diceCount: Int = 2
    override val diceSides: Int = 8

}