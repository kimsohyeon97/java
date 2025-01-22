package ch11.sub1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Person1{
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class CollectionStreamTest {
	public static void main(String[] args) {
	
		List<String> people = new ArrayList<>();
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		//외부 반복자를 이용한 출력
		for(String p :people) {
			System.out.println(p);
		}
		
		Iterator<String> it = people.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//내부 반복자를 이용한 출력
		people.stream().forEach(p->System.out.println(p));
		
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신",23));
		persons.add(new Person("김춘추",21));
		persons.add(new Person("장보고",33));
		persons.add(new Person("강감찬",43));
		persons.add(new Person("이순신",53));
		
		//외부 반복자
		for(Person p : persons) {
			System.out.println(p);
		}
		
		//내부 반복자
		persons.stream().forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}

}
