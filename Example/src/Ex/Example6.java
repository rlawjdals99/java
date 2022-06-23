package Ex;

public class Example6 {

	public static void main(String[] args) {
		int data[] = {10, 20, 30, 40, 50};
		
		order or = new order();
		or.order_check(data);	//setter�� ���� ����
        int result = or.order_recall();	 //getter�� ���� ������
		System.out.println(result);  // ���� ����� ����
	}
}
abstract class abstr{
	//�ʵ� �ڷ��� ���� ����
	abstract public void order_check(int[] adata);  //setter
	abstract public int order_recall();  //getter
}

class order extends abstr{  //�߻�Ŭ����
	//�ڡ� �ʵ弱�� �ؾ��� �� : 1�� �̻��� �޼ҵ忡 ���� ����ؾ� �� ��츸 �ʵ忡 ���� �ڡ�
	private int total = 0;

	@Override
	public void order_check(int[] adata) {  //�迭�� �ݺ� + ¦������ ��� ������
	int ea = adata.length;
	for(int i=0;i<ea;i++) {
		if (adata[i] % 2 == 0) {
			this.total += adata[i];
		}
	}
	}
	
	@Override
	public int order_recall() {	// �������� ����
		return this.total;
	}
}