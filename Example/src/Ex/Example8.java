package Ex;

import java.util.Arrays;

public class Example8 {

	public static void main(String[] args) {
		
		/* 다음 결과처럼 각각의 배열로 나누어진 것을 다음과 같이 배열로 정렬해 주시길 바랍니다.
		   [홍길동=55, 이순신=60, 강감찬=80, 유관순=95] */
		
		
		
		box2 bx = new box2();
		bx.setter();
	}
}
class box2 implements interface8,interface8_1{
	@Override
	public void db() {
		
	}

	@Override
	public void setter() {
		System.out.println(Arrays.toString(this.user));
		System.out.println(Arrays.toString(this.startnumber));
	}
	
	@Override
	public String getter() {
		return null;
	}
	
	
	
	
}