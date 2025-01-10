package test3;

class Student{
	static int studentId;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade =grade;
		
	}
	public void studentInfo() {
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
		System.out.println();
	}
}

public class Test04 {
	public static void main(String[] args) {
		Student.studentId = 20201000;
		
		Student Kim = new Student("김유신","국문과",1);
		Kim.studentInfo();
		
		Student Lee = new Student("이순신","경제학과",1);
		Lee.studentInfo();
		
		Student Lim = new Student("임꺽정","경영학과",1);
		Lim.studentInfo();
	}

}
