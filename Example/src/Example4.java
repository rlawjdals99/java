
public class Example4 {

	public static void main(String[] args) {
		/* ���빮��4
		   ���� ������� ���缭 �ڵ尡 ��� �ǵ��� �Ͻÿ�.
		   �ش� �ڵ�� for������ �ۼ��մϴ�.
		   45 35 25 15 10      */

		int a;
		int b;
	
		for(a=9;a>0;a--) {
			b = 5 * a;
			if (a%2==1 ||a==2) {
	if (a != 1) {      //if(a%2==1 && a !=1 ||a==2)  //if(a==45||a==35||a==25||a==15||a==10)
					System.out.print(b+ " ");
				}
			}
			
		}
		
		
		
		
	}

}
