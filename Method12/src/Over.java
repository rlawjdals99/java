
public class Over {

	public static void main(String[] args) {

		
//		pt p = new pt();
//		p.display();
		
		cd c = new cd();
		c.display("���� ���밪 ���"); //�����ε�
		c.display(); // �������̵�
	}

}
/* �����ε�(overloading) : ���ο� �޼ҵ带 �����ϴ� ���� ���մϴ�. */
/* �������̵�(override) : �θ� Ŭ�������� ��� ���� ���� �޼ҵ带 ����ϴ� ���� ���մϴ�. */
class pt{
	public void display() {
		
		System.out.println("�ܺ� ������ ��");
	}
}
		
class cd extends pt {
	
	/* aaaa() �޼ҵ�� �̳����̼��� ������� ����. �θ� class���� �������� �ʾұ� ������ 
	@Override
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}  */
	
	
	
	
	
	@Override   // �������̼� (ǥ��) ���� �߻��� Ȯ�� (�������̵�)
	public void display() { //�������̵�
		System.out.println("�ڽ� Ŭ���� ������ ����");
            super.display();  //�θ𿡴� ���� �Ӽ� �޼ҵ尪�� ������ �� ����մϴ�. 
	}
	public void display(String msg) {  //�����ε�
		System.out.println(msg);
	}
}
	
	