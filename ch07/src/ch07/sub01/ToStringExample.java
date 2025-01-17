package ch07.sub01;

public class ToStringExample {
	public static void main(String[] args) {

		Object a1 = new ToString("한국", 3000);
		Object a2 = new ToString("한국", 3000);
		ToString a3 = new ToString("미국", 3000);
			
		System.out.println(a1.toString()); //toString() 메서드를 직접 호출
		System.out.println(a2); // toString()메서드를 간접 호출
		System.out.println(a3);
	}
}
