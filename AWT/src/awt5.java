import java.util.ArrayList;
import java.util.Arrays;

// �ߺ� ���̵� üũ �ý��� ����� : aw5_abstract �԰� ���
// ȸ�������� : hong, lee, park
public class awt5 {

	public static void main(String[] args) {

		handel hd = new handel();
		hd.design();

	}

}

class handel extends awt5_abstract{
     private String aid;  //awt���� �Ѿ�� �μ����� Ŭ�������� Ȱ��
     private String return_id;   //awt�� �ٽ� ���� ���� �ϴ� �������� : null�� ��� ���̵� ��밡��
     //���̵� ���� ���� : �ش� ���̵�� ����� �� ����
	ArrayList<String> db = null;
	
    @Override
    public void idcheck(String id) {   // setter
    	this.return_id = null; //awt���� �ߺ���ư�� Ŭ���� �ش� ������ ���������� �ʱ�ȭ �ϴ� �κ�
    	this.aid = id;
        this.dataload();   // ���������� �����Ͱ� �Ѿ���� ��� �ش� �޼ҵ带 �ε��Ͽ� Ȯ���ϰ� ��
        int ea = this.db.size();
        int w;
        for(w=0;w<ea;w++) {
        	if (this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
			break;
        	}
        	
        	
        	
        }
        
    }
	
	@Override
	public String singok() {
		return this.aid = return_id;
	}
	
	
	
@Override
public void dataload() {
	
	    String ori[] = {"hong", "lee", "park", "jong", "kim"};
        this.db = new ArrayList<>(Arrays.asList(ori));

}	
	
}