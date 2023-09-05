# 자바 개발자를 위한 코틀린 입문(Java to Kotlin Starter Guide)

## 1강. 코틀린에서 변수를 다루는 방법
- 모든 변수는 var / val 을 붙여 주어야 한다
  - var: 변경 가능하다(변수)
  - val: 변경 불가능하다 read-only(상수)
- 타입을 명시적으로 작성하지 않아도, 타입이 추론된다
- Primitive Type 과 Reference Type 을 구분하지 않아도 된다
- Null 이 들어갈 수 있는 변수는 타입 뒤에 `?` 를 붙여주어야 한다
  - 다른 타입으로 간주 된다
- 객체를 인스턴트화 할 때 `new` 키워드를 붙이지 않아야 한다