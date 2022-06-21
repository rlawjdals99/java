package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class swing10 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
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
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String list[] = {"SKT", "KT", "LGT", "¾Ë¶ãÆù"};
		
		JComboBox cb = new JComboBox(list);
		cb.setFont(new Font("µ¸¿òÃ¼", Font.PLAIN, 12));
		cb.setBounds(32, 21, 154, 23);
		contentPane.add(cb);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("µ¸¿òÃ¼", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(new Color(0, 0, 0)));
		msg.setBounds(32, 54, 396, 23);
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
//				String data = String.valueOf(cb.getSelectedItem());
//				String data = cb.getSelectedItem().toString();
//				String data = e.getItem().toString();
//				msg.setText(data);
				msg.setText((String) e.getItem());
			}
		});
		
	}
}
