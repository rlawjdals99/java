import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {

		/* 응용문제2
           배열 + 기본(클래스)메소드 문제
		 product : 수박, 참외, 사과, 배, 딸기, 키위, 바나나, 망고 중
		 참외, 배, 키위를 삭제 하였습니다.
		 해당 상품 삭제 후 배열을 다시 재 리스트 하는 코드를 작성하시오.
		 단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 하며 
		 반복문은 Free 입니다. 결과 : [수박, 사과, 딸기, 바나나, 망고]   */
		
		
		String ft[] = {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"};
		
		Example2 ex = new Example2();
		ex.name(ft);
	}

	public void name(String ftr[]) {
	
	int e = ftr.length;
	int w = 0;
	int no = 5;
	int idx = 0;
	String newft[] = new String[no]; 
	
	do {
		if (!ftr[w].equals("참외") && !ftr[w].equals("배") && !ftr[w].equals("키위")) {
             newft[idx] = ftr[w];
             idx++;
		}
		w++;
	} while (w<e);
		
	System.out.println(Arrays.toString(newft));
		
		
	
		
		
		
	
	}
}
