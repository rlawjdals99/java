import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/* ★응용문제★ 5/25
		  조건문 코드를 작성 하시오.
		  고객이 자신의 통장에서 입, 출금을 하는 프로세서를 제작해야 합니다.
		  고객의 기본 자산금액 : 100,000
		  
		  "1번 입력시 입금, 2번 입력시 출금입니다." 라는 메세지가 제일 먼저 실행 되어야 합니다.
		  
		  1번을 입력시 "해당 금액을 입력하세요."
		  사용자가 입력한 금액 + 기본 자산금액을 합한 총 자산금액을 출력하시오.
		  
		  2번을 입력시 "출금할 금액을 입력하세요."
		  사용자가 입력한 금액 - 기본 자산금액을 계산하여 총 자산금액을 출력하시오.  */
		
		int c = 100000;
		Scanner a = new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금입니다.");
		int b = a.nextInt();
		int total;
		Scanner aa = new Scanner(System.in);
		
           if(b==1) {
        	   System.out.println("입금할 금액을 입력하세요");
        	   total = aa.nextInt();
        	   c += total;
           }
        	   
           else if (b==2) {
        	   System.out.println("출금할 금액을 입력하세요");
        	   total = aa.nextInt();
		    c -= total;
		}
        aa.close();
       a.close();
		
		System.out.println("처리된 내용은 다음과 같습니다" + c+"원");
	}
	}


