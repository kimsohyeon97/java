package ch05;

public class Book {

	private String title;
	private String author; // 작가
	private int isbn; // 책 고유번호
	private int quantity; // 재고
	
	public Book(String title, String author, int isbn, int quantity) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.quantity = quantity;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void borrowBook(int quantity) {
		if(this.quantity >= 1) {
			this.quantity--;
			System.out.println("대출 성공!");
		}else {
			System.out.println("재고가 부족합니다");
		}
	}
	
	public void returnBook(int quantity) {
		if(this.quantity > 0) {
			this.quantity++;
			System.out.println("반납 성공!");
		}else {
			System.out.println("반납 실패!");
		}
	}
	
	public void show() {
		System.out.println("도서명 : " + title);
		System.out.println("저자명 : " + author);
		System.out.println("ISBN : " + isbn);
		System.out.println("남은 수량 : " + quantity);
	}
	
}
















