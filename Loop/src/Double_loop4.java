import java.util.Iterator;

public class Double_loop4 {

	public static void main(String[] args) {


		/* ���빮��. ���չݺ��� for, do~while		 */
		
		int f;
		for(f=2;f<4;f++) {
			int w = 1;
			
			do {
				
		//		System.out.println(f + "*" + w + "="+(f*w));
				
				w++;
			} while (w<10);
		}
		
		
		/* ���빮��. ������ 7~9�ܱ���. 
		   ��, �� ������ �������� 5������ �������� �մϴ�. 
		   7*1=7 ~ 7*5=35, 8*1=8...9*5=45  do~while ~ while		 */

		
		int a = 7;
		do {
						
			int aa = 1;
			while(aa<6) {
		//		System.out.println(a + "*" + aa + "=" + (a*aa));
				
				aa++;
			}			
			
			a++;
		} while (a<10);
		
		
		/* ���빮��. ���� ������� Ȯ���Ͽ� �ڵ带 �ۼ��մϴ�.
		   ��, for ~ while������ ����.
		   1*1=1
		   2*2=4
		   3*3=9
		   4*4=16
		   5*5=25
		   6*6=36
		   7*7=49
		   8*8=64
		   9*9=81		   */
		
		int r;
		int total = 1;
		for(r=1;r<10;r++) {
			
			int t = r;
			
			while(t<=r) {
				total = r*t;
				System.out.println(r + "*" + t + "=" + total);
				
				t++;
			}
		}

		/* ���빮��(������). ���� �ش� �����ó�� ����� �ǵ��� ����ݺ����� �̿��Ͻÿ�.
		   while ~ do~while
		   1+1=2
		   2+1=3
		   2+2=4
		   3+1=4
		   3+2=5
		   3+3=6
		   4+1=5
		   4+2=6
		   4+3=7
		   4+4=8		  */
		
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
