import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
 // ������ �Է��� ��� "�������� ���������� �̿��� �� �����ϴ�."
		Scanner sc = new Scanner(System.in);
//		System.out.println("���Ͻô� �������� ���ڸ� �Է��� �ּ���.");
//		int a = sc.nextInt();
//int b;
//int c;
//int d;
//			for(b=1;b<10;b++) {
//				for(c=1;c<b;c++) {
//		         d = c*b;			
//				}
//			}
        	 
		

		int b = 1;
		int total = 1;
		do {
			int c=1;
			do {
				
					System.out.println(b+"*"+c+"="+b*c);
				c++;
			} while (c<10);
			b++;
		} while (b < 10);

	}

}
