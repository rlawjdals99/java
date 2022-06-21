
public class Exception5 {
	//역할 : 값 주고, 출력만 함
	public static void main(String[] args) {
		words wd = new words();
		try {
			String result = wd.files(null);
			System.out.println(result);
		} catch (Exception e) {
//			System.out.println(e);
			if (e.getMessage() != null) {
				System.out.println(e);
			}
		}
		finally {
			try {
				String result = wd.files("홍길동");
				System.out.println(result);
				
			} catch (Exception e2) {
				System.exit(0);
			}
		
		}
		
		
	}
}

class words{
	//역할 : 값을 받고, 연산 후 return
	public String files(String aa) throws Exception{
		if (aa==null || aa.equals("")) {
			throw new Exception("값이 비어 있음");
		}
		else {
			String msg = aa+ "님 환영합니다.";
			return msg;
		}
		
		
	}
	
	
}