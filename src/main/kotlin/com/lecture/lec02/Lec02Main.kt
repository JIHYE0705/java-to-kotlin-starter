package com.lecture.lec02

fun main() {
    val str: String? = "ABC"
    println(str?.length ?: 0)

    val person = Person("jihye")
    println(startWithA(person.name))

}

fun startsWithA1(str: String?): Boolean {   // null 이 반환되면 안되기 때문에 `?` 붙여주지 안흔다
    return str?.startsWith("A") ?: throw IllegalArgumentException("null 이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? { // null 반환이 가능하기 때문에 `?` 붙여준다
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")    // 혹시나 null 이 들어오면 NPE 발생
}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}