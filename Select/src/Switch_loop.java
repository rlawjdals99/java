
public class Switch_loop {

	public static void main(String[] args) {

		String sign = "*";
		int total;
         /* case�ȿ� ������ �ݺ����� ����� �� �ֽ��ϴ�.
            ���� ������ �������� ����ص� �����ϸ�, case ������
            �ٸ��� �۵��ϱ� �빮�� ������ �Ǵ� ������ �����ϴ�.
            ��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� �ʽ��ϴ�.
          */
		
		
		switch (sign) {
		case "+" -> {
			int f;
			total = 0;

			for (f = 1; f < 6; f++) {
				total += f;
			}
			System.out.println("�� 1~5���� ���� ���� " + total);
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
			System.out.println("�� 1~5���� ���� ���� " + total);

		}
		case "/" -> {
			total = 0;

		}

		}

	}

}
