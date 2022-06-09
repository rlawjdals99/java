import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
	  Scanner a = new Scanner(System.in);
	System.out.println("입력할 내용을 적어주세요.");
	  // String memo = a.next(); // 스페이스바 입력까지만 적용
	  
	  String memo = a.nextLine();
	  System.out.println(memo);
	  
	  a.close();
	  
	  String mid = "park";    
	  int age = 25;           
	 /*
	  * 중요사항 
	  String = %s
	  숫자는 %d
	  %f : float, double
	  %t : date, time, 시간, 날짜
	  %b : boolean (true, flase)
	  */ 
	  
	  //System.out.println(mid + "님의 나이는" + age + "입니다.");
	  //printf : f라는 뜻이 format을 뜻함.
	  System.out.printf("%s님의 나이는 %d 입니다.", mid, age);
		
		
		
	}

}
