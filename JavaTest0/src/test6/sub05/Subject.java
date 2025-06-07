package test6.sub05;

public class Subject {

	private String subName; // 과목 이름
	private Student[] students; // 과목을 수강하는 학생 배열
	private int studentCount; // 현재 수강 중인 학생 수
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student student) {
		students[studentCount++] = student;
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		System.out.print("수강생 : ");
		
		for(int i=0; i < studentCount; i++) {
			System.out.println(students[i].getName() + ", ");
		}
	}
	
	public String getSubName() {
		return subName;
	}
	
}
