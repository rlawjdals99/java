
public class Exception6 {

	public static void main(String[] args) {
		/* ���빮��. ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� ���� ����
		   �ܺ� Ŭ������ �����մϴ�.
		   �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ�
		   Ȧ���� ��� "Ȧ���� �Դϴ�," �� �ٽ� ȸ�� �ǵ��� �մϴ�. */	
//���ϸ޼ҵ�:��Ʈ��  //return�� "Ȧ���� �Դϴ�" �� ���󰡾��� value of, parserint
	
		/* ���빮�� ����.
		   ������ ���� {"ȫ�浿", 55, "������", "������", 48, "�̼���", "����", 34, 88 };
		   �ش� ������ �� �� ���ڰ��� ��� �ǵ��� ��迭 �Ͻÿ�.
		   ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter) �� �����մϴ�.
		   �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�. 
		   getter���� �ش� �迭�� return���� �������� �մϴ�.
		   ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.  */
		
		
		int a = 45*3+16+5+22*8;
		String b = null;
		try {
		a = Integer.valueOf(b);
		plus p = new plus();
		p.minous(b);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
	}
}
class plus{
	
	public String minous(String gg) throws Exception {
		
		
		return null;
	}
	
	
	
	
}