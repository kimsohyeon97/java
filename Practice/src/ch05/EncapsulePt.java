package ch05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncapsulePt {

	public static void main(String[] args) {
		List<Book> title = new ArrayList<Book>();
		
		title.add(new Book("삼국지", "나과중", 10001, 3));
		title.add(new Book("자바의 정석", "신용권", 10002, 2));
		
		System.out.println("도서 목록 : ");
		for(Book book : title) {
			book.show();
		}
		
		title.get(0).borrowBook(0);
		title.get(1).borrowBook(0);
		
		System.out.println("도서 목록(대출 후) : ");
		for(Book book : title) {
			book.show();
		}
		
		title.get(0).returnBook(0);
		title.get(1).returnBook(0);
		
		System.out.println("도서 목록(반납 후) : ");
		for(Book book : title) {
			book.show();
		}
		
		List<Map<Integer, Student>> std = new ArrayList<>();

		Map<Integer, Student> std1 = new HashMap<>();
		std1.put(101, (new Student("김유신", 25, 90)));
		std1.put(102, (new Student("이순신", 17, 80)));
		
		Map<Integer, Student> std2 = new HashMap<>();
		std2.put(201, (new Student("눈누", 25, 21)));
		std2.put(202, (new Student("난나", 12, 25)));
		
		std.add(std1);
		std.add(std2);
		
		std.get(0).get(102).show();
		std.get(1).get(201).show();
		
		Student stu = new Student("김유신", 25, 90);
		Student stu1 = new Student("장사니", 30, 70);
		
		stu.setAge(16);
		stu1.setAge(30);
		stu.show();
		stu1.show();
	}
}











