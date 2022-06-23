package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {

		/* 응용문제.
		   {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
		   abstract을 사용하여 setter, getter를 무조건 적용합니다.
		   메인에서는 해당 데이터를 외부 class로 전달하고 최종 정보값만 배열로 
		   생성하여 출력 되도록 합니다. 
		   단, setter에서 배열 데이터중 4자리 미만에 있는 배열만 새로 생성하여 
		   getter로 값을 받아 메인에서 배열로 출력하세요. */
		
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