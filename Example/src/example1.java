import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayList
public class example1 {

	public static void main(String[] args) {
		String color[] = {"red", "blue", "green"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(color));
//		System.out.println(al);
		al.remove(1);
//		System.out.println(al);
		
		int number[] = {1,2,3,4};
		Integer number2[] = {number[0],number[1],number[2],number[3]};
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(number2));
//		System.out.println(al2);
		
		/*�����ڵ�
		int abc[] = {3,4,7,9,10};
		List<Object> al3 = new ArrayList<>(Arrays.asList(abc));
//		System.out.println(Arrays.toString(al3.get(0)));
		Object test = al3.get(0);	//int -> Object�� ����� �ٽ� �ε� �ϱⰡ ����  */
		
		//�����ڵ�
		int abc[] = {3,4,7,9,10};
		List al3 = new ArrayList<>();
		int w = 0;
		while(w<abc.length) {
			al3.add(abc[w]);
			w++;
		}
		int num = Integer.parseInt(al3.get(1).toString());
		System.out.println(num);	//����
		System.out.println(al3);	//�迭
		
		List al4 = new ArrayList<>();
		al4.add("A");
		al4.add(10);
		al4.add("B");
		al4.add(20);
		al4.add(30);
		int check = Integer.parseInt(al4.get(1).toString());
		String check2 = String.valueOf(al4.get(0).toString());
//		System.out.println(check);
//		System.out.println(check2);
		
		/* ����. ArrayList�� �̿��Ͽ� ������� ��� �ǵ��� �մϴ�.
		   ���õ����� => {"red", "green", "blue", "pink", "orange", "black", "white", "hotpink", "gray"}
		   �ش� ������ ���� ���� 6�� �̸��� ������ ��� ���� �� ��� �迭 ������ �����Ͻÿ�. 
		   [orange, hotpink]	*/
		
		
	}
}
