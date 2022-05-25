
public class Datatype {

	public static void main(String[] args) {
		String a = "1234";//string 문자열 무조건 ""
		System.out.println(a);
		/*
		 * 정수형 시작
		 */
		byte b = 100;//byte 가장 작은 단위 -128~ 127
		System.out.println(b);
		
		short c = 30000;//-32768 ~ 32767
		System.out.println(c);
		
		int d = 1000000;// -2,147,483,647 ~ 2,147,483,648
		System.out.println(d);
		
		long f = 999999999;//long 0 18개 , 999L L<리미트 해제
		//long 사용시 끝에 L 사용.
		System.out.println(f);
		//정수형 끝
		
		//실수형 시작
		float z = 3.5f;//3.64845+38 _ f를 꼭 사용 해야함
		System.out.println(z);
		double k = 44.5;//1.784+380 _ d를 사용해도 가능
		System.out.println(k);

	}

}
