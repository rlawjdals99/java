public class Java_test6 {

	public static void main(String[] args) {
		/*[���빮�� 1]

				���� ������ ������ JAVA�� �������� ������� ���α׷��� �����Ͻÿ�.
				�ش� �߻� Ŭ�������� login �Դϴ�.
				���]
				ȫ�浿�� ȯ���մϴ�.
				�̼��Ŵ� �ֹ��Ͻ� ������ �����ϴ�.
				��Ʈ) �ڽ� Ŭ������ 2�� �Դϴ�.  extends	*/
	
		well d = new well();
		d.lo("ȫ�浿");
		order o = new order();
		o.lo("�̼���");
		
	}	
}
abstract class login{
	String wellcome = "";
	String order = "";
	public abstract void lo(String a);
}

class well extends login{
	@Override
	public void lo(String a) {
		this.wellcome = "�� ȯ���մϴ�";
		System.out.println(a+this.wellcome);
	}
}

class order extends login{
	@Override
	public void lo(String a) {
		this.order = "�� �ֹ��Ͻ� ������ �����ϴ�.";
		System.out.println(a+this.order);
	}
}