package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_more {
// ArrayList 2차 배열형태, 다차원도 포함
	public static void main(String[] args) {

	   String member_data[][] = new String[][] {
		   {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
			 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
			 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"}
	   };
			  // String[] : 2차배열 이상,  Integer[] : 2차배열 이상
	   ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data)); 
	   
          int w = 0;
         while(w<list.size()) {
        	 
        	 System.out.println(list.get(w)[2]);
        	 w++;
         }
		
		
		
		
	}

}
