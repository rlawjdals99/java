import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 색상을 입력해 주세요.");		
		String a = sc.next();
		
		String msg;

		if (a.equals("빨강")) {
          msg = "red";
		}
		
		else if (a.equals("주황")) {
			msg = "orange";
		}
		
		else if (a.equals("노랑")) {
			msg = "yellow";
		}
		else if (a.equals("초록")) {
			msg = "green";
		}
		else {
			msg = "해당 단어는 번역이 되지 않습니다.";
		}
		
		System.out.println(msg);
		
		sc.close();
		
		
		
	}

}
