package com.lecture.lec14

fun main() {
    val dto1 = PersonDto("jihye", 10)
    val dto2 = PersonDto("jihye", 20)
    println(dto1)
    println(dto2)

}
data class PersonDto(   // Java 에서는 JDK16 부터 data class 같은 record class 를 도입
    /*
        `data` 키워드를 붙여주면 equals, hashCode, toString 을 자동으로 생성해준다
        `named argument` 까지 활용하면 builder pattern 을 쓰는 것 같은 효과도 있다
     */
    val name: String,
    val age: Int
)