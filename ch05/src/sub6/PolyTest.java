package sub6;

/*
 * 날짜 : 2025/01/10
 * 이름 : 김소현
 * 내용 : Java 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 * 	- 상속 관계에서 부모 클래스의 기능이 자식 클래스에서 다양한 기능으로 변하는 특징
 * 	- 객체(참조 변수) 타입 선언을 부모 클래스 타입으로 선언
 * 	- 다형성을 활용해서 프로그래밍의 중복을 줄이고 통일성과 유연성을 향상 
 */
public class PolyTest {

	public static void main(String[] args) {
		/*
		*강결합했을 경우, 하나하나 선언되어 있음
		*Tiger tiger = new Tiger();
		*Eagle eagle = new Eagle();
		*Shark shark = new Shark();
		
		*tiger.move();
		*eagle.move();
		*shark.move();
		*/
		
		// 다형성을 적용한 객체 생성(업캐스팅), 부모 클래스로 선언하는 것, 부모로 선언하는 게 좋음
		//Animal tiger = new Tiger();
		//Animal eagle = new Eagle();
		//Animal shark = new Shark();
		
		//tiger.move();
		//tiger.hunt();
		
		//eagle.move();
		//eagle.hunt();
		
		//shark.move();
		//shark.hunt();
		
		
		// 다운캐스팅
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		// 타입(캐스팅) 비교연산
		if(a1 instanceof Tiger) {
			
			System.out.println("a1은 Tiger 입니다.");
			
		}else if(a2 instanceof Eagle) {
			
			System.out.println("a2는 Eagle 입니다.");
			
		}else if(a2 instanceof Shark) {
			
			System.out.println("a3는 Shark 입니다.");
			
		}
		
		// 다형성을 활용한 객체 배열
		Animal arr[] = {tiger, eagle, shark};
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		arr[0].hunt();
		arr[1].hunt();
		arr[2].hunt();
		
		//다형성 확인 문제
		Pet dog = new Dog();
		Pet cat = new Cat();
		
		printSound(dog);
		printSound(cat);
		
	}
	
	public static void printSound(Pet pet) {// 다형성이 적용된 메서드 매개변수
		pet.makeSound();
	}
			
}
