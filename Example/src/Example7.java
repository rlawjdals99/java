import java.util.Arrays;
import java.util.Iterator;

public class Example7 {

	public static void main(String[] args) {

		/* ���빮��7
	       ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���
	       [data]
	       {"ȫ�浿", "�հ�"}
	       {"�̼���", "�հ�"}
	       {"������", "���հ�"}
	       {"������", "�հ�"}
	       {"������", "���հ�"}
	       {"�庸��", "���հ�"}
	       	
	       	  ������ �迭 �����̸� �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
	       	  ��, �迭���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
	       	  
	       	  ��� : ȫ�浿, �̼���, ������    */
		
		hi ex = new hi();
		ex.name();
	}
}
class hi{
	
	public void name() {
		
		String user[][] = {
				   {"ȫ�浿", "�հ�"},
			       {"�̼���", "�հ�"},
			       {"������", "���հ�"},
			       {"������", "�հ�"},
			       {"������", "���հ�"},
			       {"�庸��", "���հ�"}
                      		};
		int user1 = user.length;
		int user2 = user[0].length;
		int a;
		for(a=0;a<user1;a++) {
		int b;
			for(b=0;b<user2;b++) {
				if (user[a][b].equals("�հ�")) {
					
					System.out.println(user[a][0]);
				}
			}
		}
		
		
		
		
		
	}
	
	
}
