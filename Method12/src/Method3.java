
public class Method3 {

	public static void main(String[] args) {
    /* ���빮��. �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
       ���� ����� �޾Ƽ� ����� ����Ͻÿ�.
       157, 45
       157 * 45
       ���� ����� ��� : 7065
     */
		
		
		math one = new math();
		int result = one.data1(157,45);
		System.out.println(result);
	
		one.m2();

		/* ���빮��. ���� ���� �ϳ��� �ش� �żҵ�� �����ϰ� �˴ϴ�. 
		   �ش� �żҵ忡���� ������ ���� ó���մϴ�.
		   ���� 3�� �����ϸ� 3*1 ~ 3*9������ ��� ������� ���Ͽ� 
		   sysout���� ��� �ǵ��� �Ͻʽÿ�. */
	       
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
	// return ���� ���� �ݺ��� �ȿ� �����ϸ� �ȵ˴ϴ�. ���� ���ǹ��̶� ����� return ��� �ȵ˴ϴ�.
}

public String mb(String mid) {
	String msg="";
	if (mid.equals("hong")) {
		msg = "ok";
	}
	else {
		msg = "cancel";
	}
	return msg;  /* �ش� �żҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return ��Ŵ */
	
}





}