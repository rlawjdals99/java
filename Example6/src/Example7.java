import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
           /* ���빮��7
            ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� ����ϴ� ���μ��� �����մϴ�.
            "ù��° �Է°�(1 ~ 10����) �Դϴ�."
            "�ι�° �Է°�(1 ~ 10����) �Դϴ�." 
            "����° �Է°�(1 ~ 10����) �Դϴ�."
            ������ �����Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�. "+, -, *, /"
            �ش� �����ȣ�� �°� ������� �����Ͽ� �������� ��½�Ű�ÿ�.
            */
		  Scanner a = new Scanner(System.in);
		  System.out.println("ù��° ���� �Է����ּ���."); 
		  int b = a.nextInt();
		  System.out.println("�ι�° ���� �Է����ּ���."); 
		  int c = a.nextInt();
		  System.out.println("����° ���� �Է����ּ���."); 
	      int d = a.nextInt();
	      System.out.println("�����ȣ�� �Է����ּ���."); 
          String e = a.next();
          
          if (e.equals("+")) {
			System.out.println(b+c+d);
		}		
          else if (e.equals("-")) {
        	  System.out.println(b-c-d);
		}
          else if (e.equals("*")) {
        	  System.out.println(b*c*d);	
          }
          else {
        	  System.out.println(b/c/d);
		}		}                
	}