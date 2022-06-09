import java.math.BigInteger;
import java.util.Iterator;

public class Big_loop {

	public static void main(String[] args) {
		
		/* 1 ~ 100까지 전체 합을 구하라. 
		
		int a;
		int total = 0;
		for(a=1;a<=100;a++) {
			total += a;
		}
		System.out.print(total); */
		
		/* 1 ~ 100까지 곱한 결과값은? */
		int a;
		// BigInteger : java에서 모든 무한의 값을 저장 할 수 있는 유일한 자료.
		BigInteger b = new BigInteger("1");
		// 합계에 사용할 자료형 변수 1을 최초값으로 설정. 단, ""을 무조건 적용해야함.
		for(a=1;a<=100;a++) {
			/* multiply : 사칙연산 곱하기를 담당
               divide : 사칙연산 나누기를 담당
			   add : 사칙연산 더하기를 담당
               subtract : 사칙연산 빼기를 담당
			 */
			b = b.multiply(BigInteger.valueOf(a));
		}
		System.out.println(b);
		
		
		
	}

}
