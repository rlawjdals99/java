import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
         System.out.println("on & off 중 하나를 입력해 주세요.");		
		String a = sc.next();
		boolean  b = false;
		
		if (a.equals("on")) {
			b = true;
			System.out.println(b);
		}
		else {
			
			System.out.println(b);
		}
		
		
		sc.close();
		
		
		
	}

}
