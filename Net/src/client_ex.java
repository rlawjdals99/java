import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client_ex {
	public static void main(String[] args) {
	    String ip = "192.168.1.198";
//		String ip = "192.168.1.157";	//�� IP
		int port = 9090;
		Scanner scan = null;
		String myid = null; //�г���
		OutputStream os = null;
		InputStream is = null;
		String msg = null;
		String amsg = null;

		try {
			System.out.println("������ ���� �Ǿ����ϴ�.");
			scan = new Scanner(System.in);
			System.out.println("ä�ÿ� ����Ͻ� ���̵� �Է��� �ּ���.");
			myid = scan.next();
			System.out.println("�����....");
			Socket sc = new Socket(ip, port);
			int c = 0;
			
			os = sc.getOutputStream();
			msg = myid + " : " + scan.nextLine();
			os.write(msg.getBytes());
			os.flush();
			//os.close(); OutputStream, InputStream close�� �ִ��� finally�� ����մϴ�.
			
			for (;;) {
				is = sc.getInputStream();
				byte[] data = new byte[1024];
				int n = is.read(data);
				amsg = new String(data, 0, n);
				System.out.println(amsg);
				
				scan = new Scanner(System.in);
				System.out.println("������ �Է��� �ּ���.");
				msg = myid + " : " + scan.nextLine();

				os.write(msg.getBytes());
				os.flush();

				
			}
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println("���� ����");
			}
		}

		finally {
			try {
				if (msg == "exit") {
					System.out.println("ä���� ���� �Ǿ����ϴ�.");
					System.exit(0);
				}
			} catch (Exception o) {

			}
		}

	}
}
