
public class Class3 {
	// package�� ������� ����(default��)

	public static void main(String[] args) {
		// �ڷ���(��������) ��ȯ

		// double -> int�� ��ȯ
		double a = 137;
		int b = (int) a;

		// int -> double�� ��ȯ
		int c = 35;
		double d = (double) c;

		// String -> int �ȵ�
		String x = "35";
		String x2 = "156";
		int z = Integer.parseInt(x); // parseInt (int���� ����ϴ� ������� �����)
//		int z = Integer.valueOf(x);  // valueof �޼ҵ�(�޼ҵ��Լ�) -> parseInt

		int total = Integer.parseInt(x) + Integer.parseInt(x2);
		// �������� ���ڷ� ��ȯ�Ͽ� �������� ó����

		System.out.println(total);

		// long ���� Long.parseLong �����
		String j = "923456789";
		String j2 = "9123456789";
//		int total2 = Integer.parseInt(j) + Integer.parseInt(j2);
		long total2 = Long.parseLong(j) + Long.parseLong(j2);
		double total3 = (double) total2;

		System.out.println(total2);
		System.out.println(total3);
		
        // ����(char) -> ����(String)
		char p = 'M';  // char : �� �ܾ �� �� ����
        String f = String.valueOf(p); // ���� -> ���� (valueof)�� ���
		System.out.println(f);
	
	
	}

}
