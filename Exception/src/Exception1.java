
//Exception : try, catch�� �Բ� ����� �ϰ� �˴ϴ�.(����ó������)
//RuntimeException : Error �߻��� ����ó�� üũ�� ���� - Null, Class, Arraysize
//OtherException : ����ó�� üũ���� �����
//Exception[����]

public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try {	//	(1) try : �ش� ���� int�� ������ 
			a = Integer.valueOf(b);	  // (2) error�߻� : a1�̶�� �����ε�, ������ ���ڷ� ��ȯ�� a��� ���ڷ� ���Ͽ� ����ǥ��
		} catch (NumberFormatException z) {
			System.out.println(z);  // (3) � �κп��� ������ �߻�
		}
		finally {
			b = b.replaceAll("[a-z][A-Z]","");	// (4) ������ ��ó��
			a = Integer.valueOf(b);   //  (5) �ٽ� ������ ���ۼ��ؼ� ���
		}
		System.out.println(a);	// (6) ���� ����� ���
		
	}
}
