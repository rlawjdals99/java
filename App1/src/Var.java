
public class Var {

	public static void main(String[] args) {
		//변수 : 지속적으로 변하는 수
		//1.선언방식 : 변수만 선언
		/*
		 * 2.변수+값을 같이 선언 하는 방식 
		 */
		String a1;//String은 문자열 
		a1 = "이순신입니다";
		a1 = "홍길동입니다";//= 값을 넘겨주는 기호(대입), == 같다
		System.out.println(a1);//변수명을 만든 후 값을 지정하여 넘겨주는 형태
		
		//2번 방식 시작
		String b1 = "이순신입니다";
		System.out.println(b1);
		/*
		 * 변수 확인 사항
		 */
	    a1 = "이순신입니다";//기존에 가지고 있는 데이터는 삭제되고,
	    //새로운 값으로 재설정됨
	    System.out.println(a1);

	}

}
