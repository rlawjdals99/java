package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
         //���ڿ� ���� �迭���
		Scanner sc = new Scanner(System.in);

        ArrayList list = new ArrayList();  // �ڷ����� ���� ����
		
		int w = 0;
		while(w<5) {
			System.out.println("�����͸� �Է��� �ֽñ� �ٶ��ϴ�.");
			String user = sc.next();
			list.add(user);
			w++;
		}
		System.out.println(list);
// ���� �Է»��׸� ��� ����		
		
		int ww = 0;
		int total = 0;
		do {
		try {
			Object k = list.get(ww);  // �迭�ڷᰡ ����+���� ���·� ������ �Ǿ����� ��� Object �Ű�Ÿ������ ����
       int number = Integer.parseInt(k.toString()) ;  //�ش� ��ĳŸ���� ����ȭ�Ͽ� parseInt�� �ٽ� ����� ��
			total += number;   // 
			
		} catch (Exception e) {  //�迭�� �Ű�Ÿ���� ���ڰ� �ƴ� ��� ���ܻ�Ȳ �߻�
		}
			
			
			ww++;
		} while (ww<list.size());

		System.out.println("�Է��� �迭�� ���� ����" + total);
		
		
		
	}

}
