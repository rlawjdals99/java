import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
	    /*[����2] �˻��� ����� �̸��� �˻��ϰ� �˴ϴ�. (���� �޼ҵ忡�� ����)		  
		  ����� ����Ʈ�� ������ �����ϴ�.
		  (�ܺ� Ŭ���� �� �ܺ� �޼ҵ忡�� ����) ������, �ǿ�ȯ, �ݻ���, �赿��, �����, ������, ����ȣ, ����		  
		  �ش� ����Ʈ ������ ������ �޼ҵ� ���� �����ؾ� �մϴ�. ����ڰ� �Էµ� �̸��� ���� ��� "�ش� ����ڰ� �ֽ��ϴ�." ��� ����ϰ� ����
		  ��� "�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�." ��� ����մϴ�.		  
		  ��Ʈ : ���θ޼ҵ忡�� Scanner �۵� �ϸ�, ������ �˻��� �ܺ� Class �� �ܺ� �޼ҵ忡�� ó�� */
	
			Scanner sc = new Scanner(System.in);
			System.out.println("�˻��� ����� �̸��� �Է��ϼ���.");
			String aws = sc.next();
			
			user u = new user();
			u.array(aws);
			
	}
}
class user{
	
	public void array(String scan) {
	String member = "������, �ǿ�ȯ, �ݻ���, �赿��, �����, ������, ����ȣ, ����";
	ArrayList<String> mb = new ArrayList<String>(Arrays.asList(member));
	int ea = mb.size();
	for(int i=0;i<ea;i++) {
		if (mb.get(i) == (scan)) {
			System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
		}
		else {
			System.out.println("�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�.");
		}
	}
	
	
	}
}