import java.util.Scanner;

// import : java�� �ִ� ������ �ε��� �� ����ϴ� ���.
// export : java�� �ִ� ������ ������ ������ �� �ִ� ���.
// java.util ��Ű�� �ȿ� Scanner Ŭ���� �κ��� �ε�.
// java.util äŰ���� �׳� ������� ���ϸ� new�� �Ҵ��Ͽ� �����ڸ� ����ؾ� ��.
// ��, �ش� �ڵ� ��ġ�� �ۼ��ڵ� ���� �Ʒ��� ������ �ȵ�.
public class If4 {

	public static void main(String[] args) {
// new : ��ü�� �����ϴ� ��.
		Scanner a = new Scanner(System.in);
		// System.in(�Է�) |= System.out(���)

		System.out.print("���̵� �Է��ϼ���.");
		String mid = a.next();
// next() : ����ڰ� �Է��ϴ� ����. (����, ���ڸ� �Է� �޴� ����)

		System.out.println(mid);
	}
}
