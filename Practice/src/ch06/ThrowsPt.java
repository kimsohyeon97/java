package ch06;

public class ThrowsPt {

	public static void main(String[] args) {
		try {
			method1(10);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
	}

}
