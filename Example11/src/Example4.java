import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Example4 {

	public static void main(String[] args) {
         /* ���빮��4
            �迭���� + �⺻(Ŭ����)�޼ҵ� ����
            ����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�.
            "�б� �л� �̸��� �Է��� �ּ���."
            ������ �� �迭 �����ʹ� 5���� ���� �Ǿ� ���ϴ�.
            ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� �迭�� �����Ͽ� ����Ͻÿ�.
            ��) ����ڰ� �Է��� ���� : hong, kim, park, lee, jang
            ���) [hong, kim, park, lee, jang]   */
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		String total = "";
		do {
			System.out.println("�б� �л� �̸��� �Է��� �ּ���.");
			String sc2 = sc.next();
           total += (sc2+" ");
			a++;
		} while (a<5);
	
		name(total);

	}

	public static void name(String user) {

      String userin[] = user.split(" ");   
      // split : ���ڿ� �Ǵ� ���ڿ��� Ư������ �������� �迭�� ���� �� �ִ� ��ɾ��Դϴ�.
		System.out.println(Arrays.toString(userin));
		
	
		
		
		
	}
}
