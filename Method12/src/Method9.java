import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
       /* ���빮��. �����ڿ��� �޴��� Ȱ��ȭ�ϴ� ���μ��� �Դϴ�.
          �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸� �޴���,Ȱ��ȭ�ϴ� (Y, N)�� �����մϴ�.
          �ش� Ȱ��ȭ ���� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´� �޴�����
          1�� �迭�� �籸�� �� ���ο��� ��� �ǵ��� �մϴ�.
          ��� : [���Ϲ��], [����������], [���ڽ�], [�̺�Ʈ], [�߼�]  
          ��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.   */

    menus me = new menus();

       System.out.println(Arrays.toString(me.get()));
  


	}
}
class menus{
	private String mdata[][];
	private String rdata[];
	
	
	public menus() {
       String ms[][] = {
    		   {"���Ϲ��", "����������", "���κ���", "���ڽ�", "�̺�Ʈ", "����", "�߼�"},
    		   {"Y", "Y", "N", "Y", "Y", "N", "Y"}
                             }; 		
    		   this.mdata = ms;
	     fdfd();
	}
	
 public void fdfd() {
		
     int a = this.mdata[0].length;  // this�� ����? �� �� this�� ���� �ϳ�?
	 int b = 0;
	 int ct = 0;
	 String ww[] = new String[a]; 
		while(b<a) {
			
			if (this.mdata[1][b].equals("Y")) {
          ww[ct] = this.mdata[0][b];
			ct++;
			}
			b++;
		}
this.rdata = ww;		
	 
 }
public String[] get() {
	return this.rdata;
	
}
	
	
	
}