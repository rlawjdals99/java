
public class For2 {

	public static void main(String[] args) {
		int a;   // for�� �ʱⰪ
		int b=2; // ���꿡 ����� ����
        int c;   // ������ �����
        for(a=1;a<10;a++) {
        c = b * a;   // ������� �۾�
     // System.out.print(c+" ");    // ����� ������� ���
		}
        
        /* ���빮�� ���� ������� ���� �ڵ带 �ۼ� �Ͻÿ�.
           45, 40, 35, 30, 25, 20  */
        
        int d;
        int e=5;
        int f;        
        for(d=9;d>=4;d--) {   //���������� �� --, ���������� �� ++
        	f = e * d;
        //	System.out.print(f+" ");
        }
        
        
        
	/* ���빮�� ���� ������� ���� �ڵ带 �ۼ� �Ͻÿ�. 
	   11, 22, 33, 44, 55, 66, 77, 88, 99   */	
        
        // ����1
        int aa;
        int bb = 11;
        int cc;
        for(aa=1;aa<10;aa++) {
        cc = bb * aa;
       // System.out.print(cc+" ");
        }
      
        // ����2
        int z;
        int x;
        for(z=1;z<10;z++) {
        x = (10*z)+z;
        System.out.print(x+",");
        }
	}
	}
	


