
public class Example1 {

	public static void main(String[] args) {

         /* 응용문제.  배열 + 메소드 문제
            1차배열에 다음과 같이 값이 있습니다.
            배열리스트 22, 33, 44, 55, 66, 77, 88, 99 이며
            해당 전체 값을 모두 더한 합계 값을 별도의 메소드로 
            처리 되도록 합니다. 단, 반복문으로 무조건 do~while문으로 작성
          */
		
		
	int a[] = {22, 33, 44, 55, 66, 77, 88 ,99};
	
		
		name(a);

	}

	
	public static void name(int f[]) {
		int b = f.length;   // 배열 갯수파악
		int c = 0;
		int total =0;
		
		do {
			total += f[c];
			c++;
		} while (c<b);
		
		System.out.println(total);

	}
}
