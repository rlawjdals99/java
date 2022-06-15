import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt4_class {
	
	public void view() {
		decorate dc = new decorate();  //awt4.java 자식 class 로드
		TextField input = new TextField();

		Frame f = new Frame();
		Label lb = new Label();
//        TextArea lb = new TextArea();
		f.setBounds(200, 200, 300, 300);
		f.setVisible(true);
		f.setLayout(null);
		Button btn = new Button("계산");
		Button closebtn = new Button("닫기");
		lb.setBackground(Color.gray);
		input.setBounds(50, 50, 100, 25);
		btn.setBounds(180, 50, 80, 25);
		closebtn.setBounds(50, 200, 80, 25);
		lb.setBounds(50, 100, 200, 100);
		f.add(lb);
		f.add(btn);
		f.add(closebtn);
		f.add(input);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					int c = Integer.parseInt(input.getText());			
					dc.btn_push(c);      // 사용자가 입력한 값을 btn_push 메소드로 전달
					lb.setText(dc.calls());      // awt4.java에 있는 getter 메소드 값 받음
				} catch (Exception e2) {
lb.setText("숫자만 입력해");
//              System.out.println("숫자만 입력해");
				}
				
			}
		});

		
		
		closebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}
}
