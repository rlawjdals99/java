import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/* 응용문제8 숙제
		   다음 사용자 복권 관련 프로그램을 요청하였습니다.
		   사용자가 총 5개의 숫자를 입력하게 됩니다.
		   " 1 ~46 사이의 숫자를 입력해 주세요."
		   사용자가 입력한 5개 숫자를 배열로 생성합니다. (main에 처리)
		   
		   외부 class를 이용하여 PC가 직접 당첨 번호 5개를 랜덤하게 뽑아냅니다.
		   PC가 뽑은 5개의 숫자를 배열로 생성합니다.(외부 class method로 생성)
           
           별도의 결과 method를 하나 더 생성하여
           사용자가 입력한 5개의 배열 데이터와 PC가 뽑은 배열 데이터를
           해당 method로 전달하여, 출력하시면 됩니다.                  
           
           단 모든 사용하는 반봅문은 무조건 do~while문으로 작성합니다.       */
	
		int b[] = new int[5];
           Scanner sc = new Scanner(System.in);
           int a = 1;
           int w = 0;
          String total= "";
           do {
        	   System.out.println( "1 ~ 46 사이의 숫자를 입력해 주세요.");
        	   int sc2 = sc.nextInt();
			  total += (sc2+" ");
        	   a++;
		} while (a<=5);
	
           System.out.println("사용자가 입력한 숫자 : " + total);
           
           
          String total1[] = {total}; 
           
           
           
           
           
	
//	card.ucard(total); // PC
	
	
	
	
	}

}

class card{
	
	public static void ucard() {  // pc(5)
		Random r = new Random();
		int w = 1;
		do {
			
			System.out.print(r.nextInt(45)+1 + " ");
			w++;
		} while (w<=5);
		
		
		
	}
	public static void pcard(int pc) {  // user(5), pc(5)
		
	
	System.out.println();
		
	
//	card.pcard(aaa);  //PC,user
	
	
	
	
	}
}




