import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/* ���빮�� �� 2���� ������ �ϰ� �˴ϴ�.
		   ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanner �����Ͻÿ�. */
         Scanner a = new Scanner(System.in);
         int b = 1;
         int d;
         int total = 0;
         while(b < 3) {
        	 System.out.println(b + "��° ���ڸ� �Է��� �ּ���.");
        	 d = a.nextInt();
        	 total = total + d;
        	 b++;        	 
        	 
         }
	System.out.println("�� ���� ���� : " + total);
	
	}

}
