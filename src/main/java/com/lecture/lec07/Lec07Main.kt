package com.lecture.lec07

import java.lang.NumberFormatException

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {    // exception 타입이 뒤에 위치
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")  // new 키워드 사용하지 않음, 포맷팅이 간결함
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
