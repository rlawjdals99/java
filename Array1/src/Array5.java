import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {

// 빈배열 변수에 해당 데이터가 있는 배열로 커스텀 방법
		int a[] = new int [3];  // 3개의 공간만 제공함

	    int b[] = {1, 2, 3, 4, 5, 6, 7}; // 7개의 객체가 있는 상황

	    int a_ea = a.length; 
	    int ea = b.length; // b배열안에 몇개의 데이터 객체가 들어있는지 확인
   // System.out.println(a.length);
	    int w = 0;
	    int ct = 0;
	    while(w<ea) {
	    	
       if (b[w]%2==0 && ct<a_ea) {  //if(b배열의 값중 짝수만 && 새로운 a 배열에 전체 객체 크기 만큼만)
          a[ct] = b[w];		
          ct++;  // 조건에 맞을시 인덱스 번호를 +1씩 증가시킴
       }
       w++;
	    }	    
       System.out.print(Arrays.toString(a));

       
      
	    }	    	
	}


