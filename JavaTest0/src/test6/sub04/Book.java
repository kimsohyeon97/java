package test6.sub04;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	
	public void borrowBook() {
		if(!isBorrowd) {
			isBorrowd = true;
			System.out.println("대출한 도서 : " + title);
		}else {
			System.out.println(title + " 이미 대출됨");
		}
	}
	
	public void returnBook() {
		if(isBorrowd) {
			isBorrowd = false;
			System.out.println("도서반납 : " + title);
		}else {
			System.out.println(title + "이미 대출됨");
		}
	}
	
	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		System.out.println("대출여부 : " + (isBorrowd ? "가능" : "불가능"));
	}
	
	public String getTitle() {
		return title;
	}
}
