import java.util.Iterator;

public class Example6 {

	public static void main(String[] args) {
         /* ���빮��6
           1 ~ 10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
           ��, 1 ~ 5������ ��簪�� ���ϰ�, 6 ~ 10������ ��簪�� ���մϴ�.
           �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū��, ���Ѱ��� ū���� ����� ����Ͻÿ�.    */
		int a;
		int total = 1;
		int total1 = 0;
		for(a=1;a<=10;a++) {		     
           if (a<6) {
        	   total *= a;	
             }        	 						
           else if (a<=10) {
			total1 += a;
		} 
		}
		if (total>total1) {
			System.out.println("���� ���� Ů�ϴ�");
		}
		else if (total<total1) {
			System.out.println("���� ���� Ů�ϴ�");
		}
		else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
		
	//	System.out.println(total); 
		
		
		
		
		}
		
		
		
		
		
	}

