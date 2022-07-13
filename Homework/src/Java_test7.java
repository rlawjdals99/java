import java.util.ArrayList;
import java.util.Arrays;

public class Java_test7 {

	public static void main(String[] args) {
		/*[응용문제 1]
다음 숫자 배열이 있습니다. 해당 배열값을 
짝수, 홀수 각각 값을 가져와서 배열로 처리 합니다.
멀티쓰레드를 이용하여 출력합니다.

결과 
짝수 : [2,6,10,22,42,50]
홀수 : [1,7,11,15,43,51]*/

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
		System.out.println("짝수 : " + ar);
		System.out.println("홀수 : " + ar2);
	
	}
}
