package test6.sub03;

public class Main {
	public static void main(String[] args) {
		
		MovieTicket ticket = new MovieTicket("타이타닉", "19:00", "A1", false);
		
		ticket.printTicketInfo();
		System.out.println("----------------------");
		
		ticket.bookTicket(true);
		System.out.println("----------------------");
		
		ticket.printTicketInfo();
		System.out.println("----------------------");
		
		ticket.bookTicket(true);
		System.out.println("----------------------");
		
		ticket.cancelBook(false);
		System.out.println("----------------------");
		
		ticket.printTicketInfo();
		System.out.println("----------------------");
		
		ticket.cancelBook(false);
		System.out.println("----------------------");
	}
}
