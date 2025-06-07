package test01;


public class Test03 {
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;	
		
		result = num++;
		System.out.println(result);
		
		result = ++num;
		System.out.println(result);
		
		result = num--;
		System.out.println(result);
		
		result = --num;
		System.out.println(result);
	}

}
