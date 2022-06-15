
public class Test4 {

	public static void main(String[] args) {

//	loadbox lb = new loadbox();	
//	lb.name();
//	lb.name2();

	/* 응용문제. 외부 class를 이용하여 해당 메소드 값을 출력합니다.
	   외부 class 이름은 books 이며, 안에 메소드는 총 3개의 메소드가 존재 합니다.
	   메소드 이름은 각각 book1, book2, book3으로 이루어져 있습니다.
	   book1을 호출시 "book1메소드" 라고 출력
	   book2을 호출시 "book2메소드" 라고 출력
	   book3을 호출시 "book3메소드" 라고 출력
	   */
		books bk = new books();
		bk.book1(35);
		bk.book2("바둑이");
		bk.book3("홍길동",40);
//        int pp = bk.book4();
//        System.out.println(pp);
	
		/* return메소드에 숫자 9와 20을 인수값으로 전달합니다.
		   해당 두개의 값을 곱하여 결과값을 출력하시오. */
	
        int q = bk.book4(9,20);	
	System.out.println(q);
	
	/* book5를 만들어 숫자를 하나를 인수값으로 전달합니다.
	   인수값을 받은 book5에서는 100, 200을 더한 값과 
	   인수값을 곱하여 결과값을 출력하시오.
	   
	   인수값 : 4
	   (100+200)*4 
	   결과 : 1200
	    */
	
	
	
	
	}
}
class books{
    String zz = "정답";
	public void book1(int a) {
//		System.out.println(a+this.zz);
	}
	
    public void book2(String b) {
//	System.out.println(b+this.zz);
	}

    public void book3(String c, int d) {
//	System.out.println(c+","+d+this.zz);
    }

    
    public int book4(int o, int r){
    	int e = o*r;
    	return e;
    }
    
}

//class loadbox{  //class는 무조건 method가 있어야 합니다.
//	int a = 123;
//	public void name() {
//		System.out.println(a);
//	}
//	public void name2() {
//		System.out.println(a);
//	}
//}