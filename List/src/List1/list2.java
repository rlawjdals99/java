package List1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
/* ���빮��. �ش� ������ �� �� �޸�� �����ʹ� ��� �����˴ϴ�. 	
    �� ������
    �����, ������, ��â��, �ڵ���, �̰���, �����, ������
    
    ���
    �����, ������   */
	
/*	String data[] = {"�����", "������", "��â��", "�ڵ���", "�̰���", "�����", "������"};
	
	ArrayList<String> dt = new ArrayList<>(Arrays.asList(data));

//	int a;
//	for(a=0;a<5;a++) {
//		dt.remove(0);
//	}
//	System.out.println(dt);
	
int ea = dt.size();
int w = 0;
while(w<ea) {
	int ea2 = dt.size();
	int ww = 0;
	while(ww<ea2) {
		if (!dt.get(ww).equals("�����") && !dt.get(ww).equals("������")) {
			dt.remove(0);
//			System.out.println(dt);
		}
	}
	w++;
}*/
	/* ���빮��. ¦���� ���ڸ� ��� ���� �մϴ�.
	   10, 7, 6, 1, 11, 37, 41, 22
	   ��� : 7, 1, 11, 37, 41    */
      
       Integer number[] = {10, 7, 6, 1, 11, 37, 41, 22};
       ArrayList<Integer> nb = new ArrayList<>(Arrays.asList(number));
       
       int aa = nb.size();
       int bb = 0;
       while(bb<aa) {
    	   int p = nb.size();
    	  int c = 0;
    	  while(c<p) {
    		  if (nb.get(c) % 2 == 0) {
    	   nb.remove(c);
    	   break;
			}
    		  c++;
    	  }
    	   bb++;
		}
       System.out.println(nb);
    		  
    		  
    	   
    	   
       }
	}
