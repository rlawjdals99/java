import java.util.Iterator;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/* 응용문제2
		   사용자가 입력한 숫자에 맞춰서 구구단이 작동되며,
		   구구단 결과를 계산하여 짝수 인지 홀수 인지를 출력하시오.
		   "구구단에 대한 숫자를 입력하세요?" 라고 메시지가 출력되면
		   해당 숫자에 맞춰서 모든 결과를 더하며,
		   더한 값에 따라 짝수인지 혹수인지를 출력하시면 됩니다.
		   단, 해당 반복문은 for ~ do while문까지
		   한가지를 선택해서 작성하시오.	조건문이 반복문안에 있으면 안됨.	 */
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단에 대한 숫자를 입력하세요.");   
        int k = sc.nextInt();
   		int a= 1;
		int b;
		int total =0;
	
		do {
		//	total = total + (k*a); 
           total += k*a;  	
           a++;
		} while (a<10);
		System.out.println(total);
		if (total % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
	}		
		
		
	}


