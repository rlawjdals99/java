
public class If_for {

	public static void main(String[] args) {
		final int a = 1;   
		// final�� ���� ���� > ����� ����
		// ��� : ���� ������ �ʴ� ��(������)
		final String name = "ȫ�浿";
	  //System.out.println(name);
	  //System.out.println(a);

	 	final int ct = 55;     //������
		int f;     //�ݺ���
		boolean ok = false;   //���ǿ� ���� true, false;
		
		for(f=1;f<11;f++) {
		
			if(f==ct) {   //�ݺ��� ���� �������� ���� ���
				System.out.println("��ϵ� ���� Ȯ�ε˴ϴ�.");
			ok = true;   //���ǿ� ���� ���� �����Ѵ�.
			}   
		}
        if (ok==false) {  //���� �ݺ����� �����µ��� �ݺ��� �ȿ� ���ǻ����� ������� ��µǴ� �ڵ�
                	                 
					System.out.println("Ȯ���� �ȵǴ� �����Դϴ�.");
				}
		/* �� 20���� ���� �ݺ��մϴ�. �� �� Ȧ������ ����ϵ��� �մϴ�. */
           
           int ff;
           String odd="";     // odd : Ȧ��, even : ¦��
           for(ff=1;ff<21;ff++) {
        	   
        	   if (ff % 2 == 0) {
				System.out.print(ff+ " ");
			}
        	   else {  //���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰ� �˴ϴ�.
        		   odd += ff+ " ";  //�߰��� ��� "  " �� ������ Ȱ���Ͽ� ������.
        	   }
           }
           System.out.println(odd);
        
        
			}
		}
		
	


