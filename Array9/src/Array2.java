import java.util.Iterator;

public class Array2 {

	public static void main(String[] args) {
		
		// hong, kim, park, lee, jang, jung
		
		String a[] = {"hong", "kim", "park", "lee", "jang", "jung"};
				
	//	System.out.println(a[4]);
	//	int word = a[4].length();
	//	System.out.println(word);
		
		/* ���빮��. �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		   �ش� �迭�� �� ����� ���̵� 3�ܾ� �̻� ��½�Ű�ÿ�. */
        
		int member = a.length;    // ��ü ȸ������ �ľ��ϱ� ����
		int w =0;
 		int word;   // ������ �迭 �������� ���� ���� �ľ�.
		
		while(w<member) {   // ���ܾ� �̻��� �����͸� ���
			word = a[w].length();	// ���� �����ľ�
           		
			if (word >3) {  // ���ܾ� �̻��� �����͸� ���
		//		System.out.println(a[w]);			
				
			}
			
			w++;
		}
		
		/* ���빮��. �迭�����ʹ� ������ �����ϴ�.
		   15, 60, 11, 14, 27 = 127
		   ���� ������ ���� ��� ���ؼ� ���� ������� ����Ͻÿ�.   */
		   
		int d[] = {15, 60, 11, 14, 27};
		int t = d.length;
		int total = 0;
		int y =0 ;
		while(y<t) {
			total += d[y];
			y++;
		}
		System.out.println(total);

	}

}
