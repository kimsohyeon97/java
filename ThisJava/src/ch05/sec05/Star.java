package ch05.sec05;

public class Star {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			
			for(int j=i; j<5;j++) {
				System.out.print(" ");
			}
			for(int h=1; h<=2*i-1;h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i>=1;i--) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int h=1;h<=2*i-1;h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
