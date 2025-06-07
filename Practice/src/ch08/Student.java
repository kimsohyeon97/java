package ch08;

public class Student {

	private String name;
	private int year;
	
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", year=" + year + "]";
	}

}
