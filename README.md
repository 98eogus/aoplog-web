# aoplog-web

# Spring AOP Logging Practice (Pure Spring + XML 설정)

이 프로젝트는 순수 Spring Framework 기반에서 AOP와 로그 파일 저장 실습을 진행한 예제입니다.

## 📌 주요 기술

- Spring Framework (DispatcherServlet 수동 등록)
- AOP (@Aspect + @AfterReturning)
- Logback (파일 및 콘솔 로그 출력)
- Maven (WAR 패키징)
- REST API (Controller + Service 구조)
- 외부 톰캣 수동 배포

## 🛠 기능 요약

| 기능 | 설명 |
|------|------|
| `/test` | 서비스 로직 호출 후 AOP 로그 출력 및 JSON 응답 반환 |
| AOP 로깅 | 서비스 메서드 호출 직후 로그를 콘솔 + 로그파일로 출력 |
| Logback 설정 | `logback.xml`을 통해 logs/aoplog.log 파일에 기록 |

## 🔧 실행 방법

1. `mvn clean package`로 WAR 생성
2. 외부 Tomcat `webapps/`에 `.war` 파일 복사
3. `startup.bat` 실행
4. [http://localhost:8090/app/test](http://localhost:8090/app/test) 호출

## 📁 프로젝트 구조
aoplog-web/
├── src/
│ ├── main/
│ │ ├── java/… (Controller, Service, AOP)
│ │ ├── resources/logback.xml
│ │ └── webapp/
│ │ ├── WEB-INF/
│ │ │ ├── web.xml
│ │ │ ├── root-context.xml
│ │ │ └── servlet-context.xml
├── logs/
│ └── aoplog.log
├── pom.xml
└── README.md
