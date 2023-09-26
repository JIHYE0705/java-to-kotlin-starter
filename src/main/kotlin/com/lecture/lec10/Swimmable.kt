package com.lecture.lec10

interface Swimmable {

    val swimAbility: Int
        get() = 3

    fun act() {
        println(swimAbility)
        println("어푸 어푸")
    }
}
