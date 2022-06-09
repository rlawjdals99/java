
public class app {

	public static void main(String[] args) {
		//변수 a,b 자료 형태  int 
		// a= 10 , b= 20 c는 선언
		int a = 10;
		int b = 20;
		int c;
		//사칙연산기호 : +, -, *, /
		c = b / a;
		System.out.println(c);
		
		String a1 = "홍길동";
		String b1 = "환영합니다";
		String c1;
		
		c1 = a1	+ b1;//문자형태일때 +는 문자 + 문자열로 표현할 수 있습니다
		System.out.println(c1);
		
		/*\\|\
		 *응용문제
		 *다음과 같이 출력되는 코드를 완성하시오
		 *홍길동님 적립금은 50000 입니다.
		 *단, 홍길동 과 50000의 값은 지속적으로 변화할 수 있습니다.
		
		 */
		String x ="홍길동";
		int y = 50000;
		System.out.println(x + "님 적립금은"+ y +"입니다");
		
		/*
		 응용문제2
		 아마존 사이트에서 상품을 구매 했습니다.
		 장바구니에 담은 상품 가격을 모두 더해서 
		 총 결제 금액이 출력 되도록 하시오.
		 단, $ 환율로 출력 되어야 합니다.
		 8.25
		 4.02
		 3.71
		 결과 값은 다음과 같이 출력하세요
		 총 결제 금액 $ 입니다.
		 */
		double a11 = 8.25;
		double a22 = 4.02;
		double a33 = 3.71;
		double a44;
		a44 = a11 + a22 + a33;
		System.out.println("총 결제 금액" + a44 + "$입니다");
		
		
		int k = 9;
		int p = 10;
		double aw = (double)k/p;//연산형태의 자료형 또한 있는 코드 
		System.out.println(aw);
				
		
	}

}
