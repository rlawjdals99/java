import java.util.Iterator;

public class Double_loop4 {

	public static void main(String[] args) {


		/* 응용문제. 복합반복문 for, do~while		 */
		
		int f;
		for(f=2;f<4;f++) {
			int w = 1;
			
			do {
				
		//		System.out.println(f + "*" + w + "="+(f*w));
				
				w++;
			} while (w<10);
		}
		
		
		/* 응용문제. 구구단 7~9단까지. 
		   단, 각 구구단 곱셈값은 5까지만 나오도록 합니다. 
		   7*1=7 ~ 7*5=35, 8*1=8...9*5=45  do~while ~ while		 */

		
		int a = 7;
		do {
						
			int aa = 1;
			while(aa<6) {
		//		System.out.println(a + "*" + aa + "=" + (a*aa));
				
				aa++;
			}			
			
			a++;
		} while (a<10);
		
		
		/* 응용문제. 다음 결과값을 확인하여 코드를 작성합니다.
		   단, for ~ while문으로 제작.
		   1*1=1
		   2*2=4
		   3*3=9
		   4*4=16
		   5*5=25
		   6*6=36
		   7*7=49
		   8*8=64
		   9*9=81		   */
		
		int r;
		int total = 1;
		for(r=1;r<10;r++) {
			
			int t = r;
			
			while(t<=r) {
				total = r*t;
				System.out.println(r + "*" + t + "=" + total);
				
				t++;
			}
		}

		/* 응용문제(집에서). 다음 해당 결과값처럼 출력이 되도록 더블반복문을 이용하시오.
		   while ~ do~while
		   1+1=2
		   2+1=3
		   2+2=4
		   3+1=4
		   3+2=5
		   3+3=6
		   4+1=5
		   4+2=6
		   4+3=7
		   4+4=8		  */
		
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
