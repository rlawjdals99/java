package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class lisf4 {
	
	public static void main(String[] args) {
		Integer a[] = {3, 6, 9, 12, 15}; 
	    LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));  //빈배열 생성

	    System.out.println(ln);
Scanner sc = new Scanner(System.in);	    
String user;
LinkedList<Integer> list = new LinkedList<>();

for(;;) //무한루프
while (true) {  //무한루프
	System.out.println("숫자를 입력하세요.");
       user = sc.next();
	try {  //사용자가 입력한 값이 있는지 확인하는 파트
int number = Integer.parseInt(user);
	list.add(number);	
int ea = list.size();
if (ea >=5) {break;}
	
}
	 catch (Exception e) {  // 오류가 발생하였을 경우 작동되는 파트
 System.out.println("해당 입력사항은 문자입니다. 숫자만 입력하세요.");
}

	System.out.println(list);
}
	
	
	
	
	}
}
