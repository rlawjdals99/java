import java.math.BigInteger;
import java.util.Iterator;

public class Big_loop {

	public static void main(String[] args) {
		
		/* 1 ~ 100���� ��ü ���� ���϶�. 
		
		int a;
		int total = 0;
		for(a=1;a<=100;a++) {
			total += a;
		}
		System.out.print(total); */
		
		/* 1 ~ 100���� ���� �������? */
		int a;
		// BigInteger : java���� ��� ������ ���� ���� �� �� �ִ� ������ �ڷ�.
		BigInteger b = new BigInteger("1");
		// �հ迡 ����� �ڷ��� ���� 1�� ���ʰ����� ����. ��, ""�� ������ �����ؾ���.
		for(a=1;a<=100;a++) {
			/* multiply : ��Ģ���� ���ϱ⸦ ���
               divide : ��Ģ���� �����⸦ ���
			   add : ��Ģ���� ���ϱ⸦ ���
               subtract : ��Ģ���� ���⸦ ���
			 */
			b = b.multiply(BigInteger.valueOf(a));
		}
		System.out.println(b);
		
		
		
	}

}
