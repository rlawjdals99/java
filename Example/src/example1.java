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
		
		/*망한코드
		int abc[] = {3,4,7,9,10};
		List<Object> al3 = new ArrayList<>(Arrays.asList(abc));
//		System.out.println(Arrays.toString(al3.get(0)));
		Object test = al3.get(0);	//int -> Object로 적용시 다시 로드 하기가 힘듬  */
		
		//정식코드
		int abc[] = {3,4,7,9,10};
		List al3 = new ArrayList<>();
		int w = 0;
		while(w<abc.length) {
			al3.add(abc[w]);
			w++;
		}
		int num = Integer.parseInt(al3.get(1).toString());
		System.out.println(num);	//낱개
		System.out.println(al3);	//배열
		
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
		
		/* 숙제. ArrayList를 이용하여 결과값을 출력 되도록 합니다.
		   원시데이터 => {"red", "green", "blue", "pink", "orange", "black", "white", "hotpink", "gray"}
		   해당 데이터 색상 값중 6자 미만의 색상은 모두 삭제 후 결과 배열 값으로 생성하시오. 
		   [orange, hotpink]	*/
		
		
	}
}
