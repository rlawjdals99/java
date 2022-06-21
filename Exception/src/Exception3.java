import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {

		/* 응용문제. data = {"hong45", "lee90", "kang100", "park70", "kim72"};
		   해당 배열 데이터 값을 main2라는 메소드로 값을 던집니다.
		   해당 값을 던질 때 예외처리를 무조건 발생 시켜야 하며,
		   최초 값을 던질 때는 가공없이 던지게 됩니다.
		   main2에서는 해당 배열 값을 받은 후 해당 점수를 모두 합산 한 
		   결과가 나와야 됩니다. 단, 숫자 변환시 문제가 발생할 경우 finally로 체크 후
		   main2 메소드로 다시 호출하여 정상적으로 데이터가 나오도록 하십시오. 
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
				//printStackTrace() : 사용금지
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
