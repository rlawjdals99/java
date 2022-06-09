import java.util.Arrays;
import java.util.Iterator;

public class Array8 {

	public static void main(String[] args) {
        
		/* 정적배열
		int a[] = new int[2];
		a[0] = 22;
		a[1] = 32; */
		
		/* 동적배열
		int b[] = {1, 2, 3, 4};
		int [] c = {1, 2, 3, 4};
		int[] d = new int[] {1, 2, 3, 4}; */
		
		
		/* 2차배열 [][]*/
       /* 2차 정적배열
          String member2[][] = new String[3][3]; 		
        */
		
		
	String member[][] = { 
			{"홍길동", "김유신", "유관순"},
			{"25", "31", "22"}  
			};
	int ea = member.length; // 배열 갯수가 몇개있는지 확인
	int data_ea = member[0].length; // 해당 배열에서 데이터객체가 몇개있는지 확인
			
//	System.out.println(member[0][2]);
	int f, ff;
			for(f=0;f<ea;f++) {  //큰 반복문은 배열 갯수만큼 loop
                for(ff=0;ff<data_ea;ff++) { //작은 반복문은 배열에 있는 데이터 갯수만큼 loop
//				System.out.println((member[f][ff]));
                	
                }
				
			}
			
		/*	int [][] datas = {
				
					{1, 3, 5},
					{2, 4, 6}
			};
            int fea = datas.length;
            int dea = datas[0].length;
			int total = 0;	
            
		    int w, ww;
		    for(w=0;w<fea;w++) {
		    for(ww=0;ww<dea;ww++) {
		    	total += datas[w][ww];
		    }
		    
		    }
		    System.out.println(total);*/
					
	/* 응용문제. 해당 데이터 배열에 있는 모든 값중 짝수값만 모두 더하시오.
		1번 데이터 : 11, 42, 22, 16
		2번 데이터 : 7, 33, 10, 29 
		결과값 : 90   */
					
			int [][] a = {
					
					{11, 42, 22, 16},
					{7, 33, 10, 29}
			};
			int b = a.length;
		    int c = a[0].length;
		    
		    int total = 0;
		    int d, dd;
		    for(d=0;d<b;d++) {
		    	
		    	for(dd=0;dd<c;dd++) {
               
               if (a[d][dd]%2==0) {
            	   total += a[d][dd];				
			}               
		    	}		    			    	
		    }
		    System.out.println((total));
			
			
	// 선생님 풀이	
			int numbers[][] = {
					{11, 42, 22, 16},
					{7, 33, 10, 29}
			};
			
			int w = 0;
			int total1 = 0;
			
			while(w< numbers.length) {
			int ww = 0;
			
			while(ww<numbers[w].length) {
				if (numbers[w][ww]%2==0) {
					total1 +=numbers[w][ww];
				}				
				ww++;
			}			
				w++;
			}
			System.out.println(total1);				
	
	
	}

}
