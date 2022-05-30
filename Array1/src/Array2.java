import java.util.Iterator;

public class Array2 {

	public static void main(String[] args) {
		
		// hong, kim, park, lee, jang, jung
		
		String a[] = {"hong", "kim", "park", "lee", "jang", "jung"};
				
	//	System.out.println(a[4]);
	//	int word = a[4].length();
	//	System.out.println(word);
		
		/* 응용문제. 해당 사용자 리스트 배열이 있습니다.
		   해당 배열값 중 사용자 아이디 3단어 이상만 출력시키시오. */
        
		int member = a.length;    // 전체 회원수를 파악하기 위함
		int w =0;
 		int word;   // 각각의 배열 데이터의 문자 갯수 파악.
		
		while(w<member) {   // 세단어 이상의 데이터만 출력
			word = a[w].length();	// 문자 갯수파악
           		
			if (word >3) {  // 세단어 이상의 데이터만 출력
		//		System.out.println(a[w]);			
				
			}
			
			w++;
		}
		
		/* 응용문제. 배열데이터는 다음과 같습니다.
		   15, 60, 11, 14, 27 = 127
		   다음 데이터 값을 모두 더해서 최종 결과값을 출력하시오.   */
		   
		int d[] = {15, 60, 11, 14, 27};
		int t = d.length;
		int total = 0;
		int y =0 ;
		while(y<t) {
			total += d[y];
			y++;
		}
		System.out.println(total);

	}

}
