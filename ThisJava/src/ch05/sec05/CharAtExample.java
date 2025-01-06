package ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "010516-4109912";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1', '3' ->
		System.out.println("남자입니다.");
		case '2', '4' ->
		System.out.println("여자입니다.");
		default ->
		System.out.println("잘못 입력했습니다.");

		}
	}

}
