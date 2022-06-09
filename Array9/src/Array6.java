import java.util.Arrays;
import java.util.Iterator;

public class Array6 {

	public static void main(String[] args) {

		/* 응용문제. 다음중 장바구니에 여러개의 상품이 담겨져 있습니다.
		   그 중 택배비가 별도로 측정되는 금액만 추출하시오.
		   택배비는 3만원 이상(포함)
		   15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700
		 [48000, 67000, 118200, 49800]		 */
		
		
		int a[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 };
		int b = a.length;
		int j = 0;

	  int k[] = new int[10]; 

		
		int t = 30000;
		int ct = 0;
		while( j < b) {
               if (a[j] > t ) {
				k[ct] = a[j];
				ct++;
			}			
		j++;	
		}		
		System.out.println(k);
			
/*			int b[] = new int[6];
		int a[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 };
		int a_ea = a.length;
		int w = 0;
	    int ct = 0;
		
		do {
		
            if (a[w] >= 30000) {
				b[ct] = a[w];
				ct++;
            }									
			w++;
		} while (w<a_ea);
		System.out.println(Arrays.toString(b));*/
		
		
		
		
		
		
	}

}
