package sub2;

/*
 * 날짜 : 2024/12/31
 * 이름 : 김소현
 * 내용 : Java 자료형 실습하기
 * 중요 int, long, double, boolean, String
 */

public class DataTypeTest {

	public static void main(String[] args) {
		
		//정수형 int, long 중요, 사용 많음
		byte  NUM1 = 127; // -128~127, 127 이상 저장 X 넘침
		short NUM2 = 32767; // -32768~32767, 32767 이상 저장 X 넘침
		int   NUM3 = 2147483647;
		long  NUM4 = 9223372036854775807L; //long 뒤에는 L을 붙인다. 규칙.
		
		System.out.println("NUM1 : " + NUM1);
		System.out.println("NUM2 : " + NUM2);
		System.out.println("NUM3 : " + NUM3);
		System.out.println("NUM4 : " + NUM4);
		
		//실수형(소수점)
		float  var1 = 0.123456789f; // float 뒤에는 f를 붙인다. 규칙. 반올림 되어서 출력됨.
		double var2 = 0.123456789123456789;
		
		System.out.println("var1 : " + var1); // 소수점 8자리까지 출력
		System.out.println("var2 : " + var2); // 소수점 17자리까지 출력
		
		//논리형
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		//문자형
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		//문자열
		String word1 = "A";
		String word2 = "가";
		String word3 = "Apple";
		String word4 = "가을";
		
		System.out.println("word1 : " + word1);
		System.out.println("word2 : " + word2);
		System.out.println("word3 : " + word3);
		System.out.println("word4 : " + word4);
		
		
	}
	
}
