

interface Person{
	public void hello();
}

class Student implements Person{
	public void hello() {
		System.out.println("Hello Student!");
	}
}

public class FunctionalTest {
	public static void main(String[] args) {
		//객체 지향 프로그래밍
		Person student = new Student();
		student.hello();
		
		//익명객체(인터페이스를 직접 객체로 생성)
		Person developer = new Person() {

			@Override
			public void hello() {
				System.out.println("Hello Developer!");
				
			}
			
		};
		
		developer.hello();
		
		Person teacher = () ->{
			System.out.println("Hello Teacher!");
		};
		
		teacher.hello();
	}

}
