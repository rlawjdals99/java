import java.util.Iterator;
import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {

		member2.lists2();
		//�޸𸮿��� �ε�
		
		member2 mb2 = new member2();  
		//static�� ���� �Լ��̹Ƿ� ��ü �� �ν��Ͻ��� ����
		
		mb2.lists();   
		// �ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε��ϰ� ��

		member2.lists3("������",12345);

		
		/* ���빮�� for_in �̶�� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�.
		   ���α׷� ����� ������ ���� ������ �մϴ�.
		   "����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ��� : "
		   [���] - �ش� �޼ҵ忡�� ����� ����ؾ���. 
		   ���� ����ڰ� 3���� �Է½� 3*1=3 ~ 3*9=27 ��� �Ǿ�� ��.   (for�� ����) */
		   
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ���.");		
		int b = sc.nextInt();
		member2.for_in(b);
		sc.close();
		
		
		
		
		
		
		
	}

}

class member2{
	
	public static void for_in(int d) {
		int c;
	for(c=1;c<10;c++) {
		System.out.printf("%d * %d = %d ",d,c,(d*c));
		
	}
	
	
	}
	
	
	
	public void lists() {   // �޸𸮿� ������ �Ҵ���� �޼ҵ� �Լ��� ����
		String a = "ȫ�浿";
//		System.out.println(a);
	}
	
	public static void lists2() {  
		String a = "�̼���";
//		System.out.println(a);
	}

	public static void lists3(String nm, int pw) {
         // nm�� �޼ҵ忡�� �ܴ� �޴� ���� �ٷ� ����� ��� (nm.equals("������"))
		
		int user_pw = pw;      
		// �޼ҵ忡 ��ü���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� �ܴ� �޴� ����
		
		if (nm.equals("������") && pw == 12345) {
			
//			System.out.println("ȸ�� Ȯ���� �Ǿ����ϴ�");
		}
		else {
//			System.out.println("��ȸ�� �Դϴ�.");

		}
	
	}
	
	
	
		
}