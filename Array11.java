import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {

		/* ���빮��.
		   ���� �迭���� �ֽ��ϴ�. �ش� �迭���� ���Ͽ� ����� ������ ����Ͻÿ�.
		   
		   Adata = hong, kim park jang lee soun
		   Bdata = 80, 100, 46, 38, 65, 88
		   
		   ����迭�� ���� ����(if)�� 60�� �̻�(����) �� �հ��ڸ� ����մϴ�.
		   [hong,kim,lee,soun]	 */
		String data[][] = {
				{"hong", "kim", "park", "jang", "lee", "soun"},
				{"80", "100", "46", "38", "65", "88"}
								};
		int ea = data[0].length;
		String d[] = new String[ea];
		int i;
		for(i=0;i<ea;i++) {
			int score = Integer.parseInt(data[1][i]);
			if (score > 60) {
				d[i] = data[0][i];
			}
		}
		System.out.println(Arrays.toString(d));






	}

}