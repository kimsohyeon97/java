package practice;

public class Movie {

	protected String title;
	protected String director;
	protected int duration;
	protected double rating;
	
	public Movie(String title, String director, int duration, double rating) {
		this.title = title;
		this.director = director;
		this.duration = duration;
		this.rating = rating;
		
	}
	public void increaseRating(double ratingIncrease) {
		this.rating += ratingIncrease;
	}
	public void show() {
		System.out.println("제목 : " + title);
		System.out.println("감독 : " + director);
		System.out.println("영화 길이 : " + duration + "분");
		System.out.println("평점 : " + rating);
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
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
