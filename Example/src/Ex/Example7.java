package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {

		/* ���빮��.
		   {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
		   abstract�� ����Ͽ� setter, getter�� ������ �����մϴ�.
		   ���ο����� �ش� �����͸� �ܺ� class�� �����ϰ� ���� �������� �迭�� 
		   �����Ͽ� ��� �ǵ��� �մϴ�. 
		   ��, setter���� �迭 �������� 4�ڸ� �̸��� �ִ� �迭�� ���� �����Ͽ� 
		   getter�� ���� �޾� ���ο��� �迭�� ����ϼ���. */
		
		name n = new name();
		n.setter();
		ArrayList<String> aa = n.getter();
		System.out.println(aa);
	}
}
class name {
	ArrayList<String> ar2 = new ArrayList<>();
	public void setter() {
		String names[] =  {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};	
		int ea = names.length;
		ArrayList<String> ar = new ArrayList<>(Arrays.asList(names));
		for(String name : ar) {
			if (name.length()<4) {
				ar2.add(name);
			}	
		}
	}
	public ArrayList<String> getter() {
		return ar2;
	}	
}