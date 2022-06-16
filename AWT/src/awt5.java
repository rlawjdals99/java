import java.util.ArrayList;
import java.util.Arrays;

// 중복 아이디 체크 시스템 만들기 : aw5_abstract 함게 사용
// 회원데이터 : hong, lee, park
public class awt5 {

	public static void main(String[] args) {

		handel hd = new handel();
		hd.design();

	}

}

class handel extends awt5_abstract{
     private String aid;  //awt에서 넘어온 인수값을 클래스에서 활용
     private String return_id;   //awt로 다시 값을 전달 하는 전역변수 : null일 경우 아이디 사용가능
     //아이디 값이 전달 : 해당 아이디는 사용할 수 없음
	ArrayList<String> db = null;
	
    @Override
    public void idcheck(String id) {   // setter
    	this.return_id = null; //awt에서 중복버튼을 클릭시 해당 변수를 지속적으로 초기화 하는 부분
    	this.aid = id;
        this.dataload();   // 정상적으로 데이터가 넘어왔을 경우 해당 메소드를 로드하여 확인하게 됨
        int ea = this.db.size();
        int w;
        for(w=0;w<ea;w++) {
        	if (this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
			break;
        	}
        	
        	
        	
        }
        
    }
	
	@Override
	public String singok() {
		return this.aid = return_id;
	}
	
	
	
@Override
public void dataload() {
	
	    String ori[] = {"hong", "lee", "park", "jong", "kim"};
        this.db = new ArrayList<>(Arrays.asList(ori));

}	
	
}