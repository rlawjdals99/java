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
        
        //format : 규격화된 형태로 값을 표현할 때 사용하게 됩니다.
		
		
		
		
		

	}

}
