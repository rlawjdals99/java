import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {

		/* 배열 데이터 : "홍길동", "이순신", "유관순"
		   세개의 데이터가 있습니다.
		   메인 class에서 문자를 하나 전송 합니다.
		   단, 문자가 null로 보낼 수 있으며 배열 데이터와 관계 없는 "강감찬" 이라고
		   보낼 수도 있습니다.
		   외부 클래스 이름 : data_list
		   추상 클래스 이름 : v_constuct
		   외부 클래스 안에 내부 클래스 이름 : check
		   
		   결과
		   메인 class에서 강감찬을 적용할 경우
		   내부 클래스에서 "해당 사용자는 가입자가 아닙니다." 라고 출력
		   메인 class에서 이순신을 적용할 경우
		   내부 클레스에서 "해당 사용자가 있습니다." 라고 출력
		   단, ArrayList로 배열을 로드 하십시오.   */
		
	
//	data_list dl = new data_list();
//	dl.v_method(null);
//		data_list.check dc = dl.new check();
//		dc.db();
		 
		
		
		// 선생님 풀이
		data_list dl = new data_list();
		dl.v_method("강감찬");
		
		
	}
}

//abstract class v_constuct{
//	int a;
//	String mmsg;
//	String zz;
//	public abstract void v_method(String user_name);  // 추상 클래스
//}
//
//class data_list extends v_constuct{  // 외부 클래스
//
//	@Override
//	public void v_method(String user_name) {
//		
//		String user[] = {"홍길동", "이순신", "유관순"};
//		ArrayList<String> user_a = new ArrayList<String>(Arrays.asList(user));
//		int b = user_a.size();
//		
//		for(this.a = 0; this.a < b ;this.a++) {
//    	   if (user_a.equals(user_name)) {
//    		   this.mmsg = "해당 사용자가 있습니다.";
//		}
//    	   else  {
//    		   this.mmsg = "해당 사용자는 가입자가 아닙니다.";
//    	   }
//
//		}
//		
//		if (user_name == null) {
//			System.out.println("사용자 이름을 입력하셔야 합니다.");
//		}
//		else {
//			this.zz = user_name;
//			System.out.println(this.zz);
//		}
//		
////		System.out.println(user_a);
//		
//	}
//	
//	class check{  // 외부 클래스 안에 내부 클래스
//		
//		String msg3 = data_list.this.mmsg;
//		
//		public void ccall() {
//		System.out.println(msg3);
//		}
//	}
//}

abstract class v_constuct{
	String user_name;
	public abstract void v_method(String nm);  // 추상 클래스
}

class data_list extends v_constuct{  // 외부 클래스

	@Override
	public void v_method(String nm) {
		
		if (user_name == null) {
			System.out.println("사용자 이름을 입력하셔야 합니다.");
		}
		else {
			this.user_name = nm;
			check ck = new check();
			ck.db();
		}
		
	}
	
	
	class check{  // 부모 클래스에서 받은 값을 자식클래스로 이관
		String user_name = data_list.this.user_name;
		String data_list[];  // 필드에 배열을 받는 객체 생성
		ArrayList<String> ar = null;   //ArrayList util을 필드에 객체 생성

		public void db() {  // 해당 필드에 있는 ArrayList를 인스턴스로 적용함
			this.data_list = new String [] {"홍길동", "이순신", "유관순"};
			this.ar = new ArrayList<>(Arrays.asList(this.data_list)); // this로 처리
		     this.compare();  // 최종 DB와 사용자 정보를 비교하는 메소드
		}
	public void compare() {
		int ea = this.ar.size();
           	int w;
           	boolean bl = false;  // 확인작업
           	
           	for(w = 0 ; w < ea; w++) {
           		if (this.user_name.equals(this.ar.get(w))) {
				 bl = true;
           		}
           	}

           	if (bl==true) {
				System.out.println("해당 사용자가 있습니다.");
			}
           	else {
                  System.out.println("해당 사용자는 가입자가 아닙니다.");
			}
	}
	}
}
