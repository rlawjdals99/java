import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���.");
		String a = mid.next(); // ����ڰ� ���̵� �Է�

		Scanner mpass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���.");
		String b = mpass.next(); // ����ڰ� �н����� �Է�

		// System.out.printf("���̵�:%s, �н�����:%s", a, b);

		if (a.equals("jung") || a.equals("su")) {
		if (b.equals("jung") && b.equals("j1234")) {
				System.out.println("�α��� �Ǿ����ϴ�.");
			} 
		else if (a.equals("su") && b.equals("ssh")) {
		System.out.println("�α��� �Ǿ����ϴ�.");	
		}
		else {
			System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���.");
		}
		
	}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}
		}
	}
	
		


/*
 * ȸ������ ���̵�� jung, su �н����� jung : j1234 su : ssh �ش� �ƾƵ� �ܿ� ��������
 * "���Ե��� ���� ����� �Դϴ�." ��� ��� ���� �н����尡 Ʋ����� "ȸ�������� �ٽ� Ȯ���ϼ���." ��� ��� ���̵� �� �н����尡 ���
 * ���� ��� "�α��� �Ǽ̽��ϴ�." ��� ���
 */
