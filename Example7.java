import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * [TEST1]
	  	   컴퓨터가 1~9까지 숫자를 총 5번 반복 합니다.
		   5번 반복하는 동안 배열에 해당 값이 저장 되어야 합니다.
		   단, 중복된 값은 절대 배열에 입력 되지 않도록 합니다.
		   ※ 힌트 배열은 ArrayList를 사용하며, 배열에 중복값 여부는 별도의 return 메소드를 
		   활용하여 체크 되도록 합니다.   정답 예시 [2,3,7,9,4] */
	
		random r = new random();
		r.ran();
		
	}
}
class random{
	ArrayList<Integer> ar = new ArrayList<>();
	public void ran() {
		Random rr = new Random();
		int b;
		for(int i=1;i<6;i++) {
			b = rr.nextInt(9)+1;
			this.ar.add(b);
		}
		System.out.println(this.ar);
	}
	
	
//	public int dom() {
//		return this.ar;
//	}
	
}