import java.util.Timer;
import java.util.TimerTask;

public class time3 {

	public static void main(String[] args) {

//		try {
//			System.out.println("��������");
//			Thread.sleep(5000);
//			System.out.println("��������");
//		} catch (InterruptedException e) {
//		System.out.println(e);
//		}
		
		/* ���빮��. �ܺ� class�� �ֽ��ϴ�. ��, ���� Ŭ�������� �� ����
		   �ܺ� class�� �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 8�ʵ��� �ε��� �߻��մϴ�.
		   8�ʵ��� "ó�����Դϴ�. ��ø� ��ٷ��ּ���"
		   8�� ���Ŀ� return���� "�Ա��� ��� ó�� �Ǿ����ϴ�." ��� ���ڸ� �޵��� �Ͻʽÿ�. */
		time t = new time();
		
	try {
	    System.out.println("ó�����Դϴ�. ��ø� ��ٷ��ּ���");
		Thread.sleep(8000);
		String g = t.a();
		System.out.println(g);
	} catch (InterruptedException e) {
	
	}
		
		
		
		
	}
}

class time{
	public String a(){
	return "�Ա��� ��� ó�� �Ǿ����ϴ�";
	}
}