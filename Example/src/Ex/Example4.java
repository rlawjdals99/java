package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		/* 응용문제. 사용자가 직접 숫자를 입력 받습니다. Scanner
		   단, 사용자가 문자를 입력할 경우 예외처리가 진행 되어야 합니다.
		   총 숫자 입력은 7번이며, 사용자가 입력한 숫자를 오름차순으로 정렬합니다.
		   
		    "숫자를 하나 입력해 주시길 바랍니다. : "  - 7번 
		     결과 : [6, 22, 37, 44, 45, 80, 100]
		     추가옵션 - 짝수와 홀수값을 별도로 배열을 관리 하도록 합니다.*/
		
		

      Scanner sc = new Scanner(System.in);
      
      LinkedList<Integer> data = new LinkedList<Integer>();
      LinkedList<Integer> data2 = new LinkedList<Integer>();
      
      for(int b=0;b<7;b++) {
    	  System.out.println("숫자를 하나 입력해 주시길 바랍니다.");
      
      try {
    	  Integer ck = Integer.valueOf(sc.next());   	  
		
		if (ck % 2 == 0) {
			data.add(ck);
		}
		else {
			data2.add(ck);
		}
		
	} catch (Exception e) {
    System.out.println("숫자 입력해");
	}
      }
      Collections.sort(data);
      Collections.sort(data2);
      System.out.println(data + " " + data2);
		
	}
}