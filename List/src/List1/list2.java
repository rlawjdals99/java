package List1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
/* 응용문제. 해당 데이터 값 중 휴면고객 데이터는 모두 삭제됩니다. 	
    고객 데이터
    김수빈, 김정현, 김창순, 박도현, 이경훈, 정재욱, 하윤성
    
    결과
    정재욱, 하윤성   */
	
/*	String data[] = {"김수빈", "김정현", "김창순", "박도현", "이경훈", "정재욱", "하윤성"};
	
	ArrayList<String> dt = new ArrayList<>(Arrays.asList(data));

//	int a;
//	for(a=0;a<5;a++) {
//		dt.remove(0);
//	}
//	System.out.println(dt);
	
int ea = dt.size();
int w = 0;
while(w<ea) {
	int ea2 = dt.size();
	int ww = 0;
	while(ww<ea2) {
		if (!dt.get(ww).equals("정재욱") && !dt.get(ww).equals("하윤성")) {
			dt.remove(0);
//			System.out.println(dt);
		}
	}
	w++;
}*/
	/* 응용문제. 짝수의 숫자를 모두 삭제 합니다.
	   10, 7, 6, 1, 11, 37, 41, 22
	   결과 : 7, 1, 11, 37, 41    */
      
       Integer number[] = {10, 7, 6, 1, 11, 37, 41, 22};
       ArrayList<Integer> nb = new ArrayList<>(Arrays.asList(number));
       
       int aa = nb.size();
       int bb = 0;
       while(bb<aa) {
    	   int p = nb.size();
    	  int c = 0;
    	  while(c<p) {
    		  if (nb.get(c) % 2 == 0) {
    	   nb.remove(c);
    	   break;
			}
    		  c++;
    	  }
    	   bb++;
		}
       System.out.println(nb);
    		  
    		  
    	   
    	   
       }
	}
