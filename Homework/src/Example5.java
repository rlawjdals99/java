import java.util.ArrayList;
import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		/* [TEST1] ���� �ش� ���� �ֽ��ϴ�.
		   �ش� ���� ���� �迭�� ���� ���� �ǵ��� �մϴ�. honggildong
		   ��� h,o,n,g,g,i,d,o,n,g �� �迭�� ���� �Ǿ�� �մϴ�.
		   �ش� ó���� �ܺ� class���� ó���� �ǵ��� �մϴ�.		 */

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
