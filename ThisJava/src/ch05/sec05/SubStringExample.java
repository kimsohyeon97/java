package ch05.sec05;

public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String intNum1 = ssn.substring(0,6);
		String intNum2 = ssn.substring(7);
		
		System.out.println(intNum1);
		System.out.println(intNum2);
	}

}
