import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		// intern() : equals�� ������� �ʰ� �ε��ȣ��(==) ��밡��
		String data[] = {"ȫ�浿"};
		String data2[] = {"ȫ�浿", "ȫ�浿"};  
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern();
		String d = new String("ȫ�浿");
		String h = new String(data2[0]).intern();
		String h2 = new String(data2[1]).intern();
		String e = data[0];
//		Scanner sc = new Scanner(System.in);
//		String f = sc.next().intern();
		
		String g = new String(a);
		System.out.println(e==c);
		// new String : �Ҽ��� ���� �����й��� �ڷ���(����, �迭��)
		
//		if (a==e) {
//			System.out.println("���� �����ϴ�.");
//		}
		
		
	}
}
