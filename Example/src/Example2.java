import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {

		/* ���빮��2
           �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 product : ����, ����, ���, ��, ����, Ű��, �ٳ���, ���� ��
		 ����, ��, Ű���� ���� �Ͽ����ϴ�.
		 �ش� ��ǰ ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ�� �ϸ� 
		 �ݺ����� Free �Դϴ�. ��� : [����, ���, ����, �ٳ���, ����]   */
		
		
		String ft[] = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
		
		Example2 ex = new Example2();
		ex.name(ft);
	}

	public void name(String ftr[]) {
	
	int e = ftr.length;
	int w = 0;
	int no = 5;
	int idx = 0;
	String newft[] = new String[no]; 
	
	do {
		if (!ftr[w].equals("����") && !ftr[w].equals("��") && !ftr[w].equals("Ű��")) {
             newft[idx] = ftr[w];
             idx++;
		}
		w++;
	} while (w<e);
		
	System.out.println(Arrays.toString(newft));
		
		
	
		
		
		
	
	}
}
