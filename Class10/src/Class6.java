import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {


	
	int num = 3;
	datalist da = new datalist();
	da.array_date(num);
	
//	String pay = "�ſ�ī��";
	String pay = "������ü";

	if (pay.equals("�ſ�ī��")) {
		da.pay1();   // �ش� ���ǿ� �´� �޼ҵ带 ȣ��
	}
	else {
		da.pay2(pay);  // �޼ҵ忡 ��ü���� �¿��� ���� (��ü���� ���Ѵ�)
	}
	
	/* ���빮��. �ش� �ε��� class���� agrees��� �̸��� ������ �ֽ��ϴ�.
	   main �޼ҵ忡�� ����ڰ� "������", "���Ǿ���"�� �Է��ϰ� �˴ϴ�.
	   ���������� �Է� �Ǿ��� ��� "ȸ�������� ����˴ϴ�." ��� �޽����� ����ϰ�,
	   ���Ǿ����� �Է½� "���Ǹ� �ϼž� ����˴ϴ�." ��� ��� �ǵ��� �Ͻÿ�.
	   ��, agrees Ŭ���� �ȿ� void �޼ҵ� �Ѱ�  �Ǵ� �ΰ��� �����Ͽ� �ڵ带 �����Ͻÿ�. */
	
	
	agrees ag = new agrees();
	Scanner sc = new Scanner(System.in);
	System.out.println("�����Ͻðڽ��ϱ�?");
	String dd = sc.next();
	ag.hi();
	if (dd.equals("������")) {
		System.out.println("ȸ�������� ����˴ϴ�.");
		
	}
	else {
		System.out.println("���Ǹ� �ϼž� ����˴ϴ�.");
	}
	

	
	sc.close();
	
	}

}

class agrees{
	
	public void hi() {
	}
	
}



class datalist{
	/* static �޼ҵ带 Ȱ���ϴ� ���� : ���� package���� �ش� �޼ҵ带 ���� ����ؾ� �ϴ� �κп�����
	   static�� �̿��Ͽ� ����մϴ�.
	   static(�����޼ҵ�) : �������̵��� ����� �� ����
	   void�� ���(�����޼ҵ�) : �������̵��� ����� �� ���� 
	   
	   �������̵� ����
	   class a{
	   void �޼ҵ�
	   }
	   class b extend a {
	   void �޼ҵ�
	   }
	   
	   
	*/
	
	public void array_date(int a) {  // static ���� �޼ҵ�
		int w = 1;
		
		
		while(w<10) {
			
//		System.out.println(a*w);
			
			w++;
		}
		
		
		
	}
	
	public void pay1() {
//		System.out.println("�ſ�ī��� ���� �����մϴ�.");
	}
	
	public void pay2(String pm) {
//		System.out.println(pm + "���� ���� �����մϴ�.");
	}
	
}