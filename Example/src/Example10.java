import java.util.Iterator;
import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
     /* ���빮�� 10
        ���� �̿����� ���� ���� ���α׷��� �����ϰ� �˴ϴ�.
        ���� �׸��� ��ü 3�����̸�,
        ��� true�� ���� �Ǿ�߸� ���� ���μ����� ������ �˴ϴ�.
        ����ڿ��� ���� �Ǵ� ������ ������ �����ϴ�.
        "�����׸� �����Ͻðڽ��ϱ�?" ��� �޽����� ���. ������(1), ���Ǿ���(2)
        
        ���� �׸��� �Ѱ����� �������� ���� ���
        "��� ���� �ϼž߸� ���� �˴ϴ�." ��� ��� �˴ϴ�.
        ��� ���� �Ͽ��� ���
        "ȸ�������� �Ϸ� �Ǿ����ϴ�." ��� ����մϴ�.    */
       
	/*	 Scanner sc = new Scanner(System.in);
		 int b = 1;
		 int d = 1;
		 boolean tr = true;
		 while(b<4) {
			 System.out.println("�����׸� �����Ͻðڽ��ϱ�?");
			 int c = sc.nextInt();
			 b++;
			 
			}
		 
	if (tr == true) {
		
	}
	else {
		System.out.println("��� ���� �ϼž߸� ���� �˴ϴ�.");
		 System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");*/
		 
		
		
		Scanner sc1 = new Scanner(System.in);
		int w = 1;
		int agree;
		boolean all_agree = false;
		do {
      System.out.println("�����׸� �����Ͻðڽ��ϱ�? ������(1), ���Ǿ���(2)");
      agree = sc1.nextInt();
      
      if (agree==1) {
    	  all_agree = true;
      }       
      else {
    	  all_agree = false;
               break;
      }	
     w++;
		} while (w<4);
		
		if (all_agree == false) {
			System.out.println("��� ���� �ϼž߸� ���� �˴ϴ�.");
		}
		else {
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		}
		sc1.close();
		
		
		
		
		
		
		
	}	
	}	
	


