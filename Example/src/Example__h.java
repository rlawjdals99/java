
public class Example__h {

	public static void main(String[] args) {
		/* 응용문제
		   결제 최종금액이 있습니다.
		   최종금액은 60000입니다.
		   단, "할인 %를 입력해 주세요" 라는 문구와 함께
		   해당 할인 숫자를 입력하면 최종금액이 변경 되어 출력되도록 합니다. */

		int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01;
		System.out.println(a);
        double b = money * a;
        System.out.println(b);
        double c = money - b;
		System.out.println(c);
		
	}

}
