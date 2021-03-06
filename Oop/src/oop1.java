import java.util.Scanner;

public class oop1 {

	public static void main(String[] args) {
		// 재귀메소드 사용법
		op_method om = new op_method();

	}

}

// 재귀메소드 : 메소드를 직접 또는 간접으로 호출 하는 프로세서를 말합니다.
/* 반복문, 외부 class를 재실행 등 복잡한 문제를 쉽게 해결 하기 위해서
   구현하는 메소드 형태를 말합니다.  */
class op_method {
	Scanner sc = new Scanner(System.in);
	private String nm;
    public op_method() {  //최초 실행 메소드 (1)
    	
    	this.m1();
    }
	public void m1() {            //메소드 m1 작동 (2)
		System.out.println("찾을 이름을 입력하세요.");
		this.nm = sc.next();
		this.m2();
	}

	public void m2() {   //m1에 대한 결과값을 m2가 확인 (3)
		if (this.nm.equals("홍길동")) {
			System.exit(0);
		} else {
		System.out.println("해당되는 이름은 없습니다.");
			this.m1();    //m1을 다시 재호출(재귀메소드) (4)
		}

	}

}