import java.util.Iterator;
import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		// for�� + scanner
		// ���Ͻô� ������ ���ڸ� �Է��ϼ���.
		Scanner a = new Scanner(System.in);   // �Է¿��� �ε�
        System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���."); // ��������
		int b = a.nextInt(); //����ڰ� �Է��� ����
        int c;  // �ݺ����� ����ϴ� ����
        int d;  // �ݺ����� ������� �����
        for(c=1;c<=9;c++) {
	    d = b *c;  // �������
	    System.out.printf("%d ",d);  // ���     
       }
        a.close(); // ���
	}
}
