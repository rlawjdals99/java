
public class Do1 {

	public static void main(String[] args) {
      int a = 1;    //표기값
      do {
    //	  System.out.print(a+" ");
		a++;    //증가 or 감소
	} while (a < 11);   //범위값, 종료값

      
      /* 응용문제 5~0까지 출력되는 do~while문 작성. */
      
  int b = 5;
  do {
	//  System.out.print(b+" ");
	b--;
} while (b >= 0);
      
  
  int c = 50;   //기초값
  int d = 60;   //범위값
  do {
	  System.out.print(c+" ");
	c++;
} while (c <= d);
  
  
	}

}
