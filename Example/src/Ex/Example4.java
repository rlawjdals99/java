package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		/* ���빮��. ����ڰ� ���� ���ڸ� �Է� �޽��ϴ�. Scanner
		   ��, ����ڰ� ���ڸ� �Է��� ��� ����ó���� ���� �Ǿ�� �մϴ�.
		   �� ���� �Է��� 7���̸�, ����ڰ� �Է��� ���ڸ� ������������ �����մϴ�.
		   
		    "���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�. : "  - 7�� 
		     ��� : [6, 22, 37, 44, 45, 80, 100]
		     �߰��ɼ� - ¦���� Ȧ������ ������ �迭�� ���� �ϵ��� �մϴ�.*/
		
		

      Scanner sc = new Scanner(System.in);
      
      LinkedList<Integer> data = new LinkedList<Integer>();
      LinkedList<Integer> data2 = new LinkedList<Integer>();
      
      for(int b=0;b<7;b++) {
    	  System.out.println("���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.");
      
      try {
    	  Integer ck = Integer.valueOf(sc.next());   	  
		
		if (ck % 2 == 0) {
			data.add(ck);
		}
		else {
			data2.add(ck);
		}
		
	} catch (Exception e) {
    System.out.println("���� �Է���");
	}
      }
      Collections.sort(data);
      Collections.sort(data2);
      System.out.println(data + " " + data2);
		
	}
}