package swing1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 49, 418, 34);
		contentPane.add(panel);
		
		JRadioButton rd1 = new JRadioButton("신용카드");
		rd1.setName("CARD");
		rd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rd1.setSelected(true);
		rd1.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("계좌이체");
		rd2.setName("BANK");
		rd2.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("무통장입금");
		rd3.setName("NOBANK"); 	//setName은 노출은 되지 않으며, background에서 새당 속성에 값을 적용하는 것을 말합니다.
		rd3.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.add(rd3);
		
		ButtonGroup gp = new ButtonGroup();	//raido사용시 ButtonGroup을 이용하시길 바랍니다.
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		
		JButton btn = new JButton("결제진행");
		btn.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn.setBounds(174, 110, 93, 23);
		contentPane.add(btn);
		
		JPanel mu = new JPanel();
		mu.setVisible(false);
		mu.setFont(new Font("돋움체", Font.PLAIN, 12));
		mu.setBounds(10, 184, 418, 71);
		contentPane.add(mu);
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 96, 21);
		mu.add(textField);
		textField.setColumns(10);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pay = "";
				if(rd1.isSelected()==true) {	//신용카드
					pay = rd1.getName();
					mu.setVisible(false);
					
				}
				else if (rd2.isSelected()==true) {	//계좌이제
				}
				else {	//무통장
				}
			
			}
		});


		
	}
}