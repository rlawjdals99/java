import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Files�� �ش� ��� ������ �迭�� ���� ��Ű�� ���
public class file8 {

	public static void main(String[] args) throws IOException{

		//List�� �ֻ��� �迭 Ŭ����
		//Files : �ű� IO Ŭ���� �Դϴ�. readAllLines (��ü������ �ѹ��� ��� ����)
		//Files + Paths.get("���");
		
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\buffer.txt"));
		System.out.println(data);
		
		
	}
}
