
public class Class2 {

	public static void main(String[] args) {

    /* ���빮��. ���� Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����Ͻÿ�.
       Ŭ������ 2������ �ֽ��ϴ�.
       �θ� Ŭ���� �̸� : mother
       �ڽ� Ŭ���� �̸� : child
       ���� Ŭ�������� mother Ŭ������ ���� ����
       30, 50 ���ڰ��� �����մϴ�.
       child���� �θ� Ŭ������ �ִ� ���� �޾�
       �ΰ��� ���ڸ� ���� ��� ���� ����Ͻÿ�  */
		
		mother mm = new mother();
		mm.mom(30,50);
		
	    mother.child son = mm.new child();	
	 	son.ch();
		
		
		
		
		
	}
}
class mother{
	int c,d;
	public void mom(int a, int b) {
      this.c = a;
      this.d = b;
	
	}
	
	
	class child{
		int aa = mother.this.c;
		int bb = mother.this.d;

		public void ch() {
			int e = this.aa * this.bb;
			
			System.out.println(e);
		}
		
		
	}
	
	
	
	
}




