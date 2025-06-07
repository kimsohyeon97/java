package ch05;

public class Movie {

	private String title;
	private String director;
	private double rating;
	private int seats;
	
	public Movie(String title, String director, double rating, int seats) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.seats = seats;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public void reserveSeat(int seats) {
		if(seats > 0) {
			System.out.println("예약 가능");
			seats--;
		}else {
			System.out.println("예약 불가");
		}
	}
	
	public void shoeDetails() {
		System.out.println("영화 제목 : " + title);
		System.out.println("감독 : " + director);
		System.out.println("평점 : " + rating);
		System.out.println("남은 좌석 : " + seats);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
