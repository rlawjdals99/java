import java.util.Iterator;

public class If_for2 {

	public static void main(String[] args) {
		// 1~100������ ���� �� 80�̻��� ���ڸ� ���
          int f;
          for(f=1;f<101;f++) {
        	  
        	  if(f>=80) {
        	//	  System.out.print(f+ " ");
        	  }
          }
          
          // 200 ~ 300���� ���� �� 240������ ���ڸ� ����ϼ���.
          
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
          //���빮��. ������ �� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10 �̻� ���ڸ� ����Ͻÿ�.
          final int g = 2;
          int ww;
          int total;
          for(ww=1;ww<=9;ww++) {
        	  total = g * ww;
                 if (total > 10) {
				//	    	  System.out.print(total+" ");
                 }        	  
          }
          /* ���빮��. ���� ������� ���� �ش� ���� ��� �ǵ��� �ڵ带 �����Ͻÿ�.
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
 /* ���빮��. ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 ���۽ÿ�.
             1~20 ������ �����Դϴ�.
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

