import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {

	public awt1() {

	}

	public static void main(String[] args) {
		// Frame > Bound > Object

		Frame fr = new Frame(); // â

		fr.setTitle("AWT ���� ȭ��");
		fr.setVisible(true);
		fr.setLayout(null); // null ��� : �г��� ��� ���ϱ� ���ؼ�
		fr.setBounds(150, 150, 500, 500); // (ȭ����ġ X��, ȭ����ġ Y��, ����, ���� )

		Button btn = new Button("���");
		Button closebtn = new Button("�ݱ�");
		Label msg = new Label("");
//		msg.setBackground(Color.red); //setBackgound(Color,red) 
		btn.setBounds(40, 40, 100, 30);
		closebtn.setBounds(160, 40, 100, 30);
		msg.setBounds(40, 100, 300, 30);

		// Object�� Frame�� �����ϰ� �˴ϴ�.
		fr.add(msg);
		fr.add(btn);
		fr.add(closebtn);
		
//		addActionListener(��ư) : �̺�Ʈ �޼ҵ� ��, this��� ���� �ȵ�
		closebtn.addActionListener(new ActionListener() { // new ActionListener() : override �޼ҵ� �ڵ�����
		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btn.addActionListener(new ActionListener() {
        String a = "ȫ�浿"; // addActionListener : �̺�Ʈ �޼ҵ� �ʵ忡 String�� ����
			@Override
			public void actionPerformed(ActionEvent e) {
              msg.setText(this.a); // this�� �̿��Ͽ� �ڵ鸵 ������
			}
		});

	}
}