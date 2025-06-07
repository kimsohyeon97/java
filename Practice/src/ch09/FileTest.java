package ch09;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\lotte6\\Desktop\\MyFile.txt";
		String path2 = "C:\\Users\\lotte6\\Desktop\\MyDirectory";
		String path3 = "C:\\InvalidPath\\InvalidFile.txt";
		
		File f1 = new File(path1);
		File f2 = new File(path2);
		File f3 = new File(path3);
				
		
		try {
			f1.createNewFile();
			f2.mkdir();
			f3.createNewFile();
			
			System.out.println("존재 여부 : " + f1.exists());
			System.out.println("디렉토리 여부 : " + f2.isDirectory());
			System.out.println("디렉토리 경로 : " + f2.getPath());
			System.out.println("이름 : " + f1.getName());
			System.out.println("이름 : " + f2.getName());
			System.out.println("경로 : " + f1.getPath());
			System.out.println("경로 : " + f2.getPath());
			System.out.println("존재 여부 : " + f1.exists());
			System.out.println("존재 여부 : " + f2.exists());
			System.out.println(f3.exists());
			
			f1.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
