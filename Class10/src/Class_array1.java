import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {

           // Ŭ���� + �޼ҵ� + �迭
	
	/* ���빮��. ����ڰ� �ڽ� �̸��� �Է��մϴ�.
	   ����� �̸��� �ش� class ������ ��ϵ� ����� ����
	   �̰��� ����� ������ Ȯ���ϴ� �ڵ带 �ۼ��Ͻÿ�
	   ��ϵ� ������� ��� "������ �Ǿ� �ֽ��ϴ�." ��� ����ϰ�
	   Ȯ���� ���� ���� ��� "�̰����� �Դϴ�." ��� ����մϴ�.  */
	
	Scanner sc = new Scanner(System.in);
	System.out.println("����� �̸��� �Է��ϼ���.");
	String b = sc.next();
	String user[] = {"ȫ�浿","�̼���","������"};
	arrays.lists(user,b);

	
	

	}
	
	}



class arrays{
	public static void lists(String a[],String data) {
		int w = 0;
		int ea = a.length;
		String msg="";  //�޼ҵ�� �ش� ���� ������ ���� ����ִ� ���� ��Ȯ�ϰ�
		// String "" or  null int 0���� ǥ��
		
		boolean ck = false;
		while(w<ea) {
			if (data.equals(a[w])) {
				msg = "������ �Ǿ� �ֽ��ϴ�." ;
			ck = true;
			}
			w++;
		}
		if (ck == false) {
			msg = "�̰����� �Դϴ�." ;
		}
		arrays ar = new arrays();
		ar.message(msg);
			
	}

	public void message(String m) {
		
		System.out.println(m);
	}
}
