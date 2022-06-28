import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server_ex {
	

	public static void main(String[] args) {
		ServerSocket server_sock = null;
		Scanner sc = null;
		InputStream is = null;
		OutputStream os = null;
		String mid = null;
		int port = 9090;
		
		try {
			server_sock = new ServerSocket(port);
			sc = new Scanner(System.in);
			System.out.println("서버에서 사용할 아이디를 입력해 주세요.");
			mid = sc.next();	//서버 담당자 아이디
			System.out.println("대기중....");
			Socket sk = server_sock.accept();
			
			while(true) {
			is = sk.getInputStream();
			os = sk.getOutputStream();
			
			byte[] data = new byte[9999];
			int arr = is.read(data);
			String message = new String(data,0,arr);
			System.out.println(message);

			sc = new Scanner(System.in);
			System.out.println("내용을 입력해 주세요.");
			String msg = mid + " : " + sc.nextLine();
			
			os.write(msg.getBytes());
			os.flush();
			
			is.close();
			os.close();
			sc.close();
			
			
			}
		} catch (Exception e) {

		}
	}
	}

