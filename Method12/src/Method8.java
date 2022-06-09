import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
    /* 응용문제. 협업 프로그래머가 해당 DB(Database)에 값 중
       홀수값에 대한 총 갯수를 받고자 합니다.
       해당 갯수를 출력 될 수 있도록 코드를 작성하시오.
     */
		
		
		odbc od = new odbc();
		System.out.println(od.data());
		
		


	}
}
class odbc{
	private int db[];  // 열값이 변경되지 않도록 사용
	
	public odbc() {
		int odata[] = {15, 22, 17, 14, 32, 35, 19, 33}; 
		this.db = odata;
		data();
	}
	public int data() {
		
		int aa = db.length;
        int total = 0;
		int w = 0;
		while(w<aa) {
			if (db[w] % 2 == 1) {
		total++;
			}
			w++;
		}
		return total;
		
	}
	
}