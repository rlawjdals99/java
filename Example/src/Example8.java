import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/* ���빮��8 ����
		   ���� ����� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
		   ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		   " 1 ~46 ������ ���ڸ� �Է��� �ּ���."
		   ����ڰ� �Է��� 5�� ���ڸ� �迭�� �����մϴ�. (main�� ó��)
		   
		   �ܺ� class�� �̿��Ͽ� PC�� ���� ��÷ ��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		   PC�� ���� 5���� ���ڸ� �迭�� �����մϴ�.(�ܺ� class method�� ����)
           
           ������ ��� method�� �ϳ� �� �����Ͽ�
           ����ڰ� �Է��� 5���� �迭 �����Ϳ� PC�� ���� �迭 �����͸�
           �ش� method�� �����Ͽ�, ����Ͻø� �˴ϴ�.                  
           
           �� ��� ����ϴ� �ݺ����� ������ do~while������ �ۼ��մϴ�.       */
	
		int b[] = new int[5];
           Scanner sc = new Scanner(System.in);
           int a = 1;
           int w = 0;
          String total= "";
           do {
        	   System.out.println( "1 ~ 46 ������ ���ڸ� �Է��� �ּ���.");
        	   int sc2 = sc.nextInt();
			  total += (sc2+" ");
        	   a++;
		} while (a<=5);
	
           System.out.println("����ڰ� �Է��� ���� : " + total);
           
           
          String total1[] = {total}; 
           
           
           
           
           
	
//	card.ucard(total); // PC
	
	
	
	
	}

}

class card{
	
	public static void ucard() {  // pc(5)
		Random r = new Random();
		int w = 1;
		do {
			
			System.out.print(r.nextInt(45)+1 + " ");
			w++;
		} while (w<=5);
		
		
		
	}
	public static void pcard(int pc) {  // user(5), pc(5)
		
	
	System.out.println();
		
	
//	card.pcard(aaa);  //PC,user
	
	
	
	
	}
}




