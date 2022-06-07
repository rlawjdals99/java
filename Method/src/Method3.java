
public class Method3 {

	public static void main(String[] args) {
    /* 응용문제. 인수값 2개의 숫자를 적용하여 계산되도록 합니다.
       최종 계산을 받아서 결과를 출력하시오.
       157, 45
       157 * 45
       최종 결과값 출력 : 7065
     */
		
		
		math one = new math();
		int result = one.data1(157,45);
		System.out.println(result);
	
		one.m2();

		/* 응용문제. 다음 숫자 하나를 해당 매소드로 전달하게 됩니다. 
		   해당 매소드에서는 다음과 같이 처리합니다.
		   숫자 3을 전달하면 3*1 ~ 3*9까지의 모든 결과값을 더하여 
		   sysout으로 출력 되도록 하십시오. */
	       
		one.data2(4);	   
		int result2 = one.data2(4);
		System.out.println(result2);
				
//	       String ck = one.mb();
//	System.out.println(ck);       
	       
	}
}
class math{
	
	public int data1(int a, int b) {
		int c = a * b;
		return c;
	}
		
	
public void m2() {
	int z = data1(100,200);
    System.out.println(z);
}

public int data2(int d) {
	int a = 1;
    int total = 0;
	while(a<=9) {
		total += d * a;
		a++;
	}
	return total;   
	// return 사용시 절대 반복문 안에 적용하면 안됩니다. 또한 조건문이라도 더블로 return 사용 안됩니다.
}

public String mb(String mid) {
	String msg="";
	if (mid.equals("hong")) {
		msg = "ok";
	}
	else {
		msg = "cancel";
	}
	return msg;  /* 해당 매소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return 시킴 */
	
}





}