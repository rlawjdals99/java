import java.util.Arrays;

// �迭 �ű� �������� ��Ȯ�ϰ� �����Ͽ� �űԹ迭�� �����ϱ� 
public class oop2 {

	public static void main(String[] args) {

		array1 ar = new array1();

	}

}

class array1 {
	private int ar1[];

	public array1() {
		this.ar1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int ea = this.ar1.length;
		System.out.println(Arrays.toString(ar1));
		// 5�̻� �迭���� ��������
		int w = 0;
		String newdata = "";
		while (w < ea) {
			if (this.ar1[w] >= 5) {
//				System.out.println(this.ar1[w]);
				newdata += this.ar1[w] + ",";
           // �ش� ���ǿ� �´� ���� ���ڿ��� ��ȯ�Ͽ� ����
			}
			w++;
		}
		
		
		String ar2[] = newdata.split(",");
	    // �ش� ����� ���ڿ��� split���� �����Ͽ� �迭�� �ӽ���ȯ(split�� ���� ���ڴ� �Ұ����մϴ�.)
		int ar2_ea = ar2.length;
		int oridata[] = new int[ar2_ea];
		// ���ڿ� ������ŭ �迭 ������ ���� �߰��ϰ� �˴ϴ�.
		int ww = 0;

        while(ww<ar2_ea) {
        	oridata[ww] = Integer.parseInt(ar2[ww]);
        	// ���ڸ� ���ڷ� ��ȯ�Ͽ� �ű� �迭 �������� ���� �����մϴ�.
        	ww++;
        }
        System.out.println(Arrays.toString(oridata));
	}

}