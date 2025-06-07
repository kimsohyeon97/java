package ch12;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerPt {
	public static void main(String[] args) {
		System.out.println("[Server]");
		
		ServerSocket serverSocket =  null;
		
		try {
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			System.out.println("연결 대기...");
			
			Socket socket = serverSocket.accept();
			System.out.println("연결 수립...");
			
			OutputStream os = socket.getOutputStream();
			String msg = "Hello, Client";
			
			byte[] msgbytes = msg.getBytes();
			os.write(msgbytes);
			
			os.flush();
			System.out.println("데이터 송신 완료...");
			
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readByte = is.read(bytes);
			
			String result = new String(bytes, 0, readByte, "UTF-8");
			System.out.println(result);
			System.out.println("데이터 수신 완료...");
			
			socket.close();
			serverSocket.close();
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
