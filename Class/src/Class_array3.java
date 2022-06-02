import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		
		/* 응용문제. 다음 문자 배열 데이터 값이 있습니다.
	       a1 : 홍길동, 이순신, 강감찬, 유관순, 김유신
	       a2 : 100, 80, 39, 60, 55
		   
		   "검색하고자 하는 이름을 적어주세요." 출력하게 됩니다.
		   검색어에 이순신이라고 검색을 하게 되면
		   "이순신님은 80점 입니다." 라고 출력이 되어야 합니다.	 */
		   
		String member[][] = { 
				{"홍길동", "이순신", "강감찬", "유관순", "김유신"},
				{"100", "80", "39", "60", "55"}  
		};

		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요.");
		String sc2 = sc.next();  // 사용자가 입력한 데이터 sc2
		
	
	user a = new user();
	a.score(member,sc2);
		
	}
}
class user{	
	public void score(String t[][],String sc2) {
		
		int ee = t[0].length;
		
		int c,d;
		for(c=0;c<ee;c++) {
		
				if (sc2.equals(t[0][c])) {		
					System.out.println(t[0][c] + "님의 점수는 : "+t[1][c]);						
				}		
		}		
	}
}