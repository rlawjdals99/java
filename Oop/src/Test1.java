
public class Test1 {

	public static void main(String[] args) {
       // 1+1 ~ 1+5, 2+1 ~ 2+5, 3+1 ~ 3+5
		
		int w = 1;
		int f;
		
		while(w<5) {
		for(f=1;f<6;f++) {
//			System.out.println(w + "+" + f);
		}
			w++;
		}

		// �̼��� 90, ȫ�浿 40, ������ 100
		
		String array[][] = {
				{"�̼���", "ȫ�浿", "������",},
				{"90", "40", "100"},
                  		};
		
		int z,x;
		for(z=0;z<3;z++) {  //3����
			
         for(x=z;x<=z;x++) {  // 1����
        	 
        	 System.out.println(array[0][x] + array[1][z]);
         }
			
			
		}
		
		
		
		
		
		
		
		
	}
}
