import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
    /* ���빮��. ���� ���α׷��Ӱ� �ش� DB(Database)�� �� ��
       Ȧ������ ���� �� ������ �ް��� �մϴ�.
       �ش� ������ ��� �� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�.
     */
		
		
		odbc od = new odbc();
		System.out.println(od.data());
		
		


	}
}
class odbc{
	private int db[];  // ������ ������� �ʵ��� ���
	
	public odbc() {
		int odata[] = {15, 22, 17, 14, 32, 35, 19, 33}; 
		this.db = odata;
		data();
	}
	public int data() {
		
		int aa = db.length;
        int total = 0;
		int w = 0;
		while(w<aa) {
			if (db[w] % 2 == 1) {
		total++;
			}
			w++;
		}
		return total;
		
	}
	
}