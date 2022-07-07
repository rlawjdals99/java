import java.util.ArrayList;
import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		/* [TEST1] 다음 해당 값이 있습니다.
		   해당 값에 대해 배열로 각각 저장 되도록 합니다. honggildong
		   결과 h,o,n,g,g,i,d,o,n,g 로 배열이 저장 되어야 합니다.
		   해당 처리는 외부 class에서 처리가 되도록 합니다.		 */

		name n = new name();
		n.user();
	}
}

class name{
	
	public void user() {
		
		String nm = "honggildong";
		String m[] = nm.split("");
		System.out.println(Arrays.toString(m));
		
		
		
	}
	
	
	
	
}
