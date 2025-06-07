package ch12;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClientPt {
	public static void main(String[] args) {
		System.out.println("[Client]");

		Socket socket = null;

		try {
			socket = new Socket();

			socket.connect(new InetSocketAddress("127.0.0.1", 5001));

			InputStream is = socket.getInputStream();

			byte[] bytes = new byte[100];
			int readbyte = is.read(bytes);

			String result = new String(bytes, 0, readbyte, "UTF-8");

			System.out.println(result);

			OutputStream os = socket.getOutputStream();

			String msg = "Hello Server!";

			byte[] msgbyte = msg.getBytes();

			os.write(msgbyte);
			os.flush();



			os.close();
			is.close();
			socket.close();





		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
