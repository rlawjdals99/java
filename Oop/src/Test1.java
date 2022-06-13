
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

		// 이순신 90, 홍길동 40, 유관순 100
		
		String array[][] = {
				{"이순신", "홍길동", "유관순",},
				{"90", "40", "100"},
                  		};
		
		int z,x;
		for(z=0;z<3;z++) {  //3바퀴
			
         for(x=z;x<=z;x++) {  // 1바퀴
        	 
        	 System.out.println(array[0][x] + array[1][z]);
         }
			
			
		}
		
		
		
		
		
		
		
		
	}
}
