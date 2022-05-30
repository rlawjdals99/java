import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

	
	int a[] = {5, 10, 15, 20, 25, 30, 35};
    /* for each문을 사용할 때는 인덱스 번호가 필요없이 사용할 경우
       for~do~while문 사용할 때는 인덱스 번호가 필요할 때 사용
       인덱스 번호 : [0], [1], [2]
       */
	
	for(int f : a) {  // int f가 순차적으로 data배열값을 받아서 저장 시킵니다.
		
		if (f%2==0) {
			
	//		System.out.println(f);
		}
	}
		
  /*  	String pay[] = {"무통장입금", "신용카드", "휴대폰", "상품권", "쿠폰"};
    	Scanner sc = new Scanner(System.in);
    //	System.out.println("결제수단을 선택해 주세요.");
		String pm = sc.next();
		
		for(String z : pay) {  
	   // 배열 데이터가 문자 이므로 받는 변수형태 또한 문자형 이여야 함
		
			if (pm.equals(z)) {
               if (z.equals("휴대폰")) {
		//		System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
			}
               else {
		//		System.out.println(pm+"로 결제 진행 됩니다.");
			}
				
				
               
               //	System.out.println(pm+"로 결제 진행 됩니다.");
			}
			
			
			sc.close(); 
		}
		*/
		
	
	/* 응용문제. {햄버거, 피자, 치킨, 커피}
	   "주문하고자 하는 음식을 선택해 주세요." 
	    해당 질문은 총 4번을 물어보게 됩니다.
	    단, "주문종료" 라고 사용자가 입력시 그 즉시 주문은 종료 되묘,
	    주문 내역을 출력하시면 됩니다.*/
	
	
		String k[] = {"햄버거","피자","치킨","커피"};
	Scanner t = new Scanner(System.in);
	System.out.println("주문하고자 하는 음식을 선택해 주세요.");
	String total;
	for(String h : k) {	
		String i= t.next();
		if (i.equals(h)) {
			System.out.println("주문하고자 하는 음식을 선택해 주세요.");
		}
		else {
			total = i;
			System.out.println("주문하신 메뉴는 : " + total );
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
