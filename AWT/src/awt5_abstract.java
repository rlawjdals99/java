import java.awt.*;
import java.awt.event.*;

// AWT ȯ�漳��
public abstract class awt5_abstract {

	public abstract String singok(); // getter (return)
	public abstract void idcheck(String id);// setter		
	public abstract void dataload(); // Database

	Frame fr = new Frame();
	Button bt = null;
	Button close = null;
	TextField mid = null;
	Label msg = new Label();

	public void design() {
		this.fr.setBounds(200, 200, 300, 450);
        this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.bt = new Button("�ߺ�Ȯ��");
		this.close = new Button("�ݱ�");
		this.mid = new TextField();
        this.msg.setBackground(Color.lightGray);		
		this.msg.setBounds(25,200,250,25); // �޼���
		this.mid.setBounds(25,150,160,30); // ���̵�
		this.bt.setBounds(195,150,80,25);  // �ߺ�üũ
		this.close.setBounds(200,400,80,25);  // ����
		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(bt);
		this.fr.add(close);
		this.click(); //awt �������� �Ϸ� �� �ش� �ڵ鸵 �޼ҵ�� �̵�
	}
            public void click() {
                // �ߺ�Ȯ�� 					
            	this.bt.addActionListener(new ActionListener() {
				

            		@Override
            		// setText(���), getText(�Է°� ��������)
            		public void actionPerformed(ActionEvent e) {
                    String userid = awt5_abstract.this.mid.getText();             
            			
                    if (userid.equals("")) {
						msg.setText("���̵� �Է��ϼ���.");
					}
                    
                    else {
                            idcheck(userid);
                            String result = singok();
                    if (result == null) {
						msg.setText("��밡���� ���̵� �Դϴ�.");
					}
                    else {
						msg.setText("�̹� ����� �Դϴ�.");
					}
                    }
                    
					}
				});  //
            	
            
				// �ݱ��ư
				this.close.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});  //
			}		
		
		
		

}