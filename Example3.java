import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * [����1] �� 8���� ����ڰ� ���ڸ� �Է� �մϴ�. 
		 * �ش� ���ڸ� �Է��ϴ� Scanner�� userinput�̶�� �޼ҵ� ���� ó���� �ؾ� �ϸ� 
		 * �ش� ��� ���� ���� ���� ����� result���� ���� ��� �ǵ��� �ϴ� ���α׷��� �����Ͻÿ�.
		 *  ��Ʈ (�ܺ�Ŭ�������� �޼ҵ�2�� ����)
		 */

		sub s = new sub();
		s.userinput();
		
	}
}
class sub{
	private int total = 0;
	
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<9;i++) {
			System.out.println("���ڸ� �Է��ϼ���.");
			int a = sc.nextInt();
			this.total += a;
		}
		result();
	}
	
	public void result() {
		System.out.println(this.total);
	}
}