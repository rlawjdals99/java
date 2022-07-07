import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.입력  2.검색  3.가장 긴 단어찾기");

		note n = new note();
//		n.choice(sc);
		n.input(sc);
		n.search(sc);
		n.longword(sc);
	}

}

class note {
	public String fruit[][] = { { "apple", "banana", "kiwi" }, { "사과", "바나나", "키위" } };
	int ea = this.fruit[0].length;
	String pp = "";

//	public void choice(Scanner p) {
//	pp = p.next();
//	if (pp.equals("1")) {
//		System.out.println("검색할 단어를 입력해 주세요.");
//	}
//	else if(pp.equals("2")){
//		System.out.println("검색할 단어를 입력해 주세요.2");
//	}		
//}
	
	public void input(Scanner p) {
		this.pp = p.next();
		if (this.pp.equals("1")) {
			System.out.println("검색할 단어를 입력해 주세요.");
			String qw = p.next();
			for (int i = 0; i < this.ea; i++) {
				if (qw.equals(this.fruit[0][i])) {
					System.out.println(this.fruit[1][i]);
				}
			}
		}
	}
	public void search(Scanner p) {
		this.pp = p.next();
		if (this.pp.equals("2")) {
			System.out.println("검색할 단어를 입력해 주세요.2");
			int ee = this.fruit.length;
			String l = p.next();
			for(int ii=0;ii<this.ea;ii++) {
				if (l.equals(this.fruit[0][ii])) {
					System.out.println(this.fruit[1][ii]);
				}
				else if (l.equals(this.fruit[1][ii])) {
					System.out.println(this.fruit[0][ii]);
				}
			}
	}
	}
	public void longword(Scanner p) {
		this.pp = p.next();
		if (this.pp.equals("3")) {
			int j = 0;
			for(int d=0;d<this.fruit.length;d++) {
				if (j < this.fruit[0][d].length()) {
					j = d;
				}
			}
			System.out.println(this.fruit[0][j]);
		}
	}
}