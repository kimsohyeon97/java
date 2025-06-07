package sub1;

// 암묵적으로 Object 클래스 상속, 지금까지 했던 모든 클래스들이 암묵적으로 object를 상속받고 있음
public class Apple {

	private String country;
	private int price;
	
	// 생성자: Apple 객체를 초기화
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	// toString() 메서드 오버라이드: 객체의 정보를 문자열로 반환
    // Object 클래스의 toString()을 재정의하여 객체의 내용을 쉽게 확인할 수 있도록 구현
	// 마우스 오른쪽 - 소스 - 제너레이트 투 스트링
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	

	
	
}
