
public class Method14 {

	public static void main(String[] args) {

		mbc m = new mbc();
		mbc m2 = new mbc("이순신");
	}

}

class mbc{
	public mbc() {  //일반 construct
		System.out.println("구조1");
        test();
	}

	public mbc(String user) {  // 인수값이 있는 construct
		System.out.println(user);
	test(user);
	}
	public void test() {
		System.out.println("메소드");
    total();	
	}
	public void test(String user) {  //인수값이 있는 method
		System.out.println(user);
		total();
	}
    public static void total() {
		System.out.println("시스템 종료");
	}
	
	
}