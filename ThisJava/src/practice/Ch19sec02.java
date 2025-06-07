package practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ch19sec02 {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소 : " + ia);
			
			InetAddress iaArr = InetAddress.getByName("google.com");
			System.out.println(iaArr);
			
			InetAddress[] iaArr1 = InetAddress.getAllByName("google.com");

			for(InetAddress ia1 : iaArr1) {
				System.out.println(ia1);
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}finally {
			System.out.println("IP 주소를 찾지 못했습니다.");
		}
	}
}
