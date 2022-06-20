package Ex;

public class Example5 {

	public static void main(String[] args) {
 
        /* 특강문제 (숙제)
           abstract을 이용하여 구구단 8단 결과를 모두 더한 결과값을
           return 받아 메인에서 출력 되도록 합니다. */		
		
		gugu g = new gugu();
		g.setter(8);
		int total = g.getter();
		System.out.println(total);
		
	}
}
abstract class gugudan{
  int aa;
  int i = 0;
	public abstract void setter(int a);
	public abstract int getter();
}

class gugu extends gugudan{
	@Override
	public void setter(int a) {
		this.aa = a;
	int b;
		for(b=0;b<10;b++) {
			this.i += this.aa*b;
		}
	
	
	}
	
	
	
	@Override
	public int getter() {
		
		return this.i;
	}
}
