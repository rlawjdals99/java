package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {
	public static void main(String[] args) {
			//ArraysList, LinkdeList (�迭��)  - add, remove, get, size
			//Map (�迭Ű, �迭��) - put, remove, size
			//Map�� �迭Ű�� ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ���մϴ�.(�ӵ� �ֻ��)
			//���� Ű�� ���� �������� �ִ� ������ ��µ˴ϴ�.
			// �� Ű���� ���� �ߺ� ��Ű�� ����
			Map<String, String> m = new HashMap<>();
			//hong -> Hash function(HashMap) -> 0x21949CB (�ߺ����� �߻����� ����)
			m.put("hong", "ȫ�浿");
			m.put("kang", "������");
			m.put("", "�����ż�");		//����ִ� Ű�� ����� �� �� ������, Map�� �������� �ùٸ��� ����
			m.put("park", "");		//Ű�� ������ ���� ������� ���� ����		
			if (m.get("park").equals("")) {
				m.put("park", "��");
			}  
			m.remove("hong");
			System.out.println(m.get("park"));
			System.out.println(m);
	
			//Map : �������� �ڷ����� ����� �� ����
			Map<String, Integer> mm = new HashMap<>();
			mm.put("age",32); 
			mm.put("level", 5);
			System.out.println(mm);
			System.out.println(mm.keySet());  	//Ű�� ���
			System.out.println(mm.values());	//���� ���
			System.out.println(mm.containsKey("age"));		//�ش� Ű�� �ִ��� Ȯ��(������ true, ������ false)
	
	}
	}

