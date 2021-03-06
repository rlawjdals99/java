import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		/* 인증번호 발송에 대한 번호 비교 코드
		 Q. 인증받은 번호를 입력하세요.
		 숫자 220524
	     사용자가 220524 외에 입력시 "인증번호가 틀립니다"라고 출력	
	     동일한 인증번호 입력 시 "인증확인 되었습니다" 라고 출력 
          단, 220524는 java실행시 가장 먼저 실행되는 변수로 처리 하세요.	
			 */
		  int sc = 220524;
		  Scanner a = new Scanner(System.in);
		  System.out.println("Q. 인증받은 번호를 입력하세요.");
		  int b = a.nextInt();
            
		  if (sc == b) {
			System.out.println("인증되었습니다.");
		}
		  else {
			System.out.println("인증번호가 틀립니다.");
		}
		  a.close();
	}
			}				


/* (scanner 주의사항)
1. scanner을 import 사용
2. 문구출력 (사용자가 어떤 값을 입력하는지에 대한 문구)
3. 해당 사용자가 입력한 값을 받는 변수를 지정

★응용문제★ 5/24
사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
첫번째 숫자값을 입력하세요.
두번째 숫자값을 입력하세요.

첫번째 숫자값 * 두번째 숫자값 에 대한 결과를 출력하시오.
단, 해당 결과값이 100 이하일 경우 "100이하의 결과값입니다." 라고 설정하고
100 이상일 경우 "해당값은 100이상 결과값 입니다." 라고 설정 */


/* ★응용문제★ 5/25
  조건문 코드를 작성 하시오.
  고객이 자신의 통장에서 입, 출금을 하는 프로세서를 제작해야 합니다.
  고객의 기본 자산금액 : 100,000
  
  "1번 입력시 입금, 2번 입력시 출금입니다." 라는 메세지가 제일 먼저 실행 되어야 합니다.
  
  1번을 입력시 "해당 금액을 입력하세요."
  사용자가 입력한 금액 + 기본 자산금액을 합한 총 자산금액을 출력하시오.
  
  2번을 입력시 "출금할 금액을 입력하세요."
  사용자가 입력한 금액 - 기본 자산금액을 계산하여 총 자산금액을 출력하시오.  */
