package Ex;

public class Example7 {

	public static void main(String[] args) {

		/* 응용문제.
		   {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
		   abstract을 사용하여 setter, getter를 무조건 적용합니다.
		   메인에서는 해당 데이터를 외부 class로 전달하고 최종 정보값만 배열로 
		   생성하여 출력 되도록 합니다. 
		   단, setteㄱ에서 배열 데이터중 4자리 미만에 있는 배열만 새로 생성하여 
		   getter로 값을 받아 메인에서 배열로 출력하세요. */
		
		String names[] =  {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
	
		
		name n = new name();
		n.name1(names);
		
	}
}
abstract class nm{
	abstract public void name1(String[] nms);
	abstract public String name2(); 
}

class name extends nm{
	int i;
	@Override
	public void name1(String[] nms) {
		int w=0;
		for(int i=0;i<nms.length;i++) {
			int ea = nms[i].length();
			System.out.println(nms[i]);
		}
	}
@Override
	public String name2() {
		return null;
	}	
	
}
