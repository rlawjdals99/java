import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
         /* ���빮��9
          A�л��� ���� ������ �Է� �ް�  ��������� ������ ���α׷��� �����մϴ�.
          "������ �Է��ϼ���" ��� ������ �� 5���� ������ �Ǹ�,
          ��� ������ �ջ��� �� 5���� ������ ���� ��հ��� ���.   *Do~while*  
          ��� �޼����� "�ش� ������ ������: "���
          ��, ���� ������ 40�� ������ ��� "������Դϴ�."��� �޽��� ��� �� ���μ��� ����
          40�� �̻��� ��� "�հ�"�̶�� �޼��� ��� 
          [�߰���ȹ]
          "�Է��Ͻ� ���� ���� �����ּ���:"��� ���� ���� ��� ��
          �ش� ���� ����ŭ �ݺ����� ������ �Ǹ�, ���� ����ŭ ��հ��� ����
          */
		
	/*	Scanner a = new Scanner(System.in);
		int total = 0;
	    int d = 1;
	    System.out.println("�Է��Ͻ� ���� ���� �����ּ���: ");
	    int g = a.nextInt();
		do {
			System.out.println("������ �Է��ϼ���.");
			int b = a.nextInt();
			total += b;
			d++;
		} while (d<=g);
		int p = total/g;	//���
		System.out.println("�ش� ������ ������: "+p);
		a.close();
		if(p<=40) {
			System.out.println("������Դϴ�.");
		} else {
			System.out.println("�հ�");
		}                          */
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("�Է��Ͻ� ���� ���� �����ּ���.");
	    int subject = sc.nextInt();
	    int w = 0;
	    int user;
	    int total = 0;
	    while(w<subject) {
	    	System.out.println("������ �Է��ϼ���.");
	    	user = sc.nextInt();
	    	total += user;
	    	w++;
	    }
	    
	    int avg = total / subject;
	    String msg;
	    if (avg < 40) {
	    	msg = "������Դϴ�.";
		}
	    else {
	         msg = "�հ��Դϴ�";		
	        		 }	    
	    System.out.println("���� ��� ������ : " + avg + " �̹Ƿ� " + msg);		
		sc.close();
		
		
		
		
	}

}
