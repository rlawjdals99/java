/*�θ�Ŭ���� �� �ڽ�(����)Ŭ���� ����*/
public class Class1 {

	public static void main(String[] args) {

		parents p = new parents();
       p.p_box();
       
       parents.child pc = p.new child();
       pc.c_box();
		//�θ�class.�ڽ�class �̸����� = �θ�Ŭ������. new �ڽ�Ŭ������ (�ν��Ͻ��� ����)
		
		
		
	}

}

class parents{   // �θ�class
	String a = "ȫ�浿";    // �θ� �ʵ忡 �ִ� ��������(this)
	String b;
	class child{  // �ڽ�class
		int a = 20;
		
		public void c_box() { //�ڽ�method
			double c = 10.5;
		    System.out.println(c);  // �ڽĸ޼ҵ� ���� ��������
		    System.out.println(this.a);  // �ڽ�Ŭ���� ���� ��������
		    System.out.println(parents.this.a); // �θ�Ŭ���� ���� ��������
		System.out.println(parents.this.b); // �θ�Ŭ���� ���� ��������
		
		}
	}	
	public void p_box() { //�θ� method
		String a = "�̼���";   // p_box�� �ִ� �������� 
        b=a;	    
//		System.out.println(a);
	}
	
	
	
	
	
}