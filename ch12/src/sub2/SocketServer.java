package sub2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜 : 2025/01/22
 * 이름 : 한결
 * 내용 : Java 소캣 프로그래밍 실습
 */

public class SocketServer {

	public static void main(String[] args) {

		System.out.println("[Server]");

		ServerSocket serverSocket =  null;

		try {
			// 서버 소켓 생성
			serverSocket = new ServerSocket();
			
			// 서버 소켓을 특정 IP 주소와 포트 번호로 바인딩하여 클라이언트의 연결을 기다린다
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			System.out.println("연결 대기...");
			
			// 클라이언트의 연결을 기다리며 대기
			// 클라이언트가 연결을 요청하면 연결을 수락하고, 새로운 소켓을 생성
			Socket socket =  serverSocket.accept();
			System.out.println("연결 수립...");

			// 데이터 수신 단계
			// 연결된 클라이언트로부터 데이터를 받기 위한 InputStream 생성
			InputStream is = socket.getInputStream();
			
			// 데이터를 저장할 byte 배열을 준비
			byte[] bytes = new byte[100];
			
			// InputStream에서 데이터를 읽어 byte 배열에 저장
			int readBytes = is.read(bytes);
			
			// 읽은 데이터를 UTF-8 형식으로 문자열로 변환하여 출력
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			
			System.out.println("데이터 수신 완료...");

			// 데이터 송신 단계
			// 연결된 클라이언트에게 데이터를 보내기 위한 OutputStream을 생성
			OutputStream os = socket.getOutputStream();
			
			// 클라이언트로 보낼 메시지 준비
			String msg = "Hello Client!";

			// 메시지를 byte 배열로 변환
			byte[] msgByte = msg.getBytes();

			// byte 배열을 OutputStream을 통해 클라이언트에게 전송
			os.write(msgByte);
			
			// 전송이 완료된 후, OutputStream을 비워준다
			os.flush();
			
			System.out.println("데이터 송신 완료...");
			
			// 자원 해제를 위해 InputStream, OutputStream, 소켓을 닫는다
			os.close();
			is.close();		
			socket.close();


		}catch (Exception e) {
			// 예외가 발생하면 스택 트레이스를 출력
			e.printStackTrace();
		}

		System.out.println("Server 종료...");
	}
}
