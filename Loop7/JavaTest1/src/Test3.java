import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("���ڸ� �Է��� �ּ���.");		
		int a = sc.nextInt();
		
		if (a>60) {
			System.out.println("�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.");
		}
		
		else if (a % 2 == 0) {
			System.out.println("¦��");
		}
		
		else {
			System.out.println("Ȧ��");
		}
		
		sc.close();
	}

}
