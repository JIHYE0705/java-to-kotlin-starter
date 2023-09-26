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

## 9. Kotlin에서 class를 다루는 방법
- Kotlin 에서는 필드를 만들면 getter 와 (필요에 따라) setter 가 자동으로 생긴다
  - 때문에 이를 `property` 라고 부른다
  ```kotlin
  class Person { 
    val name: String = "jihye"
    var age: Int = 1
  }
  ```
- Kotlin 에서는 `primary constructor` 가 필수이다
- Kotlin 에서는 constructor 키워드를 사용해 `secondary constructor` 를 추가로 만들 수 있다
  - 단, default parameter 나 정적 팩토리 메소드를 추천한다
- 실제 메모리에 존재하는 것과 무관하게 `custom getter` 와 `custom setter` 를 만들 수 있다
- custom getter, custom setter 에서 무한루프를 막기위해 `field` 라는 키워드를 사용한다
  - 이를 `backing field` 라고 부른다

## 10. Kotlin에서 상속을 다루는 방법
- 상속 또는 구현을 할 때에 ` : ` 을 사용해야 한다
- 상위 클래스 상속을 구현할 때 생성자를 반드시 호출해야 한다
- `override` 키워드를 필수로 붙여야 한다
- 추상 멤버가 아니면 기본적으로 override 가 불가능하다
  - `open` 을 사용해주어야 한다
- 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 얘기치 못한 버그가 생길 수 있다


## 11. Kotlin에서 접근 제어를 다루는 방법

<table>
  <tr>
    <th colspan="2">Java</th>
    <th colspan="2">Kotlin</th>
  </tr>
  <tr>
    <td>public</td>
    <td>모든 곳에서 접근 가능</td>
    <td>public</td>
    <td>모든 곳에서 접근 가능</td>
  </tr>
  <tr>
    <td>protected</td>
    <td>같은 패키지 또는 하위 클래스에서만 접근 가능</td>
    <td>protected</td>
    <td>선언된 클래스 또는 하위 클래스에서만 접근 가능</td>
  </tr>
  <tr>
    <td>default</td>
    <td>같은 패키지에서만 접근 가능</td>
    <td>internal</td>
    <td>같은 모듈에서만 접근 가능</td>
  </tr>
  <tr>
    <td>private</td>
    <td>선언된 클래스 내에서만 접근 가능</td>
    <td>private</td>
    <td>선언된 클래스 내에서만 접근 가능</td>
  </tr>
</table>

- Kotlin 에서 package 는 namespace 관리용이기 때문에 `protected` 는 의미가 달라졌다
- Kotlin 에서는 `default` 가 사라지고, 모듈간의 접근을 통제하는 `internal` 이 새로 생겼다
- 생성자에 접근 지시어를 붙일 때는 `constructor` 를 명시적으로 써주어야 한다
- 유틸형 함수를 만들 때는 파일 최상단을 이용하면 편리하다
- property 의 custom setter 에 접근 지시어를 붙일 수 있다
- Java 에서 Kotlin 코드를 사용할 때 internal 과 protected 는 주의해야 한다

## 12. Kotlin에서 object 키워드를 다루는 방법
- Java 의 static 변수와 함수를 만드려면, Kotlin 에서는 `companion object` 를 사용해야 한다
- companion object 도 하나의 객체로 간주되기 때문에 이름을 붙일 수 있고, 다른 타입을 상속받을 수도 있다
- Kotlin 에서 싱글톤 클래스를 만들 때 `object` 키워드를 사용한다
- Kotlin 에서 익명 클래스를 만들 때 `object : 타입` 을 사용한다

## 13. Kotlin에서 중첩 클래스를 다루는 방법
- 클래스 안에 클래스가 있는 경우 종류는 두 가지 이다
  - (Java 기준) static 을 사용하는 클래스
  - (Java 기준) static 을 사용하지 않는 클래스
- 권장되는 클래스는 static 을 사용하는 클래스이다
- Kotlin 에서는 이러한 가이드를 따르기 위해
  - 클래스 안에 기본 클래스를 사용하면 바깥 클래스에 대한 참조가 없고
  - 바깥 클래스를 참조하고 싶다면, `inner` 키워드를 붙여야 한다
- Kotlin inner class 에서 바깥 클래스를 참조하려면 `this@바깥클래스` 를 사용해야 한다

#### Java
<table>
<tr>
  <td>클래스 안의 static 클래스</td>
  <td>바깥 클래스 참조 없음 <br> 권장되는 유형</td>
</tr>
<tr>
  <td>클래스 안의 클래스</td>
  <td>바깥 클래스 참조 있음</td>
</tr>
</table>

#### Kotlin
<table>
<tr>
  <td>클래스 안의 클래스</td>
  <td>바깥 클래스 참조 없음 <br> 권장되는 유형</td>
</tr>
<tr>
  <td>클래스 안의 inner 클래스</td>
  <td>바깥 클래스 참조 있음</td>
</tr>
</table>