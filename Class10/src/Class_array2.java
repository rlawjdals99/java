import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 10���� ���ڸ� �ϳ� �����ϼ���.");
		int no = sc.nextInt();
		
		
		
//    meomrys m = new memorys();
    memorys m = null;
	m = new memorys();
	m.ms(no);
	m = null;   // �ش� �ν��Ͻ��� ���
	
	m = new memorys();
	m.rd();
	
	}

}

class memorys{
	public void ms(int user) {
       // Math.random() �����޼ҵ� ���� : �⺻�� �ڷ��� double �Դϴ�.
       // random => �����ڵ�, �����ڵ�, ��÷, �귿�� ���
		
		double a = Math.random();    // 0.0 ~ 1.0
		int b = (int) (Math.random()*9)+1;  // *10(0 ~ 9), *10+1(1 ~ 10)     double -> int ����
	 System.out.println(b); 
		if (user == b) {
			System.out.println("��÷");
		}
		 else {
			System.out.println("���� ��ȸ��..");
		}
		
		System.out.println(b);
	}
	
	public void rd() {   // random util ����
		Random r = new Random();     // random ��ü ���� �� �ν��Ͻ� ����
		int w = 0;
		while(w<=5) {
			System.out.println(r.nextInt(45)+1); // 0 ~ 9����. r.nextint�� ���
			w++;
		}
	r = null;
	}
	
}