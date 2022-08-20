package part5.section2.bird

// 주 생성자가 없고 여러개의 부 생성자를 가진 클래스
class Bird {
    // 프로퍼티
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 첫 번째 부 생성자
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    // 두 번째 부 생성자
    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "gray"
    }

}