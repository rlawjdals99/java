
public class Method14 {

	public static void main(String[] args) {

		mbc m = new mbc();
		mbc m2 = new mbc("�̼���");
	}

}

class mbc{
	public mbc() {  //�Ϲ� construct
		System.out.println("����1");
        test();
	}

	public mbc(String user) {  // �μ����� �ִ� construct
		System.out.println(user);
	test(user);
	}
	public void test() {
		System.out.println("�޼ҵ�");
    total();	
	}
	public void test(String user) {  //�μ����� �ִ� method
		System.out.println(user);
		total();
	}
    public static void total() {
		System.out.println("�ý��� ����");
	}
	
	
}