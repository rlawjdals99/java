
public class Dowhile_plus {

	public static void main(String[] args) {
		/* do~while : 30 ~ 35까지 합계를 출력하시오 */
         		
	    int a = 30;
	    int total = 0;

		do {
			
			total += a;
			a++;
		} while (a < 36);
//	System.out.println(total);

	/* 응용문제 합계숫자 189가 있다. 단, 1~10까지 합계치와 현재 189를 뺀 총합계를 구하시오.  */
	
	        int b = 1;
	        int total1 = 189;
	        do {
				
	          total1 -= b;
              b++;	
	        } while (b < 11);
System.out.println(total1);	
	}

}
