
public class For1 {

	public static void main(String[] args) {
		// 반복문 : 데이터를 일괄적으로 입력, 출력을 할 수 있도록 하는 문법.
        // 반복문은 String 안씀.
		int z = 1;
		
       /* z++; : +1 증가 : 출력 후 +1증가 
		  z--; : -1 감소 
		  ++z; : +1 증가 : +1증가 후 출력 
		  --z; : -1 감소                 */
		
	/*	System.out.println(z);
		z++;
		++z;  */   

		for (int a = 0; a < 10; a++) {   // for(초기값;범위값;증가 or 감소)
		//	System.out.println(a);
		} 
		
		int b;
		for(b=5;b<=10;b++) {
		//  System.out.println(b);
				}
		int c;
		for(c=10;c>3;c--) {   //주의사항 c<3일시 0~음수까지 전부 찍혀버리는 상황이 발생
		// System.out.println(c);
		}
		/* 응용문제
		 20~27까지 출력하시오 */
		int d;
		for(d=20;d<=27;d++) {
		//   System.out.print(d);
		}
		/* 응용문제 39 ~ 21까지 출력 */
		int e;
		for(e=39;e>20;e--) {
		//  System.out.print(e+" ");
		}
		/* 1~10까지 숫자 출력 */
		int aa;
		int bb=10;
		for(aa=1;aa<=bb;aa++) {
		// System.out.print(aa+",");
		}
		
		/* 응용문제 변수 2개를 이용하여 다음 데이터를 출력하시오		 
		   55 ~ 4까지 출력 */
		byte f;
		byte g=4;
		for(f=55;f>=g;f--) {
		System.out.print(f+" ");
		}
		}
		}
		
	

