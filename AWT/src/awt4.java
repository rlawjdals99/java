
public class awt4 {

	public static void main(String[] args) {
       //awt4_class.java ����
	decorate dc = new decorate();	
		dc.view();
		
		
		
		
		
	}
}

class decorate extends awt4_class{
	public String aws = "";
       	public void btn_push(int c) {
			/* ����ڰ� �Է��� ���ڸ� �������� �������� �ۼ� */
       		
       		int w;
       		String prf = "";
       		for(w=1;w<10;w++) {
                 int k = c * w;  			
       			prf +=  c + "*" + w + "=" + k; 
       			
       		}
       		
         this.aws = prf;
       		
       		
       		
       		
       		
       		
//       		System.out.println(c);
       	}
public String calls() {
	return this.aws;
}
       		
	
	
	
	
}