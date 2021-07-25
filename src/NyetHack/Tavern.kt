package NyetHack

import java.io.File
import kotlin.math.roundToInt

const val TAVENR_NAME = "Tearnyl's Folly"

//var playerGold = 10
//var playerSilver = 10
val patronList = mutableListOf("Eli", "Mordoc", "Sophie")
val lastName = listOf("Ironfoot", "Fernsworth", "Beggins")
val uniquePatron = mutableSetOf<String>()
val menuList = File("src/data/tavern-menu-items.txt")
    .readText()
    .split("\r\n")

//val patronGold = mapOf(
//    Pair("Eli", 10.5), Pair("Mordoc", 8.0), Pair("Sophie", 5.5)
//)
val patronGold = mutableMapOf<String, Double>()


fun main() {
    (0..9).forEach {
        val first = patronList.shuffled().first()
        val last = lastName.shuffled().last()
        val name = "$first $last"
        uniquePatron += name
    }

    uniquePatron.forEach {
        patronGold[it] = 6.0
    }

    var orderCount = 0
    while (orderCount <= 9) {
        placeOrder(
            uniquePatron.shuffled().first(),
            menuList.shuffled().first()
        )
        orderCount++
    }
    displayPatronBalances()

//    println(patronGold["Eli"])
//    println(patronGold["Mordoc"])
//    println(patronGold["Sophie"])

    // 파일데이터 가지고와서 출력하기
//    menuList.forEachIndexed { index, data ->
//        println("${index + 1}: $data")
//    }

//    var baverage = readLine()
    // let 사용
//    baverage?.let {
//        baverage = it.capitalize()
//        println(baverage)
//    }?: println("beverage가 null입니다!")
//    placeOrder("elixir,Shirley's Temple, 4.12")

    // list 포함
//    if (patronList.contains("Eli")){
//        println("술집 주인이 말한다: Eli는 안쪽 방에서 카드하고 있어요.")
//    } else{
//        println("술집 주인이 말한다: Eli는 여기에 없어요")
//    }
//
//    if (patronList.containsAll(listOf("Mordoc","Sophie"))) {
//        println("술집 주인이 말한다: 네, 모두있어요")
//    } else {
//        println("술집 주인이 말한다: 아니오, 나간사람도 있습니다.")
//    }

    // list
//    println(patronList)
//    patronList.add("Alex")
//    patronList.remove("Eli")
//    patronList.add(0,"Alex")
//    patronList[0] = "Alexis"
//    println(patronList)
    // list for 사용
//    for (patron in patronList) {
//        println("좋은 밤입니다. ${patron}님")
//    }
    // list forEachIndex
//    patronList.forEachIndexed { index, patron ->
//        println("좋은 밤입니다. ${patron}님 당신은 ${index + 1}번째 손님입니다")
//        placeOrder(patron, menuList.shuffled().first())
//    }
}

//  지불하기
//fun performPurchase(price: Double): Boolean {
//    displayBalance()
//    val totalPurse = playerGold + (playerSilver / 100.0)
//    println("지갑 전체 금액: 금화 $totalPurse")
//    if (totalPurse >= price) {
//        println("금화 $price 개로 술을 구입함")
//        val remainingBalance = totalPurse - price
//        println("남은 잔액: ${"%.2f".format(remainingBalance)}")
//
//        val remainingGold = remainingBalance.toInt()
//        val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
//        playerGold = remainingGold
//        playerSilver = remainingSilver
//        displayBalance()
//    } else {
//        println("돈이 부족해!")
//        return false
//    }
//    return true
//}
//
//fun displayBalance() {
//    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")
//}

// 잔액변경 map을 이용함
fun performPurchase(price: Double, patronName: String) {
    val totalPurse = patronGold.getValue(patronName)
    patronGold[patronName] = totalPurse - price
}

private fun placeOrder(patronName: String, menuData: String) {
    val indexOfApostrophe = TAVENR_NAME.indexOf('\'')
    val tavenMaster = TAVENR_NAME.substring(0 until indexOfApostrophe)
    println("${patronName}은 ${tavenMaster}에게 주문합니다.")

    val (type, name, price) = menuData.split(',')
    performPurchase(price.toDouble(), patronName)
//    if (performPurchase(price.toDouble(), patronName)) {
    val message = "${patronName}은 금화 $price 로 $name ($type)를 구입한다."
    println(message)

    val phrase = if (name == "Dragon's Breath") {
        "${patronName}이 감탄한다 : ${toDragonSpeak("와 $name 진짜 좋구나!")}"
    } else {
        "${patronName}이 말한다: 감사합니다. $name"
    }
    println(phrase)
//    }
}

private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiou]")) {
        when (it.value) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }

private fun displayPatronBalances() {
    patronGold.forEach { patron, balance ->
        println("$patron, balance: ${"%.2f".format(balance)}")
    }
}