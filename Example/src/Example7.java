import java.util.Arrays;
import java.util.Iterator;

public class Example7 {

	public static void main(String[] args) {

		/* 응용문제7
	       다차원 배열로 생성 + 외부 class 및 메소드 사용
	       [data]
	       {"홍길동", "합격"}
	       {"이순신", "합격"}
	       {"강감찬", "불합격"}
	       {"김유신", "합격"}
	       {"유관순", "불합격"}
	       {"장보고", "불합격"}
	       	
	       	  다차원 배열 형태이며 해당 값중 합격자만 출력되도록 합니다.
	       	  단, 배열값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
	       	  
	       	  결과 : 홍길동, 이순신, 김유신    */
		
		hi ex = new hi();
		ex.name();
	}
}
class hi{
	
	public void name() {
		
		String user[][] = {
				   {"홍길동", "합격"},
			       {"이순신", "합격"},
			       {"강감찬", "불합격"},
			       {"김유신", "합격"},
			       {"유관순", "불합격"},
			       {"장보고", "불합격"}
                      		};
		int user1 = user.length;
		int user2 = user[0].length;
		int a;
		for(a=0;a<user1;a++) {
		int b;
			for(b=0;b<user2;b++) {
				if (user[a][b].equals("합격")) {
					
					System.out.println(user[a][0]);
				}
			}
		}
		
		
		
		
		
	}
	
	
}
