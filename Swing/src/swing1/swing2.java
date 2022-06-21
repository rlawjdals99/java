package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {
	public static void main(String[] args) {
			//ArraysList, LinkdeList (배열값)  - add, remove, get, size
			//Map (배열키, 배열값) - put, remove, size
			//Map은 배열키를 기반이기 때문에 키를 통해서 데이터를 확인합니다.(속도 최상급)
			//같은 키를 사용시 마지막에 있는 값으로 출력됩니다.
			// ※ 키값을 절대 중복 시키지 않음
			Map<String, String> m = new HashMap<>();
			//hong -> Hash function(HashMap) -> 0x21949CB (중복값이 발생하지 않음)
			m.put("hong", "홍길동");
			m.put("kang", "강감찬");
			m.put("", "박혁거세");		//비어있는 키를 사용은 할 수 있으나, Map에 원리에는 올바르지 않음
			m.put("park", "");		//키는 있으나 값이 비어있을 경우는 사용됨		
			if (m.get("park").equals("")) {
				m.put("park", "박");
			}  
			m.remove("hong");
			System.out.println(m.get("park"));
			System.out.println(m);
	
			//Map : 여러개의 자료형을 사용할 수 있음
			Map<String, Integer> mm = new HashMap<>();
			mm.put("age",32); 
			mm.put("level", 5);
			System.out.println(mm);
			System.out.println(mm.keySet());  	//키만 출력
			System.out.println(mm.values());	//값만 출력
			System.out.println(mm.containsKey("age"));		//해당 키가 있는지 확인(있으면 true, 없으면 false)
	
	}
	}

