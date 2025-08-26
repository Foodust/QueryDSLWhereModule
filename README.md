# QueryDSL Where Module

🚀 QueryDSL 동적 쿼리 조건문을 간편하게 생성할 수 있는 유틸리티 모듈입니다.

## 📖 개요

복잡한 QueryDSL의 `BooleanBuilder`와 `BooleanExpression` 조건문 작성을 단순화하고, 반복적인 null 체크 로직을 제거하여 더 깔끔한 코드를 작성할 수 있도록 도와줍니다. Spring Boot 프로젝트에서 QueryDSL을 사용할 때 동적 쿼리 생성을 더욱 효율적으로 처리할 수 있습니다.

## ✨ 주요 기능

### 문자열 검색 조건
- **like 검색**: 앞/뒤/양쪽 패턴 매칭
  - `likeSide()`: 양쪽 와일드카드 (`%text%`)
  - `likeLeft()`: 왼쪽 와일드카드 (`%text`)
  - `likeRight()`: 오른쪽 와일드카드 (`text%`)
- **OR/AND 결합 검색**: 여러 필드를 동시에 검색
  - `likeSideOr()`, `likeSideAnd()`
  - `likeLeftOr()`, `likeLeftAnd()`
  - `likeRightOr()`, `likeRightAnd()`

### 일치/비교 조건
- **동등 비교**: `is()` - 다양한 타입 지원 (String, Integer, Long, Double, Float, Boolean, Character)
- **크기 비교**: `lt()` - less than 조건
- **포함 조건**: `in()` - List 내 값 포함 여부

### 날짜 관련 조건
- `date()`: 날짜 동등 비교
- `dateGoe()`, `dateGt()`: 날짜 이후 조건
- `dateLoe()`, `dateLt()`: 날짜 이전 조건
- `dateBetween()`: 날짜 범위 조건

### 정렬
- `order()`: 동적 정렬 조건 생성

### 🎯 특징
- **Null-Safe**: 모든 메서드가 null 입력을 안전하게 처리
- **타입 안정성**: 제네릭을 활용한 타입 세이프 구현
- **Spring 통합**: `@Component`로 Spring Bean 등록 가능
- **가독성**: 직관적인 메서드 네이밍으로 코드 가독성 향상

## 📦 설치 방법

### JitPack을 통한 설치

#### Gradle

```gradle
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.Foodust:QueryDSLWhereModule:1.0'
}
