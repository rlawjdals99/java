import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {

		/* 응용문제.
		   다음 배열값이 있습니다. 해당 배열값을 비교하여 사용자 정보를 출력하시오.
		   
		   Adata = hong, kim park jang lee soun
		   Bdata = 80, 100, 46, 38, 65, 88
		   
		   결과배열에 따른 조건(if)은 60점 이상(포함) 중 합격자만 출력합니다.
		   [hong,kim,lee,soun]	 */
		String data[][] = {
				{"hong", "kim", "park", "jang", "lee", "soun"},
				{"80", "100", "46", "38", "65", "88"}
								};
		int ea = data[0].length;
		String d[] = new String[ea];
		int i;
		for(i=0;i<ea;i++) {
			int score = Integer.parseInt(data[1][i]);
			if (score > 60) {
				d[i] = data[0][i];
			}
		}
		System.out.println(Arrays.toString(d));






	}

}