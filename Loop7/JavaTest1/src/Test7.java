import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���Ͻô� ������ �Է��� �ּ���.");		
		String a = sc.next();
		
		String msg;

		if (a.equals("����")) {
          msg = "red";
		}
		
		else if (a.equals("��Ȳ")) {
			msg = "orange";
		}
		
		else if (a.equals("���")) {
			msg = "yellow";
		}
		else if (a.equals("�ʷ�")) {
			msg = "green";
		}
		else {
			msg = "�ش� �ܾ�� ������ ���� �ʽ��ϴ�.";
		}
		
		System.out.println(msg);
		
		sc.close();
		
		
		
	}

}
