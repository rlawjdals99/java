import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {

// ��迭 ������ �ش� �����Ͱ� �ִ� �迭�� Ŀ���� ���
		int a[] = new int [3];  // 3���� ������ ������

	    int b[] = {1, 2, 3, 4, 5, 6, 7}; // 7���� ��ü�� �ִ� ��Ȳ

	    int a_ea = a.length; 
	    int ea = b.length; // b�迭�ȿ� ��� ������ ��ü�� ����ִ��� Ȯ��
   // System.out.println(a.length);
	    int w = 0;
	    int ct = 0;
	    while(w<ea) {
	    	
       if (b[w]%2==0 && ct<a_ea) {  //if(b�迭�� ���� ¦���� && ���ο� a �迭�� ��ü ��ü ũ�� ��ŭ��)
          a[ct] = b[w];		
          ct++;  // ���ǿ� ������ �ε��� ��ȣ�� +1�� ������Ŵ
       }
       w++;
	    }	    
       System.out.print(Arrays.toString(a));

       
      
	    }	    	
	}


