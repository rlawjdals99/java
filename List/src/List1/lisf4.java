package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class lisf4 {
	
	public static void main(String[] args) {
		Integer a[] = {3, 6, 9, 12, 15}; 
	    LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));  //��迭 ����

	    System.out.println(ln);
Scanner sc = new Scanner(System.in);	    
String user;
LinkedList<Integer> list = new LinkedList<>();

for(;;) //���ѷ���
while (true) {  //���ѷ���
	System.out.println("���ڸ� �Է��ϼ���.");
       user = sc.next();
	try {  //����ڰ� �Է��� ���� �ִ��� Ȯ���ϴ� ��Ʈ
int number = Integer.parseInt(user);
	list.add(number);	
int ea = list.size();
if (ea >=5) {break;}
	
}
	 catch (Exception e) {  // ������ �߻��Ͽ��� ��� �۵��Ǵ� ��Ʈ
 System.out.println("�ش� �Է»����� �����Դϴ�. ���ڸ� �Է��ϼ���.");
}

	System.out.println(list);
}
	
	
	
	
	}
}
