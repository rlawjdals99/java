
public class Example1 {

	public static void main(String[] args) {

         /* ���빮��.  �迭 + �޼ҵ� ����
            1���迭�� ������ ���� ���� �ֽ��ϴ�.
            �迭����Ʈ 22, 33, 44, 55, 66, 77, 88, 99 �̸�
            �ش� ��ü ���� ��� ���� �հ� ���� ������ �޼ҵ�� 
            ó�� �ǵ��� �մϴ�. ��, �ݺ������� ������ do~while������ �ۼ�
          */
		
		
	int a[] = {22, 33, 44, 55, 66, 77, 88 ,99};
	
		
		name(a);

	}

	
	public static void name(int f[]) {
		int b = f.length;   // �迭 �����ľ�
		int c = 0;
		int total =0;
		
		do {
			total += f[c];
			c++;
		} while (c<b);
		
		System.out.println(total);

	}
}
