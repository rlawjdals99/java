
public class Example2 {

	public static void main(String[] args) {
		/*[����2]
		  ���� Class�� return �޼ҵ带 �ϳ� �����մϴ�. ��, return �޼ҵ�� ����(����)�� ó���ϴ� �޼ҵ� �Դϴ�.
		  main �޼ҵ忡�� �ش� return �޼ҵ�� ���� 5�� ���ڰ����� �����ϴ�.
		  return �޼ҵ忡���� �ش� ���ڸ� ���� �� ���ϱ� 7�� �Ͽ� ��� ���� main �޼ҵ�� ������ main���� ������� 
		  ��� �ǵ��� �մϴ�.  ��Ʈ(getter)      */

		Example2 e = new Example2();
		int c = e.re(5);
		System.out.println(c);
	}
	
	public int re(int a) {
		int b = a*7;
		return b;
	}
}
