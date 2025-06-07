package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransferTest {

	public static void main(String[] args) {

		// 파일 경로 설정
		String source = "C:\\Users\\lotte6\\Desktop\\Sample.tif"; // 입력 파일
		String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif"; // 출력 파일

		try {
			// 스트림 생성
			FileInputStream fis = new FileInputStream(source); // 입력 스트립
			FileOutputStream fos = new FileOutputStream(target); // 출력 스트림
			
			// 파일 복사
			fis.transferTo(fos); // 보조 스트림 생성 과정 없이 바로 파일 복사 가능

			// 스트림 해제
			fis.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료...");
	}// main end
}
