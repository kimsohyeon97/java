package sub1;
/*
 * 날짜 : 2025/01/02
 * 이름 : 김철학
 * 내용 : Java 조건문 if 실습하기
 */
public class IfTest {
	public static void main(String[] args) {
		//if
		int num1 =1;
		int num2 = 2;
		if(num1<num2) {
			System.out.println("num1은 num2 보다 작다.  ");
		}
		
		for (int i=10; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
	}
}
