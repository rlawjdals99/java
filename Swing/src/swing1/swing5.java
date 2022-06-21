package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing5() {
		// Frame�� absoluate ���·� layer�� �����մϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("���̵� üũ");
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBounds(140, 85, 130, 23);
		contentPane.add(btnNewButton);
		
		mid = new JTextField();
		mid.setFont(new Font("����ü", Font.PLAIN, 12));
		mid.setForeground(Color.BLACK);
		mid.setBackground(Color.WHITE);
		mid.setBounds(165, 54, 96, 21);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(30, 178, 386, 15);
		contentPane.add(msg);
	
		
		// �ڵ鸵 class�� ������Ʈ �ڵ庸�� ������ ������ �ش� ������Ʈ�� �ε����� ���մϴ�.
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}
				else {
					int lg = mid.getText().length();  //�Է� ���� ���� Ȯ��
					if(lg < 5) {
					msg.setText("���̵�� 5�� �̻� ��� �����մϴ�");
				}
				else {
					msg.setText("���̵� ���� ���Դϴ�.");
				}
				}
			}
		});
	}
}
