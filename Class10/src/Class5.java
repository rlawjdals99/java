import java.util.Iterator;
import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {

		member2.lists2();
		//메모리에서 로드
		
		member2 mb2 = new member2();  
		//static이 없는 함수이므로 객체 및 인스턴스를 생성
		
		mb2.lists();   
		// 인스턴스(메모리)에 있는 메소드를 로드하게 됨

		member2.lists3("유관순",12345);

		
		/* 응용문제 for_in 이라는 일반 메소드(메모리)가 있습니다.
		   프로그램 실행시 다음과 같이 질문을 합니다.
		   "사용하실 구구단 숫자를 하나 입력해 주세요 : "
		   [결과] - 해당 메소드에서 결과를 출력해야함. 
		   만약 사용자가 3단을 입력시 3*1=3 ~ 3*9=27 출력 되어야 함.   (for문 제작) */
		   
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 구구단 숫자를 하나 입력해 주세요.");		
		int b = sc.nextInt();
		member2.for_in(b);
		sc.close();
		
		
		
		
		
		
		
	}

}

class member2{
	
	public static void for_in(int d) {
		int c;
	for(c=1;c<10;c++) {
		System.out.printf("%d * %d = %d ",d,c,(d*c));
		
	}
	
	
	}
	
	
	
	public void lists() {   // 메모리에 별도의 할당없이 메소드 함수만 선언
		String a = "홍길동";
//		System.out.println(a);
	}
	
	public static void lists2() {  
		String a = "이순신";
//		System.out.println(a);
	}

	public static void lists3(String nm, int pw) {
         // nm을 메소드에서 잔달 받느 값을 바로 사용할 경우 (nm.equals("유관순"))
		
		int user_pw = pw;      
		// 메소드에 객체값을 첨부하여 로드 후 메소드 안에 별도의 필드명을 이용하여 잔달 받는 형식
		
		if (nm.equals("유관순") && pw == 12345) {
			
//			System.out.println("회원 확인이 되었습니다");
		}
		else {
//			System.out.println("비회원 입니다.");

		}
	
	}
	
	
	
		
}