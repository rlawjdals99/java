
public class Do2 {

	public static void main(String[] args) {
		int a = 1; // �ݺ��� ���ʰ�
		int b = 9; // ��� ������
		int c;

		do {
			c = a * b;
			// System.out.print(c+" ");
			a++;
		} while (a < 10);

		/*
		 * ���빮�� ���� ������� ���� do~while������ �ڵ带 �ۼ��Ͻÿ�. 
		   35, 45, 55, 65, 75
		 */

		int d = 3;
		int e;
		
		do {
			e = d * 10 +5;
			System.out.print(e + " ");
			d++;
		} while (d <= 7);

	}

}
