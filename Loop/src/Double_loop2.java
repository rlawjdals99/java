
public class Double_loop2 {

	public static void main(String[] args) {



            int w=1;
            while(w<4) {
            
            	int ww=1;  // 작은 while문의 초기값은 큰 반복문 안에 적용해야 한다.
            	while(ww<5) {
                 //System.out.println(w+" "+ww);
            		ww++;
            	}
            	w++;
            }

            int dw=1;
            do {
				// do while문 또한 while문 같이 초기값을 큰 반복문 안에 설정해야 함.
            	int ddw=1;            	
            
				do {
            		
            		System.out.println(dw+ " + " + ddw);
            		ddw++;
            		
				} while (ddw<5);   // 작은 반복문 범위
            	
            	dw++;

            } while (dw<4);   // 큰 반복문 범위
            
		
		
		
	}

}



