package sub1;

// Car 클래스 정의(설계)
public class Car {

	// 속성(멤버 변수)
	String name;
	String color;
	int speed;
		
	// 기능(멤버 메서드)
	public void speedUp(int speed) {
		// 속성 speed에 매개변수값 대입. 현재 클래스를 지칭.
		this.speed += speed; // this=멤버 지칭
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
}
