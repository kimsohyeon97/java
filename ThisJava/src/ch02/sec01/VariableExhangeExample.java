package ch02.sec01;

// 교재 p40 실습하기
public class VariableExhangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y =5;
		System.out.println("x:" + x + ", y:"+y);
		
		int temp=x;
		x=y;
		y=temp;
		System.out.println("x:" +x+", y:"+y);
	}

}