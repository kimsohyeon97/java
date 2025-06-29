package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2025/01/16
 * 이름 : 김소현
 * 내용 : Java Properties(Map 개열) 실습하기 (자주 사용)
 */

public class PropertiesTest {

	public static void main(String[] args) {
		
		// 프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		// 프로퍼티 파일 저장(직렬화)
		String target = "C:\\Users\\lotte6\\Desktop\\Fruit.properties"; // 확장자 properties, 개발자가 사용하는 파일(텍스트 파일로 열 수 있음)
		
		try {
			// 스트림 생성
			FileOutputStream fos = new FileOutputStream(target);
			
			// 프로퍼티 파일 저장(직렬화)
			prop.store(fos, null);
			
			// 스트림 해제
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/////////////////////////////////////////////////////////////////////////////
		// 프로퍼티 읽기(역직렬화)
		/////////////////////////////////////////////////////////////////////////////
		String source = "C:\\Users\\lotte6\\Desktop\\City.properties";
		
		Properties sourceProp = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(source);
			
			// 프로퍼티 파일 읽기
			sourceProp.load(fis);
			
			// 스트림 해제
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sourceProp);
		System.out.println("kor 키값 : " + sourceProp.getProperty("kor"));
		System.out.println("usa 키값 : " + sourceProp.getProperty("usa"));
		System.out.println("jpn 키값 : " + sourceProp.getProperty("jpn"));
		System.out.println("chi 키값 : " + sourceProp.getProperty("chi"));
		
		
		
		
		
		
	}
}















