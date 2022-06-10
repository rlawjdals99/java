import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요.");		
		int a = sc.nextInt();
		
		if (a>60) {
			System.out.println("해당 숫자는 60까지만 입력이 되어야 합니다.");
		}
		
		else if (a % 2 == 0) {
			System.out.println("짝수");
		}
		
		else {
			System.out.println("홀수");
		}
		
		sc.close();
	}

}
