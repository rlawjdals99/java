import java.io.FileWriter;
import java.io.IOException;

// 파일 쓰기 (write)
public class file4 {

	public static void main(String[] args) throws IOException, Exception{
		try {
			String user[] = {"a", "b", "c", "d"};
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt");
//			fw.write("test");
				for(int f=0;f<user.length;f++) {
				fw.write(user[f]);
			}
			fw.close();
		} catch (Exception x) {
			System.out.println("test");
		}
		
		
	}
}
