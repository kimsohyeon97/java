package sub1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIOTest {
	public static void main(String[] args) {
		
		//파일 경로 설정
		String source = "C:\\Users\\lotte6\\Desktop\\Sample.tif";
		String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif";
	
		try {
			//스트림 생성
			FileInputStream fis = new FileInputStream(source); //입력 스트림
			FileOutputStream fos = new FileOutputStream(target); //출력 스트림
			
			//보조 스트림 생성 후 기본 스트림 연결
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//스트림 데이터 전송
			while(true) {
				//입력스트림으로 파일 데이터 읽기
				int data = bis.read();
				
				if(data == -1) 
					//읽을 파일 데이터가 없을때 
					break;
				
				bos.write(data);
				}
			
			//보조스트림 클래스에 transferto메소드가 없어서 동시에 사용 못함. fis.transferTo(fos);는 가능
			
			//스트림 해제
			bis.close();
			
			bos.flush(); //출력버퍼는 해제 전에 비워줌
			bos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
