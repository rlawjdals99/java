import java.util.Iterator;

public class Double_loop3 {

	public static void main(String[] args) {
	
		/* 응용문제. 다음 결과값이 출력 되도록 for문으로 작성하시오.
		 5+2=7
		 5+3=8
		 5+4=9
		 5+5=10
		 6+2=8
		 6+3=9
		 6+4=10
		 6+5=11
		 7+2=9
		 7+3=10
		 7+4=11
		 7+5=12
		 ...
		 9+5=14		  		 */
		
		int a,aa;
		int total = 0;
		for(a=5;a<10;a++) {
			
			for(aa=2;aa<6;aa++) {
				total = a+aa;
			//	System.out.println(a + " + " + aa + " = " + total);
			}
		}
		
		/* 응용문제. 더블while문으로 제작
		   9*7=63
		   9*6=54
		   9*5=45
		   8*7=56
		   8*6=48
		   8*5=40
		   7*7=49
		   7*6=42
		   7*5=35	 */
		
			int total1 = 1;
			int b = 9;
			
		while(b>6) {
			int bb= 7;
			
			while(bb>4) {
				total1 = b*bb;
			//	System.out.println(b + "*" + bb + "=" + total1);
				bb--;
			}					
			b--;
		}
			/* 응용문제. 다음 결과값을 보고 do~while문으로 제작하시오.
			   5+4=9
			   5+5=10
			   5+6=11
			   5+7=12
			   4+4=8
			   4+5=9
			   4+6=10
			   4+7=11
			   3+4=7
			   3+5=8
			   3+6=9
			   3+7=10		 */
		
		
		
		int c = 5;
		int total2 = 0;
		
		do {			
			int cc = 4;
			
			do {				
				total2 = c+cc;				
				System.out.println(c + "+" + cc + "=" + total2);			
				cc++;
				
		} while (cc<8);					
			c--;
			
		} while (c>2);
		
		
		
		

	}

}
