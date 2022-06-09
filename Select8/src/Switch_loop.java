
public class Switch_loop {

	public static void main(String[] args) {

		String sign = "*";
		int total;
         /* case안에 각각의 반복문을 사용할 수 있습니다.
            또한 동일한 변수형을 사용해도 가능하며, case 각각이
            다르게 작동하기 대문에 문제가 되는 사항은 없습니다.
            단, case는 하나의 조건이 맞을 경우 나머지 case는 절대 작동하지 않습니다.
          */
		
		
		switch (sign) {
		case "+" -> {
			int f;
			total = 0;

			for (f = 1; f < 6; f++) {
				total += f;
			}
			System.out.println("총 1~5까지 계산된 값은 " + total);
		}
		case "-" -> {
			total = 0;

		}

		case "*" -> {
			total = 1;
			int f = 1;
			while (f < 6) {
				total *= f;
				f++;
			}
			System.out.println("총 1~5까지 계산된 값은 " + total);

		}
		case "/" -> {
			total = 0;

		}

		}

	}

}
