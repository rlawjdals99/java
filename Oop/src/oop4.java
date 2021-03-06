
public class oop4 {
	// 추상 클래스 및 메소드 abstract
	public static void main(String[] args) {
		ab_2 ab = new ab_2();
        ab.b();
        System.out.println(ab.c());
        
        
	}
}

abstract class ab_1 { // 추상 클래스(외부에서 로드가 절대안됨) - 자체 실행 (X)

	public void ab_a() {  // free(인수값 없는 추상 메소드) - 사용해도 되고 안해도 됨 
	}

	public void ab_a(int a) { // free (인수값 받는 추방 메소드)  
	}

	public abstract int b(); // 추상 메소드 - 자체 실행 (X)

}

class ab_2 extends ab_1 {
	
	@Override
	public void ab_a(int a) {
		
	}
	
	@Override
    public void ab_a() {
		
		System.out.println(this.c());
	}
	
	public int b() { // 실제 메소드 + 추상 메소드
		return 55;
	}
	public int c() {
		return 99;
	}
}