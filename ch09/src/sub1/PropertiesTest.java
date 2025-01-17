package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		
		//프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		//프로퍼티 파일 저장(직렬화)
		String target = "C:\\Users\\lotte6\\Desktop\\Fruit.properties"; //확장자 properties
		
		try {
			//스트림 생성
			FileOutputStream fos = new FileOutputStream(target);
			
			//프로퍼티 파일 저장(직렬화)
			prop.store(fos,"comment"); //prop.store(데이터를 파일에 저장할 대상 스트림, 파일의 첫줄 주석)
									   //엔트리 객체를 한번에 write
			
			//스트림 해제
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		///////////////////////////////////////////////////
		
		String source = "C:\\Users\\lotte6\\Desktop\\City.properties"; 
		
		Properties sourceprop = new Properties();
		
		try {
			//스트림 생성
			FileInputStream fis = new FileInputStream(source);
			
			//프로퍼티 파일 읽기
			sourceprop.load(fis); //엔트리 객체를 한번에 read
			
			//스트림 해제
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(sourceprop);
		System.out.println("kor 키값 : " + sourceprop.getProperty("kor"));
		System.out.println("usa 키값 : " + sourceprop.getProperty("usa"));
		System.out.println("jpn 키값 : " + sourceprop.getProperty("jpn"));
		System.out.println("chi 키값 : " + sourceprop.getProperty("chi"));
	}

}
