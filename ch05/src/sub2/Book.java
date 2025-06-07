package sub2;

public class Book {
	
	//속성
	private String title; // 책 제목
	private String author;
	private String isbn;
	private int availableCopies; // 이용 가능한 복사본 수
	
	// 생성자 (마우스 오른쪽 - 소스 - 유즈 뭐시기 하면 자동 생성 됨)
	public Book(String title, String author, String isbn, int availableCopies) {
	this.title = title;
	this.author = author;
	this.isbn = isbn;
	this.availableCopies = availableCopies;
		
	}
	
	public boolean borrowBook() {
		if(availableCopies > 0) {
			availableCopies--;
			return true;
		}else {
			return false;
		}
	}
	
	public void returnbook(int availableCopies) {
		availableCopies++;
	}
	
	public void show() {
		System.out.println("도서명 : " + this.title);
		System.out.println("작가명 : " + this.author);
		System.out.println("도서번호 : " + this.isbn);
		System.out.println("도서 복사본 : " + this.availableCopies);
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
	
	//get
	//set
	
	//get
	//set
	
}
