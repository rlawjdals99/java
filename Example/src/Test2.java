import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/* �����빮���� 5/25
		  ���ǹ� �ڵ带 �ۼ� �Ͻÿ�.
		  ���� �ڽ��� ���忡�� ��, ����� �ϴ� ���μ����� �����ؾ� �մϴ�.
		  ���� �⺻ �ڻ�ݾ� : 100,000
		  
		  "1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�." ��� �޼����� ���� ���� ���� �Ǿ�� �մϴ�.
		  
		  1���� �Է½� "�ش� �ݾ��� �Է��ϼ���."
		  ����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ���� �� �ڻ�ݾ��� ����Ͻÿ�.
		  
		  2���� �Է½� "����� �ݾ��� �Է��ϼ���."
		  ����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ� �� �ڻ�ݾ��� ����Ͻÿ�.  */
		
		int c = 100000;
		Scanner a = new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�.");
		int b = a.nextInt();
		int total;
		Scanner aa = new Scanner(System.in);
		
           if(b==1) {
        	   System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
        	   total = aa.nextInt();
        	   c += total;
           }
        	   
           else if (b==2) {
        	   System.out.println("����� �ݾ��� �Է��ϼ���");
        	   total = aa.nextInt();
		    c -= total;
		}
        aa.close();
       a.close();
		
		System.out.println("ó���� ������ ������ �����ϴ�" + c+"��");
	}
	}


