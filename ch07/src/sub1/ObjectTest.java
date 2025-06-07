package sub1;

/*
 * 날짜 : 2025/01/14
 * 이름 : 김소현
 * 내용 : Java Object 클래스 실습하기
 */
public class ObjectTest {

	public static void main(String[] args) {
		
		// 자바 최상위 클래스 object로 다형성
		// a1과 a2는 Object 타입으로 선언되었지만, 실제로는 Apple 객체를 참조하고 있음
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		// toString() 메서드를 직접 호출
		// a1의 Apple 객체 정보 출력 -> Apple [country=한국, price=3000]
		System.out.println(a1.toString());
		
		// 간접적으로 toString() 메서드 호출
		// System.out.println(a2);와 같이 객체를 출력하면 내부적으로 toString()이 호출됨
		// a2의 Apple 객체 정보 출력 -> Apple [country=일본, price=2000]
		System.out.println(a2);
		
		// 객체 비교
		// '==' 연산자는 객체의 **주소값**을 비교하기 때문에 실제 내용이 같아도 다른 객체일 수 있음
		if(a1 == a2) {
			System.out.println("객체 a1, a2 참조변수 주소값이 같다");
		}else {
			System.out.println("객체 a1, a2 참조변수 주소값이 다르다");
		}
		
		// equals()는 객체의 내용을 비교하는 메서드
        // 기본적으로 Object 클래스의 equals()는 '=='와 동일하게 동작하지만,
        // 오버라이드를 통해 두 객체의 내용이 같은지 비교할 수 있도록 재정의 할 수 있음
		if(a1.equals(a2)) { // a1과 a2의 내용이 동일한지 비교
			System.out.println("객체 a1, a2 인스턴스가 서로 같다.");
		}else {
			System.out.println("객체 a1, a2 인스턴스가 서로 다르다.");
		}
		
		// 객체 해시값 출력
        // hashCode()는 객체의 고유한 해시값을 반환. 내용에 따라 다르게 생성됨
		System.out.println(a1.hashCode()); // a1 객체의 해시값 출력
		System.out.println(a2.hashCode()); // a2 객체의 해시값 출력
		
		
	}	
}





