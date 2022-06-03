import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {

		/* 응용문제5
		 * 2차배열 + 기본(클래스)메소드 문제
		 * 등록된 고객층 vip 고객만 리스트를 출력하시오.
		 * 
		 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 * user_level : gold vip guest gold vip vip guest
		 * 
		 * 결과출력 : 이순신 세종대왕 김유신*/
	
		
		String user[][] ={
			{"홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"},
			{"gold", "vip", "guest", "gold", "vip", "vip", "guest"}
			}; 
		Example5 ex = new Example5();
      ex.name(user);
		
	
	}
public void name(String aa[][]) {
	int gp = aa.length;
   int e = aa[0].length;
   int w = 0;
/*	내가한거
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
