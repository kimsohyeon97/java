package ch11.sub1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class StreamMapTest {
	public static void main(String[] args) {
		
		List<Person> persons = List.of(
				new Person("김유신",23),
				new Person("김춘추",21),
				new Person("장보고",33),
				new Person("강감찬",45),
				new Person("이순신",53)
		);
		
		System.out.println(persons);
		
		//map() : 원소를 다른값으로 변환
		persons
			.stream()
			.map((p) -> {
				return p.getName();
			}).forEach((name)-> {
				System.out.println(name + ", ");
			});
		
		List<String> names = persons
							.stream()
							.map(Person::getName)
							.collect(Collectors.toList());
		
		System.out.println(names);
		
		
		int total = persons
					.stream()
					.mapToInt((person)->{
						return person.getAge();
					})
					.sum();
		
		//flatMapxxx() : 컬렉션 요소를 다른 여러개의 요소로 변환
		List<List<String>> fruits = List.of(
											Arrays.asList("Apple","Banna"),
											Arrays.asList("Cherry","Grape"),
											Arrays.asList("Orange","Mango"));
		
		
		List<String> fruitList = fruits
									.stream()
									.flatMap((list)->{
										return list.stream();
									})
									.collect(Collectors.toList());
									
		System.out.println(fruitList);
	}
}
