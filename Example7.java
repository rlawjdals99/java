package Ex;

public class Example7 {

	public static void main(String[] args) {

		/* ���빮��.
		   {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
		   abstract�� ����Ͽ� setter, getter�� ������ �����մϴ�.
		   ���ο����� �ش� �����͸� �ܺ� class�� �����ϰ� ���� �������� �迭�� 
		   �����Ͽ� ��� �ǵ��� �մϴ�. 
		   ��, sette������ �迭 �������� 4�ڸ� �̸��� �ִ� �迭�� ���� �����Ͽ� 
		   getter�� ���� �޾� ���ο��� �迭�� ����ϼ���. */
		
		String names[] =  {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
	
		
		name n = new name();
		n.name1();
		
	}
}
abstract class nm{
	abstract public void name1();
	abstract public String name2(); 
}

class name extends nm{
	@Override
	public void name1() {
		
	}
@Override
	public String name2() {
		return null;
	}	
	
}