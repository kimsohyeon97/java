package ch07;

public class MathTest {
	public static void main(String[] args) {
		System.out.println("절대값 : "+Math.abs(-5));
		System.out.println("제곱값 : "+Math.sqrt(9));
		System.out.println("올림값 : "+Math.ceil(1.2));
		System.out.println("올림값 : "+Math.ceil(1.8));
		System.out.println("내림값 : "+Math.floor(1.2));
		System.out.println("내림값 : "+Math.floor(1.8));
		System.out.println("반올림값 : "+Math.round(1.2));
		System.out.println("반올림값 : "+Math.round(1.8));
		
		double num1 = Math.random();
		System.out.println("num1 : "+num1); //0~1 사이 실수
		
		double num2 = num1*10;
		System.out.println("num2 : "+num2); //0~10 사이 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3); //1~10 사이 정수

		double rand = Math.ceil(Math.random()*10);
		System.out.println("rand : "+rand);
		
		double random = Math.ceil(Math.random()*45);
		System.out.println("random : "+random);
		
		//46에서 100 random
		double random2 = Math.ceil(Math.random()*(100-46)+46);
		System.out.println("random2 : "+random2);
		
		int random3 = (int)(Math.random()*(100-46+1))+46;
		System.out.println("random3 : "+random3);
	}
}
