import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) {
		try {
			ex e = new ex();
			e.loader("data");

//			Exception aaa = new Exception();
//			throw aaa;
		} catch (Exception e) {
			if (e.getMessage()!=null) {
				
			}
			System.out.println("test");
		}

	}
}

class ex {
	Exception ep = null;

	public void loader(String a) throws Exception { // throws : try~catch�� �ޱ� ���� class�� �ε�
		// �߸��� �������� (�ڽ��� ������ ���� main class�� ��� �����ϴ� ��Ȳ��)
		
//		if (a == "ok") {
//			int keycode = Integer.valueOf(a); // ������������, loader class ��ü���� ������ �߻�
//		} else {
//			// �ش� ������ �ڽ��� �������׿� ���� ����ó���� �߸��� ���
//			this.ep = new Exception();
//			throw this.ep;
//		}
		try {
			if (a == "ok") {
			int keycode = Integer.valueOf(a); 
			} else {
				System.out.println("test");
			}		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			this.ep = new Exception();	//�ڽ��� ���������� ���Ϲ޾Ƽ� Ȯ����
			throw this.ep;
		}
	}
}