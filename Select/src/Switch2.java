import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
       /* ���빮��. ����ڰ� ������ ���� ������ �޽��ϴ�.
          "1 ~ 5"���� ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�. 
          �������
          1 : 5% ��������
          2 : 10% ��������
          3 ~ 4 : �ù�� ����
          5 : ������ȸ��       
                 
         */
		
		
	/*	   Scanner a = new Scanner(System.in);
		   System.out.println("1 ~ 5 ���� ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�. ");
		   int b = a.nextInt();
		
		   
		   switch(b) {
		        
		   case 1:
			    System.out.println("5% ��������");
		        break;		   
	      
		        case 2:
			    System.out.println("10% ��������");
			    break;
		      
		        case 3,4:
			    System.out.println("������");
				break;
		        
		        case 5:
			    System.out.println("������ȸ��");
				break;
		   }    
				a.close();   */
		
		  Scanner a = new Scanner(System.in);
		   System.out.println("1 ~ 5 ���� ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�. ");
		   int b = a.nextInt();
		   String  msg;     
		
		   
		 /*  switch(b) {
		   case 1:
			    msg = "5% ��������";
		        break;		   
	      
		        case 2:
		        	msg = "10% ��������";
			    break;
		      
		        case 3,4:
		        	msg = "������";
				break;
		        
		        case 5:
		        	msg = "������ȸ��..";
				break;  */
				
		   /* switch version���� */
		   /* �ǹ����� ��� */   
		   
		   switch(b) {  // �ڹ� 14�������� ��밡��
                case 1 ->{
                msg = "5% ��������";	
                }
                case 2 ->{
                    msg = "10% ��������";	
                    }
                case 3,4 ->{
                    msg = "������";	
                    }
                default ->{
                    msg = "������ȸ��";	
                    }               
                }		   
		   System.out.println(msg);
		a.close();	
		   }	   	
	}

