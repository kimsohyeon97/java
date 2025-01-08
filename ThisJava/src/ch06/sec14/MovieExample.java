package ch06.sec14;

public class MovieExample {

	public static void main(String[] args) {
		Movie movie1 = new Movie("글래디에이터","리들리스콧",8.0,10);
		
		if(movie1.reserveSeat())
			System.out.println("영화 좌석 예매 완료!");
		else
			System.out.println("영화 좌석 예매 실패!");
		
		movie1.showDetails();
	}
}
