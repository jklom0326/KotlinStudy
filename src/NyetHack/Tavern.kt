package NyetHack

import kotlin.math.roundToInt

const val TAVENR_NAME = "Tearnyl's Folly"

var playerGold = 10
var playerSilver = 10

fun main() {
//    var baverage = readLine()
//
//    baverage?.let {
//        baverage = it.capitalize()
//        println(baverage)
//    }?: println("beverage가 null입니다!")
    placeOrder("shandy,Dragon's Breath,15.91")
//    placeOrder("elixir,Shirley's Temple, 4.12")
}

fun performPurchase(price : Double): Boolean {
    displayBalance()
    val totalPurse = playerGold + (playerSilver / 100.0)
    println("지갑 전체 금액: 금화 $totalPurse")
    if (totalPurse >= price) {
        println("금화 $price 개로 술을 구입함")
        val remainingBalance = totalPurse - price
        println("남은 잔액: ${"%.2f".format(remainingBalance)}")

        val remainingGold = remainingBalance.toInt()
        val remainingSilver = (remainingBalance%1*100).roundToInt()
        playerGold = remainingGold
        playerSilver = remainingSilver
        displayBalance()
    } else {
     println("돈이 부족해!")
        return false
    }
    return true
}

fun displayBalance() {
    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")
}

private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVENR_NAME.indexOf('\'')
    val tavenMaster = TAVENR_NAME.substring(0 until indexOfApostrophe)
    println("마드리갈은 $tavenMaster 에게 주문합니다.")

//    val data = menuData.split(',')
//    val type = data[0]
//    val name = data[1]
//    val price = data[2]
    val (type, name, price) = menuData.split(',')
   if (performPurchase(price.toDouble())){
       val message = "마드리갈은 금화 $price 로 $name ($type)를 구입한다."
       println(message)

       val phrase = if (name =="Dragon's Breath"){
           "마드리갈이 감탄한다 : ${toDragonSpeak("와 $name 진짜 좋구나!")}"
       } else {
           "마드리갈이 말한다: 감사합니다. $name"
       }
       println(phrase)
   }
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