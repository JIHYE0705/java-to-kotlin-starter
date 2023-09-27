package com.lecture.lec15

fun main() {
    var array = arrayOf(100, 200)

    for(i in array.indices) {
        println("$i ${array[i]}")
    }

    array = array.plus(300)

    for((index, value) in array.withIndex()) {
        println("$index $value")
    }

    /*
        우선 불변 리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸기
     */

    val numbers = listOf(100, 200)
    val mutableNumbers = mutableListOf(100, 200)    // 가변 리스트
    mutableNumbers.add(300)

    val emptyList = emptyList<Int>()

    printNumbers(emptyList)

    println(numbers[0])

    for(number in numbers) {
        println(number)
    }

    for((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

private fun printNumbers(numbers: List<Int>) {

}