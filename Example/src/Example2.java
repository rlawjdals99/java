import java.util.Iterator;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/* ���빮��2
		   ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�,
		   ������ ����� ����Ͽ� ¦�� ���� Ȧ�� ������ ����Ͻÿ�.
		   "�����ܿ� ���� ���ڸ� �Է��ϼ���?" ��� �޽����� ��µǸ�
		   �ش� ���ڿ� ���缭 ��� ����� ���ϸ�,
		   ���� ���� ���� ¦������ Ȥ�������� ����Ͻø� �˴ϴ�.
		   ��, �ش� �ݺ����� for ~ do while������
		   �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.	���ǹ��� �ݺ����ȿ� ������ �ȵ�.	 */
        Scanner sc = new Scanner(System.in);
        System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���.");   
        int k = sc.nextInt();
   		int a;
		int b;
		for(a=1;a<10;a++) {
			b = a * k;
			a++;
			System.out.println(b);
		}
			
		
		
		
		
		
		
		
		
	}

}
