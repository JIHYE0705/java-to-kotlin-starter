# 자바 개발자를 위한 코틀린 입문(Java to Kotlin Starter Guide)

## 1강. Kotlin에서 변수를 다루는 방법
- 모든 변수는 `var` / `val` 을 붙여 주어야 한다
  - **var** : 변경 가능하다(변수)
  - **val** : 변경 불가능하다 read-only(상수)
- 타입을 명시적으로 작성하지 않아도, 타입이 추론된다
- Primitive Type 과 Reference Type 을 구분하지 않아도 된다
- Null 이 들어갈 수 있는 변수는 타입 뒤에 `?` 를 붙여주어야 한다 (null 참조에 따라 서로 다른 타입으로 간주 된다)
- 객체를 인스턴트화 할 때 `new` 키워드를 붙이지 않아야 한다

## 2강. Kotlin에서 Null 을 다루는 방법
- Kotlin에서 Null 이 들어갈 수 있는 타입은 완전히 다르게 간주된다
  - 한 번 null 검사를 하면 non-null 임을 컴파일러가 알 수 있다
- Null 이 아닌 경우에만 호출되는 **Safe Call** (`?.`) 이 있다
- Null 인 경우에만 호출되는 **Elvis 연산자** (`?:`) 가 있다
- Null 이 절대 아닐 때 사용할 수 있는 **널 아님 단언** (`!!`) 이 있다
- Kotlin 에서 Java 코드를 사용할 때 **플랫폼 타입** 사용에 유의해야 한다
  - Java 코드를 읽으며 Null 가능성 확인 / Kotlin 으로 wrapping

## 3강. Kotlin에서 Type 을 다루는 방법
- Kotlin 의 변수는 초기값을 보고 타입을 추론하며, 기본 타입들 간의 변환은 명시적으로 이루어진다
- Kotlin 에서는 `is`, `!is`, `as`, `as?` 를 이용해 타입을 확인하고 캐스팅한다
- Kotlin 의 `Any` 는 Java 의 `Object` 와 같은 최상위 타입이다
- Kotlin 의 `Unit` 은 Java 의 `void` 와 동일하다
- Kotlin 에 있는 `Nothing` 은 정상적으로 끝나지 않는 함수의 반환을 의미한다
- 문자열을 가공할 때 `${변수}` 와 `""""""` 를 사용하면 깔끔한 코딩이 가능하다
- 문자열에서 문자를 가져올 때 Java 의 배열처럼 `[]` 을 사용한다

## 4강. Kotlin에서 연산자를 다루는 방법
- 단항 연산자, 산술 연산자, 산술 대입 연산자 Java 와 같다
- 비교 연산자 사용법도 Java 와 같다
  - 단, 객체끼리도 자동 호출되는 `compareTo` 를 이용해 비교 연산자를 사용할 수 있다
- `in`, `!in` / `a..b` / `a[i]` / `a[i] = b` 와 같이 코틀린에서 새로 생긴 연산자도 있다
- 객체끼리의 연산자를 직접 정의할 수 있다

## 5강. Kotlin에서 조건문을 다루는 방법
- `if` / `if - else` / `if - else if - else` 모두 Java 와 문법이 동일하다
- 단 Kotlin 에서는 Expression 으로 취급된다 -> 때문에 Kotlin 에서는 삼항 연산자가 없다
- Java 의 `switch` 는 Kotlin 에서 `when` 으로 대체되었고, `when` 은 더 강력한 기능을 갖는다

## 6강. Kotlin에서 반복문을 다루는 방법
- for-each 문에서 Java 는 `:`, Kotlin 은 `in` 을 사용한다
- 전통적인 for 문에서 Kotlin 은 `등차수열` 과 `in` 을 사용한다
- 그 외의 for 문 문법은 모두 동일하다
- while 문과 do-while 문은 더욱더 놀랍도록 동일하다

## 7. Kotlin에서 예외를 다루는 방법
- `try-catch-finally` 구문은 문법적으로 완전히 동일하다
  - Kotlin 에서는 `try-catch` 가 expression 이다
- Kotlin 에서 모든 예외는 `Unchecked Exception` 이다
- Kotlin 에서는 `try with resources` 구문이 없다 대신 Kotlin 의 언어적 특징을 활용해 `close` 를 호출해준다

## 8. Kotlin에서 함수를 다루는 방법
- 함수의 문법은 Java 와 다르다
  ```kotlin
  접근지시어 fun 함수이름(파라미터): 반환타입 {
      
  }
  ```
- body 가 하나의 값으로 간주되는 경우 block 을 없앨 수 있고, block 이 없다면 반환 타입을 없앨 수도 있다
  ```kotlin
  fun max(a: Int, b: Int): Int = if(a > b) a else b
  ```
  ```kotlin
  fun max(a: Int, b: Int) = if(a > b) a else b
  ```
- 함수 파라미터에 기본값을 설정해줄 수 있다
- 가변인자에는 `vararg` 키워드를 사용하며, 가변인자 함수를 배열과 호출할 때는 `*` 를 붙여주어야 한다