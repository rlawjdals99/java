import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {

		/* ���빮��. data = {"hong45", "lee90", "kang100", "park70", "kim72"};
		   �ش� �迭 ������ ���� main2��� �޼ҵ�� ���� �����ϴ�.
		   �ش� ���� ���� �� ����ó���� ������ �߻� ���Ѿ� �ϸ�,
		   ���� ���� ���� ���� �������� ������ �˴ϴ�.
		   main2������ �ش� �迭 ���� ���� �� �ش� ������ ��� �ջ� �� 
		   ����� ���;� �˴ϴ�. ��, ���� ��ȯ�� ������ �߻��� ��� finally�� üũ ��
		   main2 �޼ҵ�� �ٽ� ȣ���Ͽ� ���������� �����Ͱ� �������� �Ͻʽÿ�. 
		 */
		String data[] = {"hong45", "lee90", "kang100", "park70", "kim72"};
		try {
			Exception3 ex = new Exception3();
			ex.main2(data);
		} catch (Exception z) {
			System.out.println(z);
		}
		finally {
			ArrayList<String> rdata = new ArrayList<>();
			int j;
			String modify;
			for(j=0;j<data.length;j++) {
				modify = data[j].replaceAll("[a-zA-Z]","");
				rdata.add(modify);
			}
			
			String cdata[] = new String[rdata.size()];

			for(int q=0;q<rdata.size();q++) {
				cdata[q] = rdata.get(q);
			}
			
			try {
				main2(cdata);
				
			} catch (Exception h) {
				//printStackTrace() : ������
				if (h.getMessage()==null) {
					System.exit(0);
				}
				else {
					System.out.println(h);
				}
				}
		}
	}
	public static void main2(String[] dt) throws Exception{
		int total = 0;
		for(int i=0;i<dt.length;i++) {
			int a = Integer.valueOf(dt[i]);
			total += a;
		}
		System.out.println(total);
		Exception e = new Exception();
		throw e;
		
		
	}
	
	
}
