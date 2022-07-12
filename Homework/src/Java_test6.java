public class Java_test6 {

	public static void main(String[] args) {
		/*[응용문제 1]

				다음 제시한 사항을 JAVA에 다형성을 기반으로 프로그램을 제작하시오.
				해당 추상 클래스명은 login 입니다.
				결과]
				홍길동님 환영합니다.
				이순신님 주문하신 내역이 없습니다.
				힌트) 자식 클래스는 2개 입니다.  extends	*/
	
		well d = new well();
		d.lo("홍길동");
		order o = new order();
		o.lo("이순신");
		
	}	
}
abstract class login{
	String wellcome = "";
	String order = "";
	public abstract void lo(String a);
}

class well extends login{
	@Override
	public void lo(String a) {
		this.wellcome = "님 환영합니다";
		System.out.println(a+this.wellcome);
	}
}

class order extends login{
	@Override
	public void lo(String a) {
		this.order = "님 주문하신 내역이 없습니다.";
		System.out.println(a+this.order);
	}
}