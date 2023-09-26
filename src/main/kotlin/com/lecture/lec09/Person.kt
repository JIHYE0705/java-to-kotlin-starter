package com.lecture.lec09

fun main() {
    val person = Person("jihye")

    println(person.name)
    person.age = 20

    println(person.age)

    val javaPerson = JavaPerson("jihye2", 10)

    println(javaPerson.name)
    javaPerson.age = 30

    println(javaPerson.age)

    Person()

}

class Person(val name: String, var age: Int) {

    init {
        if(age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }
    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }
    constructor(): this("jihye3") {
        println("두 번째 부생성자")
    }

    val isAdult: Boolean
        get() = this.age >= 20
}

class Person2(val name: String = "jihye", var age: Int = 1) {

    //    val name = name
//        get() = field.uppercase()

//    fun getUppercaseName(): String = this.name.uppercase()


    val uppercaseName: String
        get() = this.name.uppercase()

    init {
        if(age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    val isAdult: Boolean
        get() = this.age >= 20
}

class Person3(name: String = "jihye3", var age: Int = 1) {

    var name = name
        set(value) {
            field = value.uppercase()
        }
    init {
        if(age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    val isAdult: Boolean
        get() = this.age >= 20
}