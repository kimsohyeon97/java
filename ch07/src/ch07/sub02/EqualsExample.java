package ch07.sub02;

public class EqualsExample {
	public static void main(String[] args) {
		
		Object a1 = new Equals("한국", 3000);
		Object a2 = new Equals("한국", 3000);
		Object a3 = new Equals("미국", 3000);
		
		if(a1 == a2) 
			System.out.println("객체 a1, a2 참조변수 주소값이 같다.");
		else
			System.out.println("객체 a1, a2 참조변수 주소값이 다르다.");
	
		if(a1.equals(a2)) 
			System.out.println("객체 a1, a2가 인스턴스 서로 같다.");
		else
			System.out.println("객체 a1, a2 인스턴스가 서로 다르다.");
		
	}

}
