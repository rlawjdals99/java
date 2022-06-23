package Ex;

public class Example6 {

	public static void main(String[] args) {
		int data[] = {10, 20, 30, 40, 50};
		
		order or = new order();
		or.order_check(data);	//setter로 값을 보냄
        int result = or.order_recall();	 //getter로 값을 가져옴
		System.out.println(result);  // 최종 결과값 적용
	}
}
abstract class abstr{
	//필드 자료형 변수 선언
	abstract public void order_check(int[] adata);  //setter
	abstract public int order_recall();  //getter
}

class order extends abstr{  //추상클래스
	//★★ 필드선언 해야할 때 : 1개 이상의 메소드에 값을 사용해야 할 경우만 필드에 선언 ★★
	private int total = 0;

	@Override
	public void order_check(int[] adata) {  //배열을 반복 + 짝수값만 출력 최종값
	int ea = adata.length;
	for(int i=0;i<ea;i++) {
		if (adata[i] % 2 == 0) {
			this.total += adata[i];
		}
	}
	}
	
	@Override
	public int order_recall() {	// 최종값을 리턴
		return this.total;
	}
}