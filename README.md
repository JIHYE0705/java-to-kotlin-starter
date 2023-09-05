# 자바 개발자를 위한 코틀린 입문(Java to Kotlin Starter Guide)

## 1강. Kotlin에서 변수를 다루는 방법
- 모든 변수는 `var` / `val` 을 붙여 주어야 한다
  - **var** : 변경 가능하다(변수)
  - **val** : 변경 불가능하다 read-only(상수)
- 타입을 명시적으로 작성하지 않아도, 타입이 추론된다
- Primitive Type 과 Reference Type 을 구분하지 않아도 된다
- Null 이 들어갈 수 있는 변수는 타입 뒤에 `?` 를 붙여주어야 한다 (null 참조에 따라 서로 다른 타입으로 간주 된다)
- 객체를 인스턴트화 할 때 `new` 키워드를 붙이지 않아야 한다

## 2강. Kotlin에서 null 을 다루는 방법
- Kotlin에서 Null 이 들어갈 수 있는 타입은 완전히 다르게 간주된다
  - 한 번 null 검사를 하면 non-null 임을 컴파일러가 알 수 있다
- Null 이 아닌 경우에만 호출되는 **Safe Call** (`?.`) 이 있다
- Null 인 경우에만 호출되는 **Elvis 연산자** (`?:`) 가 있다
- Null 이 절대 아닐 때 사용할 수 있는 **널 아님 단언** (`!!`) 이 있다
- Kotlin 에서 Java 코드를 사용할 때 **플랫폼 타입** 사용에 유의해야 한다
  - Java 코드를 읽으며 Null 가능성 확인 / Kotlin 으로 wrapping
