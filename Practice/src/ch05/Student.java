package ch05;


public class Student {

	private String name;
	private int age;
	private int grade;

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		setGrade(grade);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 18) {
			this.age = age;	
		}else {
			System.out.println("나이는 18세 이상이어야 합니다.");
		}
	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		if(grade >= 0 && grade <= 100) {
			this.grade = grade;
		}else {
			System.out.println("점수 입력을 잘못하였습니다.");
		}
	}

	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성적 : " + grade);
	}

}
