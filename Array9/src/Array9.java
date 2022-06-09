import java.util.Arrays;
import java.util.Iterator;

public class Array9 {

	public static void main(String[] args) {

     /* 응용문제. 2개의 데이터 배열이 있습니다. 해당 데이터 배열을 
      * 다음 결과처럼 값을 출력하시오.
      * 1번 data : 대한민국, 일본, 중국, 베트남, 태국
      * 2번 data : 40, 35, 70, 55, 32
      * 결과 data : 
      * ["대한민국(40)", "일본(35)", "중국(70)", "베트남(55)", "태국(32)"]      */
	
		
			
	/*	String a[][] = {
			{"대한민국", "일본", "중국", "베트남", "태국"},
			{"40", "35", "70", "55", "32"}
	};
	
		
		
		int b = a.length;
		int c = a[0].length;
		String newa[] = new String[c];
	
		
		int d,dd;
		for(d=0;d<b;d++) {
		
         for(dd=0;dd<c;dd++) {
        
         }
			
			
		}
		System.out.println(Arrays.toString(a[d][dd]));			*/
    		
		
	/*	String data[][] = {
				{"대한민국", "일본", "중국", "베트남", "태국"},
				{"40", "35", "70", "55", "32"}
		};
		int ar = data.length;
		int ar2 = data[0].length;
		String newdata[] = new String[ar2];
		int w = 0;
		do {
			int ww = 0;			
			do {
                 newdata[ww] = data[0][ww] + "("+ data[1][ww]+")";				
				ww++;
			} while (ww<ar2);		
			w++;
		} while (w==0);		
		System.out.print(Arrays.toString(newdata));		*/
			
	
	/* 응용문제.
	 * 해당 두개의 배열 데이터가 있습니다. 각 배열별로 인덱스가 같은ㅂ 번호를 더해서 
	   짝수인지 홀수인지를 배열 결과 데이터로 재설정 하십시오 
	   A data = 5, 17, 19, 22, 33
	   B data = 1, 2, 3, 4, 5
	   Result = ["짝수", "홀수", "짝수", "짝수", "짝수"]  */
		
/*		int aa[][] = {
				
				{5, 17, 19, 22, 33},
				{1, 2, 3, 4, 5}
		};
		int cc = aa[0].length;
		String gg []= new String[cc];
		int total;
		int d = 0;
		String result;	
		String result_data[] = new String[cc];
		
      while(d<cc) {
	   total = aa[0][d] + aa[1][d];
    	  if (total%2==0) {
    		  result = "짝수";
		}
    	  else {
    		  result = "홀수";
    	  }
result_data[d] = result;			
d++;
      }
System.out.println(Arrays.toString(result_data));    	  */
    	  
	
		
		
	
	
	
	
	
	
	
	
	}

}
