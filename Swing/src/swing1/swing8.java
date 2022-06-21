package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;

//Progress�� ����

public class swing8 extends JFrame {
     public JProgressBar progress = null;
	private JPanel contentPane;
	public JLabel msg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
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
	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.progress = new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setBounds(80, 54, 291, 31);
		contentPane.add(this.progress);
		
		msg = new JLabel("");
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBounds(80, 183, 291, 36);
		contentPane.add(msg);
		
		//swing ���α׷��� �۵� �� �ش� �޼ҵ�� 1�� �� ���� �ǵ��� ������
		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				pstart();
			}
		};
		t.schedule(task, 100);
	
	}

	public void pstart() {
		int w = 0;
		try {
			while(w<=100) {
				this.progress.setValue(w);	//�ش� �⺻ ���� ���մϴ�.
				Thread.sleep(30);
				w++;
			}
		} catch (Exception k) {
			System.out.println("�����߻�");
		}
        if (this.progress.getValue()==100) {
			
		this.msg.setText("�ٿ�ε尡 ��� �Ϸ� �Ǿ����ϴ�.");
		}  		
		
		
	}
}
