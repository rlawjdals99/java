package Ex;

import java.util.Arrays;

public class Example8 {

	public static void main(String[] args) {
		
		/* ���� ���ó�� ������ �迭�� �������� ���� ������ ���� �迭�� ������ �ֽñ� �ٶ��ϴ�.
		   [ȫ�浿=55, �̼���=60, ������=80, ������=95] */
		
		
		
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