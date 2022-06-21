import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) {
		try {
			ex e = new ex();
			e.loader("data");

//			Exception aaa = new Exception();
//			throw aaa;
		} catch (Exception e) {
			if (e.getMessage()!=null) {
				
			}
			System.out.println("test");
		}

	}
}

class ex {
	Exception ep = null;

	public void loader(String a) throws Exception { // throws : try~catch를 받기 위한 class를 로드
		// 잘못된 문법사항 (자신의 오류를 상위 main class에 모두 전달하는 상황임)
		
//		if (a == "ok") {
//			int keycode = Integer.valueOf(a); // 정상적이지만, loader class 자체적인 오류가 발생
//		} else {
//			// 해당 문법은 자신의 오류사항에 대한 예외처리가 잘못된 경우
//			this.ep = new Exception();
//			throw this.ep;
//		}
		try {
			if (a == "ok") {
			int keycode = Integer.valueOf(a); 
			} else {
				System.out.println("test");
			}		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			this.ep = new Exception();	//자신의 오류사항을 리턴받아서 확인함
			throw this.ep;
		}
	}
}