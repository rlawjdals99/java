package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {

		/* 응용문제. 사용자가 숫자금액을 입력합니다.
		   해당 숫자 금액 횟수는 총 8번입니다.
		   0~n 까지 입력 가능하며
		   해당 입력이 모두 끝나면 최종 합계 금액을 출력 시키시오.
		   예시) 
		   입금한 금액을 적으세요.
		   500 600 500 400 200 100 50 50
		   
		   결과)
		   총 입금 금액은 : 2400원 입니다.
		 */

		LinkedList<Integer> list = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);

		int w = 0;
		int total = 0;
		while(w<8) {
			
			System.out.println("입금한 금액을 적으세요.");
			String a = sc.next();
			try {
				int pp = Integer.parseInt(a);
				int ea = list.size();
			list.add(pp);
			total += pp;
			}
			catch (Exception e) {
        System.out.println("그만");
			}
		w++;
		}
		System.out.println("총 금액은 : " + total);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
