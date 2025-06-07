package practice;

public class practiceTest {

	public static void main(String[] args) {
		Car sonata = new Car("소나타", "검정", 0);
		
		sonata.speedUp(50);
		sonata.speedDown(30);
		sonata.show();
		
		sonata.setColor("흰색");
		sonata.show();
		
		Book B1 = new Book("자바의 정석", "남궁성", 0);
		
		B1.increasePrice(5000);
		B1.show();
		
		Book B2 = new Book("안녕", "허허", 0);
		
		B2.increasePrice(10000);
		B2.show();
		
		// 영화 객체
		Movie movie1 = new Movie("어벤져스", "조스 웨던", 143, 8.3);
		Movie movie2 = new Movie("타이타닉", "제임스 카메론", 195, 7.8);
		Movie movie3 = new Movie("인셉션", "크리스토퍼 놀란", 148, 9.0);
		
		movie1.show();
		System.out.println();
		movie2.show();
		System.out.println();
		movie3.show();
		System.out.println();
		
		movie1.increaseRating(0.5);
		System.out.println("평점 오른 후 : ");
		movie1.show();
		System.out.println();
		
		Documentary documentary = new Documentary("지구의 이야기", "김철수", 120, 8.5, "환경 보호");
		ActionMovie actionMovie = new ActionMovie("어벤져스: 엔드게임", "루소 형제", 181, 9.0, 15);
		
		documentary.show();
		actionMovie.show();
		System.out.println();
		
		documentary.increaseRating(1.2);
		documentary.show();
		
		
	}
}
