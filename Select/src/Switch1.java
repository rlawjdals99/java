
public class Switch1 {

	public static void main(String[] args) {
		
		/* switch-case : ���ù� 
		   �Էµ� �� �������� case�� �ߵ��Ͽ� ��°��� �����ϰ� �˴ϴ�. 
		   default�� case�� ���� �� ���� �ֿ��� �������� ���� ���
		   �۵��Ǵ� �����Դϴ�.
		   switch(���ڰ�) */
		
		int n = 3;
		switch(n) {
		case 1:
			
			System.out.println("�ɼ� 1�� �����ϼ̽��ϴ�.");
		
			break;
			
             case 2:
			
			System.out.println("�ɼ� 2�� �����ϼ̽��ϴ�.");
		
			break;
			
             case 3:
     			
     			System.out.println("�ɼ� 3�� �����ϼ̽��ϴ�.");
     		
     			break;
		
     			default:
     			System.out.println("������ ���� �����ϴ�.");
     			break;
		}
		
		
		String user = "leesunsin"; //���ڷ� switch���� ���ڰ� ����
	   	switch(user) { // ���� case���� �Դϴ�.
	   	    case "leesunsin":
		    case "�̼���":			
			System.out.println("A�� �Դϴ�.");
			break;
		    
		    case "ȫ�浿":	
			System.out.println("B�� �Դϴ�.");
			break;
		
            case "������":			
			System.out.println("C�� �Դϴ�.");
			break;
		
			default:
		    System.out.println("�������� D�� �Դϴ�.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
