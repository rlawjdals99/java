import java.util.Iterator;
import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		/* ���빮��6
		   2�� �迭�̸�, 2���迭 �����ʹ� ������ �����ϴ�.
		   user_list : "ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"
		   user_point : "3000", "1000", "25000", "19800", "5750", "3630", "0"
		   
		   ���α׷� ���۰� ���ÿ� "����Ʈ�� �˻��� ������ �Է��ϼ���."
		   �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ 
		   �Ű������� �̿��Ͽ� ���� �� �ش� ������� ����Ͻø� �˴ϴ�.   */
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���.");
		  String scq = sc.next();
		  user_lp.name(scq);
		  sc.close();		
		
		
		
		
		
		
	}

}

class user_lp{
	
	public static void name(String scaw) {
	String userlp[][] = {
			{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
			{"3000", "1000", "25000", "19800", "5750", "3630", "0"}
	};
	
	int c = userlp.length;
	int b = userlp[0].length;
	/*int a;
	for(a=0;a<c;a++) {
		int w;
		for(w=0;w<b;w++) {
			if (userlp[a][w].equals(scaw)) {
				System.out.println(userlp[1][w]);
			}
		}
	
	}*/
	int w = 0;
	while(w<b) {
		if (scaw.equals(userlp[0][w])) {
			System.out.println(userlp[0][w]+"���� ����Ʈ�� " + userlp[1][w]+ " �Դϴ�.");
		}
	w++;
	}
	
	
	}
}