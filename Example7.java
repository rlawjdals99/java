import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * [TEST1]
	  	   ��ǻ�Ͱ� 1~9���� ���ڸ� �� 5�� �ݺ� �մϴ�.
		   5�� �ݺ��ϴ� ���� �迭�� �ش� ���� ���� �Ǿ�� �մϴ�.
		   ��, �ߺ��� ���� ���� �迭�� �Է� ���� �ʵ��� �մϴ�.
		   �� ��Ʈ �迭�� ArrayList�� ����ϸ�, �迭�� �ߺ��� ���δ� ������ return �޼ҵ带 
		   Ȱ���Ͽ� üũ �ǵ��� �մϴ�.   ���� ���� [2,3,7,9,4] */
	
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