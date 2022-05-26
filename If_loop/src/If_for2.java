import java.util.Iterator;

public class If_for2 {

	public static void main(String[] args) {
		// 1~100까지의 숫자 중 80이상의 숫자만 출력
          int f;
          for(f=1;f<101;f++) {
        	  
        	  if(f>=80) {
        	//	  System.out.print(f+ " ");
        	  }
          }
          
          // 200 ~ 300까지 숫자 중 240이하의 숫자만 출력하세요.
          
          int a;
          for(a=200;a<301;a++) {
        	  
        	  if(a<241) {
        	//	  System.out.print(a+ " ");
        		          	  }
          }
          
          final int b = 3;
          int c;
          for(c=1;c<11;c++) {
        	  
        	  if(c % b == 0) {
        //		  System.out.print(c+ " ");
        	  }
        	         }
          //응용문제. 구구단 중 2단을 반복합니다. 단, 2단 결과값 중 10 이상 숫자만 출력하시오.
          final int g = 2;
          int ww;
          int total;
          for(ww=1;ww<=9;ww++) {
        	  total = g * ww;
                 if (total > 10) {
				//	    	  System.out.print(total+" ");
                 }        	  
          }
          /* 응용문제. 다음 결과값을 보고 해당 값이 출력 되도록 코드를 제작하시오.
                     18 36 54 72 */
          
          final int k = 9;
          int j;
          int total1;
          for(j=1;j<=9;j++) {
              total1 = j * k;
              if(j % 2 == 0) {
        //    	  System.out.print(total1+" ");
            	                }
          }
 /* 응용문제. 다음 결과값을 보고 해당 값이 출력되도록 코드를 제작시오.
             1~20 사이의 숫자입니다.
             6 14 17 19     */ 
                                
          int aa;
          int total3;
          for(aa=1;aa<21;aa++) {
				
          	if (aa=6 || aa=14 || aa=17 || aa=19) {
          	System.out.printin(aa + " ");
        	 }
        	 }
         
         }
	}
	
         }

