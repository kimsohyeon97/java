# java Repository 소개

#### ch01 ~ ch14 
- 자바 강의별 챕터 **요약** 정리

| 예제 번호 | 클래스명 (패키지)          | 주제           | 핵심 내용 요약                                       |
|-----------|-----------------------------|----------------|------------------------------------------------------|
| 1         | `Hello` (`ch01`)            | 출력 기본       | Java 실행 구조 및 `System.out.println()` 사용        |
| 2         | `PrintTest` (`ch01`)        | 출력 방식 차이  | `print` vs `println`, `\n` 개행 문자 사용           |
| 3         | `VariableTest` (`sub1`)     | 변수/상수       | 변수 선언, 초기화, 상수(`final`) 사용               |
| 4         | `DataTypeTest` (`sub2`)     | 자료형          | 정수, 실수, 문자, 문자열, 논리형 등 기본 자료형 실습 |
| 5         | `OperatorTest` (`sub3`)     | 연산자          | 산술, 비교, 논리, 복합대입, 증감 연산자 사용        |
| 6         | `IfTest` (`sub1`)           | 조건문 if       | 조건에 따른 분기 실행 (`if`, `else if`, `else`)     |
| 7         | ArayTest (sub1)            | 배열                   | 1차원, 2차원, 3차원 배열 선언 및 반복문 활용  |
| 8         | MethodTest (sub2)           | 메서드 기본            | 메서드 정의와 호출, 매개변수와 반환값 사용    |
| 9         | MethodTypeTest (sub2)       | 메서드 타입            | 매개변수/반환값 유무에 따른 4가지 메서드 타입 |
| 10         | MethodOverloadingTest (sub3)| 메서드 오버로딩        | 동일 메서드명에 다양한 매개변수 적용 실습      |
| 11         | Account (sub1)             | 클래스와 객체 기본    | 필드와 메서드 정의, 입금/출금 기능, 상태 출력         |
| 12         | Car (sub1)                 | 클래스와 객체 기본    | 속성 초기화, 속도 증가/감소 기능, 상태 출력            |
| 13         | ClassTest (sub1)           | 객체 생성과 상호작용  | Car, Account 객체 생성, 필드 초기화, 메서드 호출      |
| 14         | Account (sub2)             | 캡슐화와 생성자      | private 필드, 생성자 정의, getter/setter 활용        |
| 15         | Book (sub2)                | 캡슐화와 상태 관리    | 도서 대여/반납 메서드, 복사본 관리, 상태 출력         |
| 16         | Increment (sub3)           | 인스턴스 변수 vs 클래스 변수 | 인스턴스 변수와 static 변수의 차이와 증감 실습      |
| 17         | StaticTest (sub3)          | static 변수/메서드, 싱글톤 | 클래스 변수, 클래스 메서드, 싱글톤 패턴 활용           |
| 18         | StockAccount (sub4)        | 상속과 확장          | Account 상속, 주식 매매 기능 추가, 상태 출력           |
| 19         | Bulb (sub8)                | 인터페이스 활용      | 전구 켜기/끄기 기능 구현                              |
| 20        | InterfaceTest (sub8)       | 인터페이스 실습      | RemoteControl 구현, 다형성, 다중 상속 효과 실습        |
| 21        | RemoteSamsung (sub8)       | 인터페이스 구현      | RemoteControl 인터페이스 구체적 구현                   |
| 22        | Socket (sub8)              | 인터페이스 정의      | 전원 스위치 On/Off 추상 메서드 정의                    |
| 23         | RunnableImp1, RunnableTest (sub1) | Runnable 인터페이스 활용 스레드 | Runnable 구현체로 스레드 작업 수행, Thread에 Runnable 객체 전달하여 실행 |
| 24         | SubThread, ThreadTest (sub1)       | Thread 클래스 상속 스레드      | Thread 클래스 상속하여 직접 스레드 구현, 이름 설정 및 실행             |
| 25         | SUbThread, ThreadInterruptTest (sub2) | 스레드 인터럽트 처리           | 스레드 일시정지 상태에서 interrupt 호출로 종료시키는 방법 시연         |
| 26         | WorkThread, ThreadJoinTest (sub2) | 스레드 상태 및 Join 메서드     | 작업 스레드가 종료될 때까지 메인 스레드가 대기하는 join 사용            |
| 27         | Count (sub3)                     | 스레드 동기화 (synchronized)  | 동기화 메서드로 임계영역 설정, 스레드 간 경합 문제 해결                 |
| 28         | CountThread (sub3)               | 동기화된 Count 객체 공유      | 여러 스레드가 안전하게 공유 객체의 상태를 변경                         |
| 29         | ThreadSyncTest (sub3)            | 동기화된 스레드 작업 실행     | 여러 스레드 실행 후 join으로 종료 대기, 최종 결과 출력                  |
| 30         | Task, ThreadPoolTest (sub4)      | 스레드풀 활용                 | ExecutorService 고정 스레드풀 생성, 작업을 스레드풀에 제출 실행          |
| 31         | WaitNotifyExample (sub5)          | Wait/Notify 동기화           | wait와 notify를 이용한 스레드 간 작업 조율                            |
| 32         | HttpTest (sub1)                       | Java HTTP 통신 (기본) | URL 객체를 이용해 HTTP 요청, 응답을 스트림으로 읽고 파일에 저장하는 기본 HTTP 통신 구현          |
| 33         | HttpclientTest (sub1)                 | Java HTTP 통신 (HttpClient) | Java 11 HttpClient API 사용, GET 요청 보내고 응답 코드와 내용을 출력                           |
| 34         | SocketClient (sub2)                   | 소켓 프로그래밍 (클라이언트) | TCP 소켓 생성, 서버 연결 후 메시지 송신 및 수신 처리 구현                                     |
| 35         | SocketServer (sub2)                   | 소켓 프로그래밍 (서버) | 서버 소켓 생성, 클라이언트 연결 대기 및 수락, 메시지 수신 후 응답 전송                          |
| 36         | ChatClient (sub3)                     | 채팅 프로그램 (클라이언트) | 소켓 연결 후 송신, 수신 스레드 생성하여 동시 채팅 가능 구현                                    |
| 37         | ChatServer (sub3)                     | 채팅 프로그램 (서버)   | 클라이언트 연결 대기 및 수락, 송신과 수신용 스레드 생성하여 양방향 채팅 지원                     |
| 38         | ReceiverThread (sub3)                 | 채팅 수신 스레드      | 소켓 InputStream을 통해 서버/클라이언트로부터 메시지 수신 및 출력                              |
| 39         | SenderThread (sub3)                   | 채팅 송신 스레드      | 키보드 입력을 받아 소켓 OutputStream으로 메시지 송신, "bye" 입력 시 종료                      |
| 40         | JDBCTest (sub1)             | JDBC 접속 테스트 | JDBC 드라이버 로드, MySQL DB 접속 및 연결 성공 여부 확인 |
| 41         | TransactionTest (sub4)      | 트랜잭션 실습   | 트랜잭션 자동 커밋 해제, 여러 쿼리 실행 후 예외 발생 시 롤백 처리  |

#### BankProject
- 은행 시스템 기능 연습

#### CRUDTest
- 데이터 생성·조회·수정·삭제 실습

#### CodingTest 
- 각종 코딩 테스트 문제 풀이

#### JavaTest0 / JavaTestPractice 
- 자바 기본기 다지기

#### PerformTest 
- 성능 테스트 및 최적화 실험

#### Practice 
- 자바와 기타 개발 연습 코드 모음

#### ShopProject 
- 쇼핑몰 기능 구현 프로젝트

#### ThisJava 
- 자바 연습
