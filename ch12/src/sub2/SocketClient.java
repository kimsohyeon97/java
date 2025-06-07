package sub2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 날짜 : 2025/01/22
 * 이름 : 한결
 * 내용 : Java 소캣 프로그래밍 실습
 */

public class SocketClient {

	public static void main(String[] args) {
		System.out.println("[Client]");

		// 소켓 객체 선언
		Socket socket = null;		

		try {
			// 소켓 객체를 생성. 기본적으로 새로운 소켓을 생성한다.
			socket = new Socket();

			System.out.println("연결요청...");
			
			// 서버에 연결 요청을 보낸다.
			socket.connect(new InetSocketAddress("127.0.0.1", 5001)); // IP주소(Local IP Address, Loopback, Localhost), 포트번호

			System.out.println("연결 성공...");

			// 데이터 송신 단계
			// 서버로 데이터를 보내기 위한 OutputStream을 생성
			OutputStream os = socket.getOutputStream();
			
			// 서버로 보낼 메시지
			String msg = "Hello Server!";

			// 메시지를 byte 배열로 변환
			byte[] msgByte = msg.getBytes();
			
			// byte 배열을 OutputStream을 통해 서버에 전송
			os.write(msgByte);
			
			// 전송 완료 후, OutputStream을 비워준다
			os.flush();
			System.out.println("데이터 송신 완료...");
		

			// 데이터 수신 단계
			InputStream is = socket.getInputStream();
			
			// 데이터를 저장할 Byte 배열을 준비
			byte[] bytes = new byte[100];
			
			// InputStream에서 데이터를 읽어 byte 배열에 저장
			int readBytes = is.read(bytes);

			// 읽은 데이터를 UTF-8 형식으로 문자열로 변환하여 출력
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			System.out.println("데이터 수신 완료...");

			// 자원 해제를 위해 InpuyStream, OutputStream, 소켓을 닫음
			os.close();
			is.close();		
			socket.close();


		}catch (Exception e) {
			// 예외가 발생하면 스택 트레이스 출력
			e.printStackTrace();
		}

		System.out.println("Client 종료...");



	}
}
