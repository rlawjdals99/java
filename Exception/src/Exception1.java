
//Exception : try, catch와 함께 사용을 하게 됩니다.(예외처리사항)
//RuntimeException : Error 발생시 예외처리 체크를 안함 - Null, Class, Arraysize
//OtherException : 예외처리 체크사항 모두함
//Exception[종류]

public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try {	//	(1) try : 해당 값을 int로 변경함 
			a = Integer.valueOf(b);	  // (2) error발생 : a1이라는 문자인데, 강제로 숫자로 변환시 a라는 문자로 인하여 오류표시
		} catch (NumberFormatException z) {
			System.out.println(z);  // (3) 어떤 부분에서 문제가 발생
		}
		finally {
			b = b.replaceAll("[a-z][A-Z]","");	// (4) 데이터 재처리
			a = Integer.valueOf(b);   //  (5) 다시 문법을 재작성해서 사용
		}
		System.out.println(a);	// (6) 최종 결과값 출력
		
	}
}
