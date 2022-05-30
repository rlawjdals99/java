import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {

	/*	String[] names = new String[3]; // 값이 없는 배열. 공간만 만들어 놨음
          	
		String m[] = {"홍길동","이순신","강감찬"}; // 배열밧에 데이터가 있는 상태.
	    int ct = 0;  // for each에는 인덱스 번호가 없으므로 새롭게 인덱스 번호를 지정해주기 위한 변수
		
		for(String a : m) {
	       if (a.equals("홍길동") || a.equals("강감찬")) { 
	    	// 해당 (기존m)배열값 중 조건에 맞느 값만 추려서 새로운 배열값에 추가함
	    	  
	    	   names[ct] = a;
	      	   ct++; // 인덱스 번호를 순차적으로 적용하기 위한 증가값
			
		}
	    }
          int name_ea = names.length;
		
		System.out.println(Arrays.toString(names));
		
		
//		System.out.println(names[2]);  */
	
	/* 응용문제. 배열(Array)
	   사용자가 장바구니에 내용을 결제하게 됩니다.
	   단, 해당 금액 리스트를 출력하지 말고, 최종 전체 결제금액만 출력 되도록 합니다.
	   1500, 22000, 13000, 14500, 113800, 45000 */
	
		
      int a[] = { 1500, 22000, 13000, 14500, 113800, 45000 };
	
      int total = 0;
      int b = 0;
      int d = a.length;
	
      while(b<d) {
    	  total += a[b];
    	  b++;
      }
	System.out.println(total);
	
	
	}

}