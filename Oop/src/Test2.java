
public class Test2 {

	public static void main(String[] args) {
		/* �����
		   �̼��� 90 40 100
		   ȫ�浿 88 60 70
		   ������ 70 100 50   */
		
		String array[][] = {
				{"�̼���", "ȫ�浿", "������",},
				{"90", "40", "100"},
				{"88", "60", "70"},
				{"70", "100", "55"}
                  		};
		int a,b;
		
		for(a=0;a<3;a++) {
			System.out.println(array[0][a]);
			for(b=0;b<3;b++) {
				System.out.println(array[a+1][b]);				
			}
		}
	}
}
