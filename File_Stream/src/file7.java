import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/* 공통명령어 사항 : read(), readLine(), next(), nextLine() */
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOException{

		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF-8"));
//			System.out.println((char)fr.read());
			//BufferedReader : Temp(임시저장소) - 효율적으로 파일을 보다 빠르게 가져올 수 있다
			BufferedReader bf = new BufferedReader(fr);  //readLine()으로 해당 값을 확인
			//System.out.println(bf.readLine());	 해당 임시 저장소에서 저장된 내용중 한개의 라인으로 로드하게 됨
			//Buffer는 최초 값을 출력하였을 경우 무조건 다음 라인의 값을 출력하게 됩니다.
			// 조건문 사용시에도 한번 작동이 이루어지게 되빈다.
//			int w = 0;
//			while(w<=2) {
//				String data = bf.readLine();
//				
//				System.out.println(data);
//				w++;
//			}
			
			/*buffer는속도가 빠른 대신 사용 부분에 무조건 변수 또는 배열로 받 은후 사용하는 것을 권장합니다.*/
//			String line = "";
//			while((line=bf.readLine()) != null) {
//				System.out.println(line);
//			}
			//데이터문서의 라인갯수를 확인
			// LineNumberReader : 파일 전체 라인 갯수를 확인하는 클래스 입니다.
			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF-8"));
			LineNumberReader li = new LineNumberReader(fr2);
			int ea = 0;
			while(li.readLine() != null) {
				ea = li.getLineNumber();
			}			
			System.out.println(ea);
//			bf.close();
		} catch (Exception z) {
			System.out.println(z);
		}
	}
}
