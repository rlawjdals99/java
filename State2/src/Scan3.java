import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Q. 사용자가 원하는 숫자를 입력하세요.");
		int b = a.nextInt();
		// %는 값을 나누면서 나머지값을 확인하는 수
		int c = b % 2;
		if (c==0) {
			System.out.println("짝수입니다.");
		
			
		}
		else {
			System.out.println("홀수입니다.");
		}
		}
			
		}

	

