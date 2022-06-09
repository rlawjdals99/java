
public class App {

	public static void main(String[] args) {
		//내가 한 것.
		int a = 25+31*4+12;
		byte b = 15*3+9+14;
		if (a<b) {
			System.out.println("a값이 더 작습니다.");
			}
		else if (a>b) {
			System.out.println("a값이 더 작습니다.");
			
		}
	if (a<b) {
		System.out.println("b값이 더 작습니다.");
	}
	else if (a>b) {
		System.out.println("b값이 더 작습니다.");
		}
	// 선생님 풀이.
	int a1 = 25 + 31 * 4 + 12;
	int b1 = 15 * 3 + 9 + 14;
	
	if (a1 > b1) {
		System.out.println("공식2번 값이 더 작습니다");
		}
	
	else if (a1 < b1) {
		System.out.println("공식1번 값이 더 작습니다.");
	}
	else {
		System.out.println("두 값이 같습니다.");
	}
	
	/* 해당값을2진수로 짝수, 홀수로 확인하기 */
	int c = b%2; // %기호로 사용시 0 또는 1로 나머지 값이 출력.
	if (c==0) {
		System.out.println("짝수입니다.");
	}
	else {
		System.out.println("홀수입니다.");
	}
	
	}
	}
	


