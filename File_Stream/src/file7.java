import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/* �����ɾ� ���� : read(), readLine(), next(), nextLine() */
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOException{

		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF-8"));
//			System.out.println((char)fr.read());
			//BufferedReader : Temp(�ӽ������) - ȿ�������� ������ ���� ������ ������ �� �ִ�
			BufferedReader bf = new BufferedReader(fr);  //readLine()���� �ش� ���� Ȯ��
			//System.out.println(bf.readLine());	 �ش� �ӽ� ����ҿ��� ����� ������ �Ѱ��� �������� �ε��ϰ� ��
			//Buffer�� ���� ���� ����Ͽ��� ��� ������ ���� ������ ���� ����ϰ� �˴ϴ�.
			// ���ǹ� ���ÿ��� �ѹ� �۵��� �̷������ �Ǻ��.
//			int w = 0;
//			while(w<=2) {
//				String data = bf.readLine();
//				
//				System.out.println(data);
//				w++;
//			}
			
			/*buffer�¼ӵ��� ���� ��� ��� �κп� ������ ���� �Ǵ� �迭�� �� ���� ����ϴ� ���� �����մϴ�.*/
//			String line = "";
//			while((line=bf.readLine()) != null) {
//				System.out.println(line);
//			}
			//�����͹����� ���ΰ����� Ȯ��
			// LineNumberReader : ���� ��ü ���� ������ Ȯ���ϴ� Ŭ���� �Դϴ�.
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
