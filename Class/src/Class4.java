import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {

		/* �迭 ������ : "ȫ�浿", "�̼���", "������"
		   ������ �����Ͱ� �ֽ��ϴ�.
		   ���� class���� ���ڸ� �ϳ� ���� �մϴ�.
		   ��, ���ڰ� null�� ���� �� ������ �迭 �����Ϳ� ���� ���� "������" �̶��
		   ���� ���� �ֽ��ϴ�.
		   �ܺ� Ŭ���� �̸� : data_list
		   �߻� Ŭ���� �̸� : v_constuct
		   �ܺ� Ŭ���� �ȿ� ���� Ŭ���� �̸� : check
		   
		   ���
		   ���� class���� �������� ������ ���
		   ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�." ��� ���
		   ���� class���� �̼����� ������ ���
		   ���� Ŭ�������� "�ش� ����ڰ� �ֽ��ϴ�." ��� ���
		   ��, ArrayList�� �迭�� �ε� �Ͻʽÿ�.   */
		
	
//	data_list dl = new data_list();
//	dl.v_method(null);
//		data_list.check dc = dl.new check();
//		dc.db();
		 
		
		
		// ������ Ǯ��
		data_list dl = new data_list();
		dl.v_method("������");
		
		
	}
}

//abstract class v_constuct{
//	int a;
//	String mmsg;
//	String zz;
//	public abstract void v_method(String user_name);  // �߻� Ŭ����
//}
//
//class data_list extends v_constuct{  // �ܺ� Ŭ����
//
//	@Override
//	public void v_method(String user_name) {
//		
//		String user[] = {"ȫ�浿", "�̼���", "������"};
//		ArrayList<String> user_a = new ArrayList<String>(Arrays.asList(user));
//		int b = user_a.size();
//		
//		for(this.a = 0; this.a < b ;this.a++) {
//    	   if (user_a.equals(user_name)) {
//    		   this.mmsg = "�ش� ����ڰ� �ֽ��ϴ�.";
//		}
//    	   else  {
//    		   this.mmsg = "�ش� ����ڴ� �����ڰ� �ƴմϴ�.";
//    	   }
//
//		}
//		
//		if (user_name == null) {
//			System.out.println("����� �̸��� �Է��ϼž� �մϴ�.");
//		}
//		else {
//			this.zz = user_name;
//			System.out.println(this.zz);
//		}
//		
////		System.out.println(user_a);
//		
//	}
//	
//	class check{  // �ܺ� Ŭ���� �ȿ� ���� Ŭ����
//		
//		String msg3 = data_list.this.mmsg;
//		
//		public void ccall() {
//		System.out.println(msg3);
//		}
//	}
//}

abstract class v_constuct{
	String user_name;
	public abstract void v_method(String nm);  // �߻� Ŭ����
}

class data_list extends v_constuct{  // �ܺ� Ŭ����

	@Override
	public void v_method(String nm) {
		
		if (user_name == null) {
			System.out.println("����� �̸��� �Է��ϼž� �մϴ�.");
		}
		else {
			this.user_name = nm;
			check ck = new check();
			ck.db();
		}
		
	}
	
	
	class check{  // �θ� Ŭ�������� ���� ���� �ڽ�Ŭ������ �̰�
		String user_name = data_list.this.user_name;
		String data_list[];  // �ʵ忡 �迭�� �޴� ��ü ����
		ArrayList<String> ar = null;   //ArrayList util�� �ʵ忡 ��ü ����

		public void db() {  // �ش� �ʵ忡 �ִ� ArrayList�� �ν��Ͻ��� ������
			this.data_list = new String [] {"ȫ�浿", "�̼���", "������"};
			this.ar = new ArrayList<>(Arrays.asList(this.data_list)); // this�� ó��
		     this.compare();  // ���� DB�� ����� ������ ���ϴ� �޼ҵ�
		}
	public void compare() {
		int ea = this.ar.size();
           	int w;
           	boolean bl = false;  // Ȯ���۾�
           	
           	for(w = 0 ; w < ea; w++) {
           		if (this.user_name.equals(this.ar.get(w))) {
				 bl = true;
           		}
           	}

           	if (bl==true) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
			}
           	else {
                  System.out.println("�ش� ����ڴ� �����ڰ� �ƴմϴ�.");
			}
	}
	}
}
