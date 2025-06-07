package sub2;

public class Movie {
	
	// 속성
	private String Title; // 영화 제목
	private String director; // 감독 이름
	private double rating; //영화 평점 (0.0 ~ 10.0 사이의 값)
	private int availableSeats; // 예약 가능한 좌석 수
	
	// 생성자
	public Movie(String Title, String director, double rating, int availableSeats) {
		this.Title = Title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}
	
	// 메서드
	public boolean reserveSeat() {
		if(availableSeats > 0) {
			availableSeats --;
			return true;
		}else {
			return false;
		}
	}	
		public void cancelReservation() {
			availableSeats ++;
		}
		
		public void showDetails() {
			System.out.println("영화 제목 : " + this.Title);
			System.out.println("감독 이름 : " + this.director);
			System.out.println("영화 평점 : " + this.rating);
			System.out.println("예약 가능한 좌석 수 : " + this.availableSeats);
		}
	}
	
