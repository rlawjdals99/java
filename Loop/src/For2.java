
public class For2 {

	public static void main(String[] args) {
		int a;   // for문 초기값
		int b=2; // 연산에 사용할 변수
        int c;   // 연산한 결과값
        for(a=1;a<10;a++) {
        c = b * a;   // 산술연산 작업
     // System.out.print(c+" ");    // 연산된 결과값을 출력
		}
        
        /* 응용문제 다음 결과값을 보고 코드를 작성 하시오.
           45, 40, 35, 30, 25, 20  */
        
        int d;
        int e=5;
        int f;        
        for(d=9;d>=4;d--) {   //내림차순일 때 --, 오름차순일 때 ++
        	f = e * d;
        //	System.out.print(f+" ");
        }
        
        
        
	/* 응용문제 다음 결과값을 보고 코드를 작성 하시오. 
	   11, 22, 33, 44, 55, 66, 77, 88, 99   */	
        
        // 유형1
        int aa;
        int bb = 11;
        int cc;
        for(aa=1;aa<10;aa++) {
        cc = bb * aa;
       // System.out.print(cc+" ");
        }
      
        // 유형2
        int z;
        int x;
        for(z=1;z<10;z++) {
        x = (10*z)+z;
        System.out.print(x+",");
        }
	}
	}
	


