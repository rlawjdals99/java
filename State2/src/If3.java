
public class If3 {

	public static void main(String[] args) {
		// boolean : true, false�� ����. (true, false �� �� �ϳ��� ��� ����)
		boolean ck = true;
		if (ck == true) {
			System.out.println("ȸ�������� ���� �˴ϴ�");
		} else {
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�.");
		}

		String id, pw;
		id = "park";
		pw = "a1234";

		// && : �Ѱ��� �����̻� ��� ���� ���
		// || : �Ѱ��� �����̻󿡼� �Ѱ��� ���� ���

		if (id == "park" && pw == "a1234") {
			System.out.println("�α��� �ϼ̽��ϴ�.");
		} else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���.");
		}

		if (id == "park" || id == "kim") {
	  // if(mid=="park" || pw=="a1234) { // �� �����߿� �Ѱ����� ���� ���}
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		} else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}
	}
}
