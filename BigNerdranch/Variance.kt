class Barrel<out T>(val item: T)

fun main() {
    var fedoraBarrel: Barrel<Fedora> = Barrel(Fedora("평범한 중절모", 15))
    var lootBarrel: Barrel<Loot> = Barrel(Coin(15))
    lootBarrel = fedoraBarrel
    // 타입이 달라서 오류가뜸
    // lootBarrel의 타입은 Barrel<Loot>
    // fedoraBarrel의 타입은 Barrel<Fedora>

    val myFedora: Fedora = lootBarrel.item

}