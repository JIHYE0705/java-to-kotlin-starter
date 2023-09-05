package com.lecture.lec01

fun main() {
    var number1 = 10L   // 변수 일때 var
    val number2 = 10L   // 상수 일때 val -> java 의 final

    /*
    컴파일러가 타입을 추론할 수 없는 경우(변수 선언 후 값을 넣어주지 않았을 때) 는 타입을 명시해주어야함
     */
    var number3 = 1_000L // 코틀린에서는 Primitive Type 과 Reference Type 의 구분이 없음 -> Kotlin 이 상황에 따라서 맞게 처리

    /*
    변수를 nullable 로 만들어주고 싶다면 `타입?` 으로 변수의 타입을 지정해준다
     */

    var person = Person("jihye") // java 의 `new` 키워드를 사용하지 않음
}
