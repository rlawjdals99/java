import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/* ���빮�� : ����ڰ� 3���� ���ڸ� �Է��մϴ�. 
		   3�� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����Ͻÿ�. */
         Scanner a = new Scanner(System.in);
         int b = 1;
         int c;
         long total = 1;  // long �Է½� ����������� -������ �߻���.
         do {
			System.out.println(b + "��° ���ڸ� �Է��� �ּ���.");
			c = a.nextInt();
			total = total * c;
			b++;
		} while (b<4);
		System.out.println("�� �հ�� :" + total);
		a.close();
	}

}
