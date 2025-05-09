# where-module

QueryDSL 조건 생성을 간편하게 도와주는 유틸리티 라이브러리입니다.  
복잡한 BooleanBuilder, BooleanExpression 조건 구문을 깔끔하고 재사용 가능한 방식으로 처리할 수 있습니다.

## ✨ 주요 기능

- `like`, `eq`, `lt`, `gt`, `between`, `in`, `order` 등 QueryDSL 조건 메서드 제공
- null-safe 조건 생성
- OR / AND 조합 지원

## 📦 설치 방법 (JitPack 사용)

### 1. `repositories` 설정

```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}
