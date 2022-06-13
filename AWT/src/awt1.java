import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {

	public awt1() {

	}

	public static void main(String[] args) {
		// Frame > Bound > Object

		Frame fr = new Frame(); // 창

		fr.setTitle("AWT 기초 화면");
		fr.setVisible(true);
		fr.setLayout(null); // null 사용 : 패널을 사용 안하기 위해서
		fr.setBounds(150, 150, 500, 500); // (화면위치 X축, 화면위치 Y축, 가로, 세로 )

		Button btn = new Button("출력");
		Button closebtn = new Button("닫기");
		Label msg = new Label("");
//		msg.setBackground(Color.red); //setBackgound(Color,red) 
		btn.setBounds(40, 40, 100, 30);
		closebtn.setBounds(160, 40, 100, 30);
		msg.setBounds(40, 100, 300, 30);

		// Object를 Frame에 적용하게 됩니다.
		fr.add(msg);
		fr.add(btn);
		fr.add(closebtn);
		
//		addActionListener(버튼) : 이벤트 메소드 단, this사용 절대 안됨
		closebtn.addActionListener(new ActionListener() { // new ActionListener() : override 메소드 자동생성
		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btn.addActionListener(new ActionListener() {
        String a = "홍길동"; // addActionListener : 이벤트 메소드 필드에 String을 생성
			@Override
			public void actionPerformed(ActionEvent e) {
              msg.setText(this.a); // this를 이용하여 핸들링 가능함
			}
		});

	}
}
