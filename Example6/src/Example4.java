
public class Example4 {

	public static void main(String[] args) {
		/* 응용문제4
		   다음 결과값에 맞춰서 코드가 출력 되도록 하시오.
		   해당 코드는 for문으로 작성합니다.
		   45 35 25 15 10      */

		int a;
		int b;
	
		for(a=9;a>0;a--) {
			b = 5 * a;
			if (a%2==1 ||a==2) {
	if (a != 1) {      //if(a%2==1 && a !=1 ||a==2)  //if(a==45||a==35||a==25||a==15||a==10)
					System.out.print(b+ " ");
				}
			}
			
		}
		
		
		
		
	}

}
