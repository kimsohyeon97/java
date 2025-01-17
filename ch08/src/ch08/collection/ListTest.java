package ch08.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListTest {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		list.add(1,6);
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println("list 1번째 원소 " +list.get(0));
		System.out.println("list 2번째 원소 " +list.get(1));
		System.out.println("list 4번째 원소 " +list.get(3));
		
		System.out.println("list 크기 : "+list.size());
		
		for(int num : list) 
			System.out.print(num + ", ");
		System.out.println();
		
		
		List<String> persons = new ArrayList<>();
		persons.add("김유신");
		persons.add("김춘추");
		persons.add("장보고");
		persons.add("강감찬");
		persons.add("이순신");
		System.out.println(persons);
		
		persons.add("정약용");
		System.out.println(persons);
		
		persons.add(4,"이성계");
		System.out.println(persons);
		
		persons.add(persons.indexOf("김춘추"),"선덕여왕");
		System.out.println(persons);
		
		persons.remove(2);
		persons.add(2,"장보고");
		System.out.println(persons);
		
		//객체 리스트
		
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("미국",2000);
		Apple a3 = new Apple("일본",1000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(a3);
		
		for(Apple apple : apples) 
			System.out.println(apple);
		
		//LinkedList
		
		List<String> cities = new LinkedList<>();
		
		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		System.out.println(cities);
		
		cities.add(1,"수원");
		System.out.println(cities);
		
		cities.addFirst("인천");
		System.out.println(cities);
		
		cities.addLast("울산");
		System.out.println(cities);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
