import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {

		/* ���빮��5
		 * 2���迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * ��ϵ� ���� vip ���� ����Ʈ�� ����Ͻÿ�.
		 * 
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_level : gold vip guest gold vip vip guest
		 * 
		 * ������ : �̼��� ������� ������*/
	
		
		String user[][] ={
			{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
			{"gold", "vip", "guest", "gold", "vip", "vip", "guest"}
			}; 
		Example5 ex = new Example5();
      ex.name(user);
		
	
	}
public void name(String aa[][]) {
	int gp = aa.length;
   int e = aa[0].length;
   int w = 0;
/*	�����Ѱ�
    do {
        if (aa[1][w].equals("vip")) {
        

        	System.out.println(aa[0][w]);
        }
		
		w++;
	} while (w<e);	*/
   while(w<gp) {
	   int ww = 0;
	while(ww<e) {
     
		if (aa[w][ww].equals("vip")) {
			System.out.println(aa[0][ww]);
			
		}
		
		ww++;
	}
w++;	   
   }
}		

}
