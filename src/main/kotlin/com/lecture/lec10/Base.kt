package com.lecture.lec10

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}

/*
상속 관련 키워드 4가지 정리
1. final : override 를 할 수 없게 한다. default 로 보이지 않게 존재한다.
2. open : override 를 열어 준다.
3. abstract : 반드시 override 해야 한다.
4. override : 상위 타입을 override 하고 있다.
 */