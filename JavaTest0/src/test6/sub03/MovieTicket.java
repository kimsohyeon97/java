package test6.sub03;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber, boolean isBooked) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = isBooked;
	}
	
	public void bookTicket(boolean isBooked) {
		if(this.isBooked) {
			System.out.println("이미 예매됨");			
		}else if (isBooked){
			this.isBooked = true;
			System.out.println(movieTitle + ", " + screenTime + ", " + seatNumber + ", " + "예매 완료");
		}else {
			System.out.println("예매 실패");
		}
	}
	
	public void cancelBook(boolean isBooked) {
		if(!this.isBooked) {
			System.out.println("아직 예매 안됨");
		}else if (!isBooked) {
			this.isBooked = false;
			System.out.println(movieTitle + ", " + screenTime + ", " + seatNumber + ", " + "취소 완료");
		}else {
			System.out.println("취소 실패");
		}
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목 : " + movieTitle);
		System.out.println("상영시간 : " + screenTime);
		System.out.println("좌석여부 : " + seatNumber);
		System.out.println("예매여부 : " + (isBooked ? "Yes" : "No"));
	}
}
