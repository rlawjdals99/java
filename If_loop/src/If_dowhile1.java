
public class If_dowhile1 {

	public static void main(String[] args) {
	/* ���빮��. ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�. */
		int a = 1;
		int total;
		do {
			total = 6 * a;
			if (total > 35) {
	//		System.out.print(total + " ");
			}
			a++;
		} while (a <= 9);

	/* 14 ~ 27���� ���� �� ¦������ ��� ���Ͽ� ���� ������� ����Ͻÿ� 140 */   
	    
		int aa = 14;
		int total3 = 0;
		do {
			if (aa % 2 == 0) {
				total3 += aa;
			}
			aa++;
		} while (aa < 28);
		System.out.print(total3 + " ");
		
		
		
	
	
	}
}
