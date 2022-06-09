import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {

		/* 응용문제3
		   배열 +기본(클래스)메소드 문제
		   product "수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"
		   moneys : 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900
		   장바구니에 해당 상품을 모두 담았습니다.    75,600
		   단, 그 중 사과와 바나나는 제외하고 총 결제금액을 출력하시오. 
		 */
		
		String product[] = {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"};
		int moneys[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };
		Example3 ex = new Example3();
		ex.name(product,moneys);
	}

	public void name(String pd[], int mn[]) {

		int a = pd.length;
		int b;
		int total = 0;
		for(b=0;b<a;b++) {
			if (!pd[b].equals("사과") && !pd[b].equals("바나나")) {
				total += mn[b];
			}
		}
		System.out.println(total);
	}
}