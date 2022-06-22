import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/* ���빮�� ����.
		   ������ ���� {"ȫ�浿", 55, "������", "������", 48, "�̼���", "����", 34, 88 };
		   �ش� ������ �� �� ���ڰ��� ��� �ǵ��� ��迭 �Ͻÿ�.
		   ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter) �� �����մϴ�.
		   �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�. 
		   getter���� �ش� �迭�� return���� �������� �մϴ�.
		   ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.  */
		
		try {
			Object data[] = {"ȫ�浿", 55, "������", "������", 48, "�̼���", "����", 34, 88 };
			rdata r = new rdata();
			r.setter(data);
			LinkedList result = r.getter();	//return �޴� ���� �迭 class�̹Ƿ� �ش� class������ ���� �� �޾ƾ� �˴ϴ�.
			System.out.println(result);
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class rdata{
	LinkedList<String> redata = new LinkedList<>();
		
	public void setter(Object[] call) throws Exception{
	int ea = call.length;
	int w = 0;
	do {
		try {
			//�ش� �迭�� �ε�� (�ڷ���) ��ȯ�� �ϴ� ������ Object�迭 �̹Ƿ� �����Ͽ���
			String check = String.valueOf((String)call[w]);
			this.redata.add(check);
		} catch (Exception ex) { //�ڽ� class���� ���� �߻��� ��µǴ� catch��.
								 //��, throw ����ϸ� �ٽ� main���� ����.
								 //�߿��� ������ throw�� ���޽� �ش� �ݺ����� �����ϰ� �˴ϴ�.
		}
		w++;
	} while (w<ea);
	
	}

	public LinkedList<String> getter() {
		return this.redata;
	}
}