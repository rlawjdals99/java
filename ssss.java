import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ssss {

	public static void main(String[] args) {

		/* ����. ArrayList�� �̿��Ͽ� ������� ��� �ǵ��� �մϴ�.
		   ���õ����� => {"red", "green", "blue", "pink", "orange", "black", "white", "hotpink", "gray"}
		   �ش� ������ ���� ���� 6�� �̸��� ������ ��� ���� �� ��� �迭 ������ �����Ͻÿ�. 
		   [orange, hotpink]	*/

		String colors[] = {"red", "green", "blue", "pink", "orange", "black", "white", "hotpink", "gray"};
		ArrayList<String> arc = new ArrayList<>();
		int ea = colors.length;
		int ee = colors[0].length();
		int a;
		for(a=0;a<ea;a++) {
			if (colors[a].length()>5) {
				arc.add(colors[a]);
			}
		}
		System.out.println(arc);
	}
}