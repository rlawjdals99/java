import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		/* ���빮��.
		 * �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. �� �迭���� �ε����� ������ ��ȣ�� ���ؼ� 
		   ¦������ Ȧ�������� �迭 ��� �����ͷ� �缳�� �Ͻʽÿ� 
		   A data = 5, 17, 19, 22, 33
		   B data = 1, 2, 3, 4, 5
		   Result = ["¦��", "Ȧ��", "¦��", "¦��", "¦��"]  */
		// Double loop
		
		
		int aa[][] = {
				
				{5, 17, 19, 22, 33},
				{1, 2, 3, 4, 5}
		};
        // aa[0][0] + aa[1][0]
		// aa[0][1] + aa[1][1]
		int cc = aa[0].length;  //�迭�� �ִ� ������ ��ü ��
		int bb = aa.length;  // �迭�׷� ��
		int w=0;  // ū �ݺ��� �ε���
        int newdata[] = new int[cc]; // ���ο� �迭 ��ü����		
		
	    while(w<cc) {  // ū �ݺ��� 7����
	int ww=0;
	int total1 = 0; //������ ���� �̰� �޴� ����
	int total2 = 0; //������ ���� �̰� �޴� ����
	while(ww<bb) { // �����ݺ��� 2����(�迭�׷�)
		if (ww==0) {
			total1 = aa[ww][w];
		}
		else {
			total2 = aa[ww][w];
		}
		ww++;
	}
	// �����ݺ��� ������ ���ͼ� ù��° �迭�� + �ι��� �迭��
	newdata[w] = total1 + total2; // ���ο� �迭 ��ü�� ���
	w++;
	    }
	    
	    System.out.println(Arrays.toString(newdata));
			
	
	

	    
	    
	    
	    
	    
	    
	    

	
	
	
	}
}
