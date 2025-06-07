package ch08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPt {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println(list);
		
		list.add(2, 100);
		System.out.println(list);
		
		list.remove(5);
		System.out.println(list);
		
		System.out.println("인덱스 0에 있는 값 : " + list.get(0));
		System.out.println("인덱스 5에 있는 값 : " + list.get(5));
		System.out.println("리스트의 크기 : " + list.size());
		
		List<String> name = new ArrayList<String>();
		name.add("홍길동");
		name.add("홍게");
		name.add("신사임당");
		name.add("이성계");
		name.add("이순신");
		name.add("오미자");
		
		System.out.println(name);
		
		name.remove(0);
		name.add(0, "이순신");
		System.out.println(name);
		
		List<Apple> apple = new ArrayList<>();
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("일본", 3000);
		Apple a3 = new Apple("중국", 3000);
		apple.add(a1);
		apple.add(a2);
		apple.add(a3);
		
		for(Apple apples : apple) {
			System.out.println(apples);
		}
		
		LinkedList<String> city = new LinkedList<String>();
		city.add("서울");
		city.add("부산");
		city.add("대구");
		
		city.removeFirst();
		city.removeLast();
		
		System.out.println(city);
		
		List<Student> std = new ArrayList<>();
		Student s1 = new Student("김유신", 85);
		Student s2 = new Student("이순신", 85);
		Student s3 = new Student("강감찬", 85);
		std.add(s1);
		std.add(s2);
		std.add(s3);
		
		for(Student student : std) {
			System.out.println(student);
		}
		
		std.remove(1);
		std.add(1, new Student("신사임당", 95));
		
		for(Student student : std) {
			System.out.println(student);
		}
		
	}

}











