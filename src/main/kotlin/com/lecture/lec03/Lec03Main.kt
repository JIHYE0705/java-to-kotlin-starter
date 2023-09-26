package com.lecture.lec03

fun main() {
    val number1: Int? = 3
    val number2: Long =  number1?.toLong() ?: 0L

    val person = Person("jihye", 100)
    println("이름 : ${person.name}")

    val name = "jihye"
    println("이름 : $name")

    val str = """
       ABCD
       EFGH
       ${name}
    """.trimIndent()

    println(str)

    println(str[0])
    println(str[2])
}

fun printAgeIfPerson(obj: Any) {
    if(obj is Person) { // `is` 는 java 의 `instanceof` 와 같은 의미
        println(obj.age)    // 스마트 캐스트
    }

    val person = obj as? Person
    println(person?.age)
}