package sub3;

/*
 * 날짜 : 2024/12/31
 * 이름 : 김소현
 * 내용 : Java 연산자 실습하기
 */

public class OperatorTest {
	public static void main(String[] args) {
		
		//산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2;
		int result5 = num4 % num2;
		
		
		System.out.println("result : " + result1);
		System.out.println("result : " + result2);
		System.out.println("result : " + result3);
		System.out.println("result : " + result4);
		System.out.println("result : " + result5);
		
		//증감연산자
		int num=0;
		System.out.println("num : " +num);
		
		num++;
		System.out.println("num : " +num);
		
		++num;
		System.out.println("num : " +num);
		
		num--;
		System.out.println("num : " +num);
		
		--num;
		System.out.println("num : " + num);
		
		//복합대입연산자
		int n1=1, n2=2, n3=3, n4=4;
		n1+=1;
		n2-=2;
		n3*=3;
		n4/=4;
		
		System.out.println("n1 : " +n1);
		System.out.println("n2 : " +n2);
		System.out.println("n3 : " +n3);
		System.out.println("n4 : " +n4);
		
		//비교연산자
		
		//논리연산자
	}

}
