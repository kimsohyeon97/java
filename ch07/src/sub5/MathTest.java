package sub5;

/*
 * 날짜 : 2025/01/14
 * 이름 : 김소현
 * 내용 : Java Math 클래스 실습하기
 */

public class MathTest {

	public static void main(String[] args) {
		
		// Math m = new Math();
		
		//기본 메서드
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("제곱값 : " + Math.sqrt(9));
		System.out.println("올림값 : " + Math.ceil(1.2));
		System.out.println("올림값 : " + Math.ceil(1.8));
		System.out.println("내림값 : " + Math.floor(1.2));
		System.out.println("내림값 : " + Math.floor(1.8));
		System.out.println("반올림 : " + Math.round(1.2));
		System.out.println("반올림 : " + Math.round(1.8));
		
		// random 메서드
		double num1 = Math.random();		
		System.out.println("num1 : " + num1); // 0~1사이 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); // 0~10사이 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); // 1~10사이 실수
		
		// 1~45사이 임의의 정수
		double rand = Math.ceil(Math.random()*45); // 위 세 문장을 중첩
		System.out.println("rand : " + rand);
	
		
		
		
	}
}
