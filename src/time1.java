
public class time1 {

	public static void main(String[] args) {
		// try - catch�� : ����ó����� ����
		
		int a;
		
		for (a = 1; a < 11; a++) { // ���� �߻� �� �ڵ带 ����
			try {
				Thread.sleep(1000); // 1000 = 1��
			      // Thread.sleep(0); : �Ͻ����� ���¸� ���մϴ�.
			} 
			catch (InterruptedException e) {
		          // InterruptedException : �ش� ���ܹ߻��� �Ǿ��� ��� ó���ϱ� ���� ����
			}
			System.out.println(a);
		}

	}
}
