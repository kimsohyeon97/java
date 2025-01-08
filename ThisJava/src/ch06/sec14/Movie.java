package ch06.sec14;

public class Movie {
	private String title;
	private String director;
	private double rating;
	private int availableSeats;
	
	public Movie(String title, String director, double rating, int availableSeats){
		this.title=title;
		this.director=director;
		this.rating=rating;
		this.availableSeats=availableSeats;
	}
	
	public boolean reserveSeat() {
		if(availableSeats>0) {
			availableSeats-=1;
			return true;
		}else
			return false;
	}
	
	public void cancelReservation() {
		availableSeats+=1;
	}
	
	public void showDetails() {
		System.out.println(title);
		System.out.println(director);
		System.out.println(rating);
		System.out.println(availableSeats);
	}
}
	
