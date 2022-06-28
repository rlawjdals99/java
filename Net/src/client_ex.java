import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client_ex {
	public static void main(String[] args) {
	    String ip = "192.168.1.198";
//		String ip = "192.168.1.157";	//내 IP
		int port = 9090;
		Scanner scan = null;
		String myid = null; //닉네임
		OutputStream os = null;
		InputStream is = null;
		String msg = null;
		String amsg = null;

		try {
			System.out.println("서버에 접속 되었습니다.");
			scan = new Scanner(System.in);
			System.out.println("채팅에 사용하실 아이디를 입력해 주세요.");
			myid = scan.next();
			System.out.println("대기중....");
			Socket sc = new Socket(ip, port);
			int c = 0;
			
			os = sc.getOutputStream();
			msg = myid + " : " + scan.nextLine();
			os.write(msg.getBytes());
			os.flush();
			//os.close(); OutputStream, InputStream close는 최대한 finally에 사용합니다.
			
			for (;;) {
				is = sc.getInputStream();
				byte[] data = new byte[1024];
				int n = is.read(data);
				amsg = new String(data, 0, n);
				System.out.println(amsg);
				
				scan = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요.");
				msg = myid + " : " + scan.nextLine();

				os.write(msg.getBytes());
				os.flush();

				
			}
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println("접속 오류");
			}
		}

		finally {
			try {
				if (msg == "exit") {
					System.out.println("채팅이 종료 되었습니다.");
					System.exit(0);
				}
			} catch (Exception o) {

			}
		}

	}
}
