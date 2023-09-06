package com.lecture.lec04

fun main() {
    val javaMoney1 = JavaMoney(2_000L)
    val javaMoney2 = JavaMoney(1_000L)

    if(javaMoney1 > javaMoney2) {   // 객체를 비교할 때 비교 연산자를 사용하면 자동으로 compareTo 를 호출해준다
        println("Money1이 Money2보다 금액이 큽니다")
    }

    /*
    * Java 에서는 동일성에 `==` 를 사용, 동등성에 `equals` 를 직접 호출
    * Kotlin 에서는 동일성에 `===` 를 사용, 동등성에 `==` 를 호출
    * == 를 사용하면 간접적으로 equals 를 호춣해준다
    */

    if(fun1() || fun2()) { // Lazy 연산: 나머지 연산을 하지않아도 결과가 동일 할경우 연산하지않음
        println("본문")
    }

    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    println(money1 + money2)
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}
