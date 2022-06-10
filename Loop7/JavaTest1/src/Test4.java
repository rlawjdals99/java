import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
 // 음수값 입력할 경우 "음수값으 ㄴ구구단을 이용할 수 없습니다."
		Scanner sc = new Scanner(System.in);
//		System.out.println("원하시는 구구단의 숫자를 입력해 주세요.");
//		int a = sc.nextInt();
//int b;
//int c;
//int d;
//			for(b=1;b<10;b++) {
//				for(c=1;c<b;c++) {
//		         d = c*b;			
//				}
//			}
        	 
		

		int b = 1;
		int total = 1;
		do {
			int c=1;
			do {
				
					System.out.println(b+"*"+c+"="+b*c);
				c++;
			} while (c<10);
			b++;
		} while (b < 10);

	}

}
