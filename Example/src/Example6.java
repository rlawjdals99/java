import java.util.Iterator;

public class Example6 {

	public static void main(String[] args) {
         /* 응용문제6
           1 ~ 10까지 순차적으로 적용하는 반복문이 있습니다.
           단, 1 ~ 5까지는 모든값을 곱하고, 6 ~ 10까지는 모든값을 더합니다.
           해당 두개의 값을 비교하여 더한값이 큰지, 곱한값이 큰지를 결과로 출력하시오.    */
		int a;
		int total = 1;
		int total1 = 0;
		for(a=1;a<=10;a++) {		     
           if (a<6) {
        	   total *= a;	
             }        	 						
           else if (a<=10) {
			total1 += a;
		} 
		}
		if (total>total1) {
			System.out.println("곱한 값이 큽니다");
		}
		else if (total<total1) {
			System.out.println("더한 값이 큽니다");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}
		
		
	//	System.out.println(total); 
		
		
		
		
		}
		
		
		
		
		
	}

