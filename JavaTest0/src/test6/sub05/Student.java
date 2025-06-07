package test6.sub05;

public class Student {

	private String name; // 학생 이름
	private String studentId; // 학생 아이디
	private Subject[] subjects; // 학생이 수강하는 과목 배열
	private int[] scores; // 학생의 각 과목 성적 배열
	private int subjectCount; // 현재 수강 중인 과목 수
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	public void enrollSubject(Subject subject) {
		subjects[subjectCount] = subject;
		subject.addStudent(this);
		scores[subjectCount++] = 0;
		
		System.out.println(name + " - " + subject.getSubName() + " 과목 신청완료");
	}
	
	public void setScore(Subject subject) {
		subject.addStudent(null);
	}
	
	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적");
		System.out.println("- 자바:" + scores + "\n" + "- 데이터베이스:" + scores);
	}
	
	public String getName() {
		return name;
	}
	
	
}
