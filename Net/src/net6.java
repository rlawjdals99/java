import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//Client
	public static void main(String[] args) throws Exception{

		System.out.println("Ŭ���̾�Ʈ");
		String ip = "192.168.1.197";	//localhost
		int port = 8080;
		try {
			Socket sc = new Socket(ip,port);	//������ ����IP, ������ ����Port
			System.out.println("������ ���� �Ǿ����ϴ�.");
			String cmsg = "����";
			//Client���� Server�� ������ ���
			OutputStream os = sc.getOutputStream();
			//Server���� ������ ���� �޴� ���
			//Client���� ������ �޽����� �޸𸮿� ���� �� byte�� ����
			InputStream is = sc.getInputStream();
			os.write(cmsg.getBytes());
			os.flush();
			// Server���� ȸ�ŵ� �������� byte
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
		} catch (Exception e) {
			System.out.println("�������ῡ ���� �Ͽ����ϴ�.");
		}
	}
}
