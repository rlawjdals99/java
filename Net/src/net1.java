import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
	//UnknownHostException : HOST ������ Ȯ�� ���� ���� ��� 
	public static void main(String[] args) throws UnknownHostException{
//		InetAddress : IPnetworkAddress
//		getByName : ������ ������ �ּҸ� ���մϴ�.

		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);
//		System.out.println(ia.getHostName());	//�����θ�
//		System.out.println(ia.getHostAddress());	//DNS�� ����� IP
		
		//getAllByName : �����ο� IP���� Ȯ��  (�迭�� �����ؾ� �մϴ�.)
		InetAddress ia2[] = InetAddress.getAllByName("daum.net");
		System.out.println(ia2.length);	//�ش� DNS�� IP ����
		int w = 0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		
		
		
	}
}