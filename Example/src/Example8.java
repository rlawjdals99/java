import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Example8 {

	public static void main(String[] args) {
                /* ���빮��8
                   ����� �н������ a1234 �Դϴ�.
                   ����ڰ� �н����带 �Է��մϴ�. 
                   ��, 3ȸ �̻� ���н� ������ ���� ��� �ǵ��� �մϴ�
                   "�н�ȸ�� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�."
                   ��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�." ��� ��� �Ǿ�� �մϴ�. */
		
		
		String pw = "a1234";
		int c=3;
		Scanner aa = new Scanner(System.in);
		int w=1;
		String msg = "�н����带 �Է� �ϼ���.";
      while(w < 4) {
    	  System.out.println(msg);
    	  String userpw = aa.next(); 
    	  if(pw.equals(userpw)) {
    	  System.out.println("�α��εǾ����ϴ�.");
         break;    	//break�� �ݺ����� ���� ���� �� �� ����մϴ�. 
    	}
    	  else {
              msg = "�ùٸ� �н����尡 �ƴմϴ�.";
               c--;			
          if (c==0) {
			System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼ���.");
		}
          w++;
		}
    	  } 
      aa.close();
      }       
	}