
public class Test4 {

	public static void main(String[] args) {

//	loadbox lb = new loadbox();	
//	lb.name();
//	lb.name2();

	/* ���빮��. �ܺ� class�� �̿��Ͽ� �ش� �޼ҵ� ���� ����մϴ�.
	   �ܺ� class �̸��� books �̸�, �ȿ� �޼ҵ�� �� 3���� �޼ҵ尡 ���� �մϴ�.
	   �޼ҵ� �̸��� ���� book1, book2, book3���� �̷���� �ֽ��ϴ�.
	   book1�� ȣ��� "book1�޼ҵ�" ��� ���
	   book2�� ȣ��� "book2�޼ҵ�" ��� ���
	   book3�� ȣ��� "book3�޼ҵ�" ��� ���
	   */
		books bk = new books();
		bk.book1(35);
		bk.book2("�ٵ���");
		bk.book3("ȫ�浿",40);
//        int pp = bk.book4();
//        System.out.println(pp);
	
		/* return�޼ҵ忡 ���� 9�� 20�� �μ������� �����մϴ�.
		   �ش� �ΰ��� ���� ���Ͽ� ������� ����Ͻÿ�. */
	
        int q = bk.book4(9,20);	
	System.out.println(q);
	
	/* book5�� ����� ���ڸ� �ϳ��� �μ������� �����մϴ�.
	   �μ����� ���� book5������ 100, 200�� ���� ���� 
	   �μ����� ���Ͽ� ������� ����Ͻÿ�.
	   
	   �μ��� : 4
	   (100+200)*4 
	   ��� : 1200
	    */
	
	
	
	
	}
}
class books{
    String zz = "����";
	public void book1(int a) {
//		System.out.println(a+this.zz);
	}
	
    public void book2(String b) {
//	System.out.println(b+this.zz);
	}

    public void book3(String c, int d) {
//	System.out.println(c+","+d+this.zz);
    }

    
    public int book4(int o, int r){
    	int e = o*r;
    	return e;
    }
    
}

//class loadbox{  //class�� ������ method�� �־�� �մϴ�.
//	int a = 123;
//	public void name() {
//		System.out.println(a);
//	}
//	public void name2() {
//		System.out.println(a);
//	}
//}