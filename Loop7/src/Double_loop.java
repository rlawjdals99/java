import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop {

	public static void main(String[] args) {
		
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YY/MM/DD");
		SimpleDateFormat time = new SimpleDateFormat("H:M:S");
		System.out.println(date.format(today));
		System.out.println(time.format(today));
        
        //format : �԰�ȭ�� ���·� ���� ǥ���� �� ����ϰ� �˴ϴ�.
		
		
		
		
		

	}

}
