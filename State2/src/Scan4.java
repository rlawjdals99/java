import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
	  Scanner a = new Scanner(System.in);
	System.out.println("�Է��� ������ �����ּ���.");
	  // String memo = a.next(); // �����̽��� �Է±����� ����
	  
	  String memo = a.nextLine();
	  System.out.println(memo);
	  
	  a.close();
	  
	  String mid = "park";    
	  int age = 25;           
	 /*
	  * �߿���� 
	  String = %s
	  ���ڴ� %d
	  %f : float, double
	  %t : date, time, �ð�, ��¥
	  %b : boolean (true, flase)
	  */ 
	  
	  //System.out.println(mid + "���� ���̴�" + age + "�Դϴ�.");
	  //printf : f��� ���� format�� ����.
	  System.out.printf("%s���� ���̴� %d �Դϴ�.", mid, age);
		
		
		
	}

}
