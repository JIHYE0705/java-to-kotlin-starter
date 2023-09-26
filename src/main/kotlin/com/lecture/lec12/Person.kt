package com.lecture.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    val name: String,
    var age: Int
) {

    /*
    static: 클래스가 인스턴스화 될 때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
    companion object: 클래스와 동행하는 유일한 오브젝트
    */
    companion object Factory : Log {  // Java 의 static 역할
        /*
        companion object, 즉 동반객체도 하나의 객체로 간주된다
        그렇기 때문에 이름을 붙일 수도 있고, interface 를 구현할 수도 있다
        companion object 에 유틸성 함수들을 넣어도 되지만, 최상단 파일읋 ㅘㄹ용하는 것을 추천
         */

        private const val MIN_AGE = 1
        /*
        `const` 키워드가 있으면 컴파일 시에 변수가 할당된다
        진짜 상수에 붙이기 위한 용도
        기본 타입과 String 에 붙일 수 있음
         */
        @JvmStatic  // Java 에서 Kotlin companion object를 사용하려면 붙여줘야 하는 annotation
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory 에요")
        }
    }
}

object Singleton {
    var a: Int = 0
}