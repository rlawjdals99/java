import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/* ���빮��1) while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�.
	       ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�.
	       ��ǰ �� �ݾ� 70000 �Դϴ�.
	       ���� "7000 �����Ͻðڽ��ϱ�?" ��� ��µǸ�,
	       ����1�̶�� �Է��ϸ� �������� �ݾ׿� �߰� �Ǿ����ϴ�. ��, 2��� �Է½�
	       �������� �ݾ׿� �߰� �Ǿ����� �ȵ˴ϴ�.
	       
	       �� ���� Ƚ���� 4���Դϴ�.
	       �������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ� */

		    Scanner a = new Scanner(System.in);
		    final int money = 7000;
		    int w = 1;
		    int user;
		    int total = 0;
		    
		    while(w < 5) {
		    	System.out.println("7000�� �����Ͻðڽ��ϱ�?");
		    	user = a.nextInt();
		    	total += money;
		    if (user==1) {
						}
		    	  	w++;
		    			    }
		    System.out.println("���� �ݾ��� : " + total);
		    
		    
	}
}
