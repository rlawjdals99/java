import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {

        /* ���빮��. �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� ���� �˴ϴ�.
         * �� �� ���������� ���� 3�̸�(������) ���� Ȯ�� �Ͽ� �迭 �����͸� �簡�� �մϴ�.
         * ����� ���� ������ : "ȫ�浿", "�̼���", "������", "�������", "������", "������"
         * ���������� : 4, 3, 1, 1, 2, 2
           [������, �������, ������, ������]        */
		
	String member[] = {"ȫ�浿", "�̼���", "������", "�������", "������", "������"};
	int lv[] =  {4, 3, 1, 1, 2, 2};
	int a = lv.length;
	int g[] = new int[6];
	int b = 0;
	int ct = 0;
    String t[] = new String[6];
	 
    while(b < a) {
		
	if (lv[b] < 3) {
		t[b] = member[b];
		ct++;
	}
	
		b++;
	}
    System.out.print(Arrays.toString(t));	
//	 Arrays. toString : ����, ����, �Ҽ� [] ���� �迭 �������� ����ϴ� �Լ�
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
