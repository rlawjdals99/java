package List1;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
        /* ���빮��
           �ѹ�������1 : 3, 6, 9, 12, 15
           �ѹ�������2 : 2, 4
           ��� : 3, 6, 9, 12, 15, 2, 4   */
        // Arrays.sort : �迭���� ���¿��� ����. ArrayList�� ����Ұ�
		Integer nb1[] = {3, 6, 9, 12, 15}; 
		Integer nb2[] = {2, 4}; 
		
		ArrayList<Integer> total1 = new ArrayList<>(Arrays.asList(nb1));
		ArrayList<Integer> total2 = new ArrayList<>(Arrays.asList(nb2));
		int a;
		int ea = total2.size();
        for(a=0;a<ea;a++) {
          total1.add(total2.get(a));
        
        }
        System.out.println(total1);
        Collections.sort(total1);   // ArrayList, LinkdeList, sort �������� ����		
		System.out.println(total1);
		
		
		
		
		
		
	}
}
