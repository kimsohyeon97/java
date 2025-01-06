package ch05.sec06;

public class MultidimesnsionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores = {
				{84,90,96},
				{76,88}
		};
		
		System.out.println("1차원 배열 길이(반의 수) : " +scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생수) : "+scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생수) : "+scores[1].length);
		
		int sum = 0;
		int student = 0;
		
		for(int i =0;i<scores.length;i++) {
			
			for(int j=0;j<scores[i].length;j++) {
				sum+=scores[i][j];
				student++;
			}
		}
		double avg = (double)sum/student;
		
		System.out.println(avg);
	}

}
