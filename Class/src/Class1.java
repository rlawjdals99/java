/*부모클래스 및 자식(내부)클래스 연동*/
public class Class1 {

	public static void main(String[] args) {

		parents p = new parents();
       p.p_box();
       
       parents.child pc = p.new child();
       pc.c_box();
		//부모class.자식class 이름생성 = 부모클래스명. new 자식클래스명 (인스턴스에 적용)
		
		
		
	}

}

class parents{   // 부모class
	String a = "홍길동";    // 부모 필드에 있는 전역변수(this)
	String b;
	class child{  // 자식class
		int a = 20;
		
		public void c_box() { //자식method
			double c = 10.5;
		    System.out.println(c);  // 자식메소드 전용 지역변수
		    System.out.println(this.a);  // 자식클래스 전용 전역변수
		    System.out.println(parents.this.a); // 부모클래스 전용 전역변수
		System.out.println(parents.this.b); // 부모클래스 전용 전역변수
		
		}
	}	
	public void p_box() { //부모 method
		String a = "이순신";   // p_box에 있는 지역변수 
        b=a;	    
//		System.out.println(a);
	}
	
	
	
	
	
}