import java.util.ArrayList;
import java.util.Arrays;

public class Java_test7 {

	public static void main(String[] args) {
		/*[���빮�� 1]
���� ���� �迭�� �ֽ��ϴ�. �ش� �迭���� 
¦��, Ȧ�� ���� ���� �����ͼ� �迭�� ó�� �մϴ�.
��Ƽ�����带 �̿��Ͽ� ����մϴ�.

��� 
¦�� : [2,6,10,22,42,50]
Ȧ�� : [1,7,11,15,43,51]*/

		int a = 1;
		
		Thread mt = new multy();
		mt.start();
		
	}
}
class multy extends Thread{
	
	@Override
	public void run() {
		int array[] = {1,2,6,7,10,11,15,22,42,43,50,51};
		ArrayList ar = new ArrayList();
		ArrayList ar2 = new ArrayList();

		int ea= array.length;

		for(int i=0;i<ea;i++) {
			if (array[i] % 2 == 0) {
				ar.add(array[i]);
			}
			else {
				ar2.add(array[i]);
			}
		}
		System.out.println("¦�� : " + ar);
		System.out.println("Ȧ�� : " + ar2);
	
	}
}
