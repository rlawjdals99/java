
public class Test2 {

	public static void main(String[] args) {

		int a = 100;
		String msg;
		
		if (a >= 90) {
			msg = "A등급 입니다.";
		}
		else if (a>=70 && a<90) {
			msg = "B등급 입니다.";
		}
		else if (a>=50 && a<70) {
			msg = "C등급 입니다.";
		}
		else {
			msg = "일반등급 입니다.";
		}
		
		System.out.println(msg);
		
		
		
		
	}

}
