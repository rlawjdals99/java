import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

	
	int a[] = {5, 10, 15, 20, 25, 30, 35};
    /* for each���� ����� ���� �ε��� ��ȣ�� �ʿ���� ����� ���
       for~do~while�� ����� ���� �ε��� ��ȣ�� �ʿ��� �� ���
       �ε��� ��ȣ : [0], [1], [2]
       */
	
	for(int f : a) {  // int f�� ���������� data�迭���� �޾Ƽ� ���� ��ŵ�ϴ�.
		
		if (f%2==0) {
			
	//		System.out.println(f);
		}
	}
		
  /*  	String pay[] = {"�������Ա�", "�ſ�ī��", "�޴���", "��ǰ��", "����"};
    	Scanner sc = new Scanner(System.in);
    //	System.out.println("���������� ������ �ּ���.");
		String pm = sc.next();
		
		for(String z : pay) {  
	   // �迭 �����Ͱ� ���� �̹Ƿ� �޴� �������� ���� ������ �̿��� ��
		
			if (pm.equals(z)) {
               if (z.equals("�޴���")) {
		//		System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
			}
               else {
		//		System.out.println(pm+"�� ���� ���� �˴ϴ�.");
			}
				
				
               
               //	System.out.println(pm+"�� ���� ���� �˴ϴ�.");
			}
			
			
			sc.close(); 
		}
		*/
		
	
	/* ���빮��. {�ܹ���, ����, ġŲ, Ŀ��}
	   "�ֹ��ϰ��� �ϴ� ������ ������ �ּ���." 
	    �ش� ������ �� 4���� ����� �˴ϴ�.
	    ��, "�ֹ�����" ��� ����ڰ� �Է½� �� ��� �ֹ��� ���� �ǹ�,
	    �ֹ� ������ ����Ͻø� �˴ϴ�.*/
	
	
		String k[] = {"�ܹ���","����","ġŲ","Ŀ��"};
	Scanner t = new Scanner(System.in);
//	System.out.println("�ֹ��ϰ��� �ϴ� ������ ������ �ּ���.");
	String total[] = new String [4];
int ct = 0;
	for(String h : k) {	
	
		/* Scanner�� �ݺ��� �ȿ� ����� loop�� ������ �ݺ������� ����
		 * ����ڰ� �Է��� ������ �ݺ��� ������ŭ ����ϴ� ����
		 */
		
		System.out.println("�ֹ��ϰ��� �ϴ� ������ ������ �ּ���.");
		String i= t.next();
		if (i.equals("�ֹ�����")) {
			break;
	}
		else {
             for(String ff : k) {
            	 if (i.equals(ff)) {
					total[ct] = ff ;
				ct++;
            	 }
             }
		}
		
	}
	t.close();
	System.out.println("�ֹ��Ͻ� �޴��� : " + Arrays.toString(total) );
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
