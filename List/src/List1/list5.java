package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {

		/* ���빮��. ����ڰ� ���ڱݾ��� �Է��մϴ�.
		   �ش� ���� �ݾ� Ƚ���� �� 8���Դϴ�.
		   0~n ���� �Է� �����ϸ�
		   �ش� �Է��� ��� ������ ���� �հ� �ݾ��� ��� ��Ű�ÿ�.
		   ����) 
		   �Ա��� �ݾ��� ��������.
		   500 600 500 400 200 100 50 50
		   
		   ���)
		   �� �Ա� �ݾ��� : 2400�� �Դϴ�.
		 */

		LinkedList<Integer> list = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);

		int w = 0;
		int total = 0;
		while(w<8) {
			
			System.out.println("�Ա��� �ݾ��� ��������.");
			String a = sc.next();
			try {
				int pp = Integer.parseInt(a);
				int ea = list.size();
			list.add(pp);
			total += pp;
			}
			catch (Exception e) {
        System.out.println("�׸�");
			}
		w++;
		}
		System.out.println("�� �ݾ��� : " + total);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
