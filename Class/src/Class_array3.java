import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		
		/* ���빮��. ���� ���� �迭 ������ ���� �ֽ��ϴ�.
	       a1 : ȫ�浿, �̼���, ������, ������, ������
	       a2 : 100, 80, 39, 60, 55
		   
		   "�˻��ϰ��� �ϴ� �̸��� �����ּ���." ����ϰ� �˴ϴ�.
		   �˻�� �̼����̶�� �˻��� �ϰ� �Ǹ�
		   "�̼��Ŵ��� 80�� �Դϴ�." ��� ����� �Ǿ�� �մϴ�.	 */
		   
		String member[][] = { 
				{"ȫ�浿", "�̼���", "������", "������", "������"},
				{"100", "80", "39", "60", "55"}  
		};

		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
		String sc2 = sc.next();  // ����ڰ� �Է��� ������ sc2
		
	
	user a = new user();
	a.score(member,sc2);
		
	}
}
class user{	
	public void score(String t[][],String sc2) {
		
		int ee = t[0].length;
		
		int c,d;
		for(c=0;c<ee;c++) {
		
				if (sc2.equals(t[0][c])) {		
					System.out.println(t[0][c] + "���� ������ : "+t[1][c]);						
				}		
		}		
	}
}