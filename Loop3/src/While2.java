
public class While2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c;
		while(a < 10) {
		
		c = b * a; // 산술연산
	//	System.out.print(c+" ");
		a++;  // while문에서는 산술연산보다 아래 있어야 함. 
		}
	
		
		
		
		
		
		
		
		
	/* 응용문제 해당 결과값을 확인하여 반복문으로 코드를 작성하시오. 
	   56, 49, 42, 35, 28, 21  */
	
		int e = 7;
		int d = 8;
		int f;
		while(d > 2) {
		f = d * e;
			System.out.printf("%d ", f);
		d--;
		}
	
		/* 응용문제
		   다음 결과값을 확인 하신 후 해당 결과값에 맞는 코드를 작성하시오.
		   4, 7, 10, 13, 16, 19, 22   */
		
	}

}
