
public class oop4 {
	// �߻� Ŭ���� �� �޼ҵ� abstract
	public static void main(String[] args) {
		ab_2 ab = new ab_2();
        ab.b();
        System.out.println(ab.c());
        
        
	}
}

abstract class ab_1 { // �߻� Ŭ����(�ܺο��� �ε尡 ����ȵ�) - ��ü ���� (X)

	public void ab_a() {  // free(�μ��� ���� �߻� �޼ҵ�) - ����ص� �ǰ� ���ص� �� 
	}

	public void ab_a(int a) { // free (�μ��� �޴� �߹� �޼ҵ�)  
	}

	public abstract int b(); // �߻� �޼ҵ� - ��ü ���� (X)

}

class ab_2 extends ab_1 {
	
	@Override
	public void ab_a(int a) {
		
	}
	
	@Override
    public void ab_a() {
		
		System.out.println(this.c());
	}
	
	public int b() { // ���� �޼ҵ� + �߻� �޼ҵ�
		return 55;
	}
	public int c() {
		return 99;
	}
}