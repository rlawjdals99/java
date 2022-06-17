package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {

	/*	{
			 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
			 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
			 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
			 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
			 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
			 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
			 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
			 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
			 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
			 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
			}    */
 
		
     user_list ul = new user_list();
     ul.setter("naver.com");
	 int total = ul.getter();
	 System.out.println("naver.com 은 총" + total + "명 입니다.");
		
		
	}
}

abstract class naver{
	String array[][];
	
	ArrayList<String> ar1 = null;
	
	
	public abstract void setter(String email);
	public abstract int getter();
	
	public abstract void db(); 
	
	
}

class user_list extends naver{
   int ea = 0;
	int total = 0;
	
@Override
public void setter(String email) {
   db();
   int w;
   for(w=0;w<ea;w++) {
	   // 원시형태의 배열사항으로 카운팅을 하게 됨. indexOf -1(없음)
	   if (this.array[w][5].indexOf(email)!= -1) {
		this.total += 1;
	}
	   
//		this.ar1 = new ArrayList<>(Arrays.asList(this.array[w][5]));
//           if (this.ar1.get(0).indexOf(email) != -1) {
//			    
//        	   this.total += 1;
//		}
   
   
   
   
   }
	
	
}


@Override
	public int getter() {
	return this.total;
	}

@Override
	public void db() {
		
	this.array = new String[][] {
		 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
		 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
		 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
		 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
		 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
		 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
		 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
		 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
		 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
		 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
		 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
		};
	
		 
		
		ea = this.array.length;
		
		
	
	


}
}






