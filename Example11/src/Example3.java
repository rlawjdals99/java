import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {

		/* ���빮��3
		   �迭 +�⺻(Ŭ����)�޼ҵ� ����
		   product "����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"
		   moneys : 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900
		   ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.    75,600
		   ��, �� �� ����� �ٳ����� �����ϰ� �� �����ݾ��� ����Ͻÿ�. 
		 */
		
		String product[] = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
		int moneys[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };
		Example3 ex = new Example3();
		ex.name(product,moneys);
	}

	public void name(String pd[], int mn[]) {

		int a = pd.length;
		int b;
		int total = 0;
		for(b=0;b<a;b++) {
			if (!pd[b].equals("���") && !pd[b].equals("�ٳ���")) {
				total += mn[b];
			}
		}
		System.out.println(total);
	}
}