
public class Dowhile_plus {

	public static void main(String[] args) {
		/* do~while : 30 ~ 35���� �հ踦 ����Ͻÿ� */
         		
	    int a = 30;
	    int total = 0;

		do {
			
			total += a;
			a++;
		} while (a < 36);
//	System.out.println(total);

	/* ���빮�� �հ���� 189�� �ִ�. ��, 1~10���� �հ�ġ�� ���� 189�� �� ���հ踦 ���Ͻÿ�.  */
	
	        int b = 1;
	        int total1 = 189;
	        do {
				
	          total1 -= b;
              b++;	
	        } while (b < 11);
System.out.println(total1);	
	}

}
