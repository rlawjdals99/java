
public class Exception5 {
	//���� : �� �ְ�, ��¸� ��
	public static void main(String[] args) {
		words wd = new words();
		try {
			String result = wd.files(null);
			System.out.println(result);
		} catch (Exception e) {
//			System.out.println(e);
			if (e.getMessage() != null) {
				System.out.println(e);
			}
		}
		finally {
			try {
				String result = wd.files("ȫ�浿");
				System.out.println(result);
				
			} catch (Exception e2) {
				System.exit(0);
			}
		
		}
		
		
	}
}

class words{
	//���� : ���� �ް�, ���� �� return
	public String files(String aa) throws Exception{
		if (aa==null || aa.equals("")) {
			throw new Exception("���� ��� ����");
		}
		else {
			String msg = aa+ "�� ȯ���մϴ�.";
			return msg;
		}
		
		
	}
	
	
}