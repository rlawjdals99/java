import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
       /* 응용문제. 사용자가 다음과 같은 질문을 받습니다.
          "1 ~ 5"까지 숫자를 하나 입력해 주시길 바랍니다. 
          결과내용
          1 : 5% 할인쿠폰
          2 : 10% 할인쿠폰
          3 ~ 4 : 택배비 무료
          5 : 다음기회에       
                 
         */
		
		
	/*	   Scanner a = new Scanner(System.in);
		   System.out.println("1 ~ 5 까지 숫자를 하나 입력해 주시길 바랍니다. ");
		   int b = a.nextInt();
		
		   
		   switch(b) {
		        
		   case 1:
			    System.out.println("5% 할인쿠폰");
		        break;		   
	      
		        case 2:
			    System.out.println("10% 할인쿠폰");
			    break;
		      
		        case 3,4:
			    System.out.println("무료배송");
				break;
		        
		        case 5:
			    System.out.println("다음기회에");
				break;
		   }    
				a.close();   */
		
		  Scanner a = new Scanner(System.in);
		   System.out.println("1 ~ 5 까지 숫자를 하나 입력해 주시길 바랍니다. ");
		   int b = a.nextInt();
		   String  msg;     
		
		   
		 /*  switch(b) {
		   case 1:
			    msg = "5% 할인쿠폰";
		        break;		   
	      
		        case 2:
		        	msg = "10% 할인쿠폰";
			    break;
		      
		        case 3,4:
		        	msg = "무료배송";
				break;
		        
		        case 5:
		        	msg = "다음기회에..";
				break;  */
				
		   /* switch version형태 */
		   /* 실무에서 사용 */   
		   
		   switch(b) {  // 자바 14버전부터 사용가능
                case 1 ->{
                msg = "5% 할인쿠폰";	
                }
                case 2 ->{
                    msg = "10% 할인쿠폰";	
                    }
                case 3,4 ->{
                    msg = "무료배송";	
                    }
                default ->{
                    msg = "다음기회에";	
                    }               
                }		   
		   System.out.println(msg);
		a.close();	
		   }	   	
	}

