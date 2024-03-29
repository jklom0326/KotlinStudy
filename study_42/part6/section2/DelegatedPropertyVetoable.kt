package part6.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0){ // (1) 초기값은 0
         pror,old,new ->
        new > old  //(2) 조건에 맞지 않으면 거부권 행사
    }

    println(max) // 0
    max = 10
    println(max)  // 10
    //  여기서는 기존값이 새 값보다 크므로 false
    //  따라서 5를 재할당하지 않는다.
    max = 5
    println(max)  // 10
}