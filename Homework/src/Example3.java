import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * [문제1] 총 8번의 사용자가 숫자를 입력 합니다. 
		 * 해당 숫자를 입력하는 Scanner은 userinput이라는 메소드 에서 처리를 해야 하며 
		 * 해당 모든 값에 대한 더한 결과는 result에서 값이 출력 되도록 하는 프로그램을 제작하시오.
		 *  힌트 (외부클래스에서 메소드2개 생성)
		 */

		sub s = new sub();
		s.userinput();
		
	}
}
class sub{
	private int total = 0;
	
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<9;i++) {
			System.out.println("숫자를 입력하세요.");
			int a = sc.nextInt();
			this.total += a;
		}
		result();
	}
	
	public void result() {
		System.out.println(this.total);
	}
}