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
		decorate dc = new decorate();  //awt4.java �ڽ� class �ε�
		TextField input = new TextField();

		Frame f = new Frame();
		Label lb = new Label();
//        TextArea lb = new TextArea();
		f.setBounds(200, 200, 300, 300);
		f.setVisible(true);
		f.setLayout(null);
		Button btn = new Button("���");
		Button closebtn = new Button("�ݱ�");
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
					dc.btn_push(c);      // ����ڰ� �Է��� ���� btn_push �޼ҵ�� ����
					lb.setText(dc.calls());      // awt4.java�� �ִ� getter �޼ҵ� �� ����
				} catch (Exception e2) {
lb.setText("���ڸ� �Է���");
//              System.out.println("���ڸ� �Է���");
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
