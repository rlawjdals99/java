import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
           /* 응용문제7
            사용자가 다음 질문에 확인하여 값을 입력 후 해당 결과를 출력하는 프로세서 제작합니다.
            "첫번째 입력값(1 ~ 10까지) 입니다."
            "두번째 입력값(1 ~ 10까지) 입니다." 
            "세번째 입력값(1 ~ 10까지) 입니다."
            마지막 질문입니다. 해당 세가지 값에 대한 산술기호를 적으시오. "+, -, *, /"
            해당 산술기호에 맞게 산술식을 적용하여 최종값을 출력시키시오.
            */
		  Scanner a = new Scanner(System.in);
		  System.out.println("첫번째 값을 입력해주세요."); 
		  int b = a.nextInt();
		  System.out.println("두번째 값을 입력해주세요."); 
		  int c = a.nextInt();
		  System.out.println("세번째 값을 입력해주세요."); 
	      int d = a.nextInt();
	      System.out.println("산술기호를 입력해주세요."); 
          String e = a.next();
          
          if (e.equals("+")) {
			System.out.println(b+c+d);
		}		
          else if (e.equals("-")) {
        	  System.out.println(b-c-d);
		}
          else if (e.equals("*")) {
        	  System.out.println(b*c*d);	
          }
          else {
        	  System.out.println(b/c/d);
		}		}                
	}