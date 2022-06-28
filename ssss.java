import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ssss {

	public static void main(String[] args) {

		/* 숙제. ArrayList를 이용하여 결과값을 출력 되도록 합니다.
		   원시데이터 => {"red", "green", "blue", "pink", "orange", "black", "white", "hotpink", "gray"}
		   해당 데이터 색상 값중 6자 미만의 색상은 모두 삭제 후 결과 배열 값으로 생성하시오. 
		   [orange, hotpink]	*/

		String colors[] = {"red", "green", "blue", "pink", "orange", "black", "white", "hotpink", "gray"};
		ArrayList<String> arc = new ArrayList<>();
		int ea = colors.length;
		int a;
		for(a=0;a<ea;a++) {
			if (colors[a].length()>5) {
				arc.add(colors[a]);
			}
		}
		System.out.println(arc);
	}
}
