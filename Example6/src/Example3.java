import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/* ����ڰ� �ش� ���� �Է��մϴ�.
		   ��, ����ڰ� �ΰ��� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι�° ���� ����
		   �ȿ� �ִ� ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�.
		   ��, �ش� �ڵ�� do ~ while �ۼ��մϴ�.
		   
		   ����)
		   ù��° ���� ���ڴ� ? 5
		   �ι�° ���� ���ڴ� ? 10
		   ���� ���� ��� �հ�� : 45�Դϴ�. */
		
    /*        Scanner a = new Scanner(System.in);
            System.out.println("ù��° ���ڸ� �Է��ϼ���");
            int b = a.nextInt();
            int c = 5;
            int total = 0;
            
            Scanner d = new Scanner(System.in);
            System.out.println("�ι�° ���ڸ� �Է��ϼ���");
            int e = d.nextInt();
            do {
				total += e; 
		       c++;
            } while (c<=10);
            System.out.println(total);  */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� ���ڴ�?");
		int a = sc.nextInt();
		System.out.println("�ι��� ���� ���ڴ�?");
		int b = sc.nextInt();
		int total = 0;
		do {
			total += a;
			a++;
		} while (a<=b);
			System.out.println("���� ���� ��� �հ��? " + total);
	
	
	}
	}


