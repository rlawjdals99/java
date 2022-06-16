
public class Class2 {

	public static void main(String[] args) {

    /* 응용문제. 더블 클래스를 이용하여 자식 클래스에 결과값을 출력하는 프로세서를 제작하시오.
       클래스는 2가지가 있습니다.
       부모 클래스 이름 : mother
       자식 클래스 이름 : child
       메인 클래스에서 mother 클래스로 값을 전달
       30, 50 숫자값을 적용합니다.
       child에서 부모 클래스에 있는 값을 받아
       두개의 숫자를 곱한 결과 값을 출력하시오  */
		
		mother mm = new mother();
		mm.mom(30,50);
		
	    mother.child son = mm.new child();	
	 	son.ch();
		
		
		
		
		
	}
}
class mother{
	int c,d;
	public void mom(int a, int b) {
      this.c = a;
      this.d = b;
	
	}
	
	
	class child{
		int aa = mother.this.c;
		int bb = mother.this.d;

		public void ch() {
			int e = this.aa * this.bb;
			
			System.out.println(e);
		}
		
		
	}
	
	
	
	
}




