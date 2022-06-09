import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/* 응용문제 : 사용자가 3번의 숫자를 입력합니다. 
		   3개 숫자를 모두 곱하여 총 합계 수를 출력하시오. */
         Scanner a = new Scanner(System.in);
         int b = 1;
         int c;
         long total = 1;  // long 입력시 최종결과에서 -음수가 발생함.
         do {
			System.out.println(b + "번째 숫자를 입력해 주세요.");
			c = a.nextInt();
			total = total * c;
			b++;
		} while (b<4);
		System.out.println("총 합계는 :" + total);
		a.close();
	}

}
