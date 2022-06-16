import java.awt.*;
import java.awt.event.*;

public abstract class awt6_abstract {
	public abstract String kkk(); // getter (return)
	public abstract void jjj(String id);// setter		
	public abstract void mmm(); // Database
	
	Frame fr = new Frame();
	Button bt = null;
	Button close = null;
	TextField mid = null;
	Label msg = new Label();
	Button btcheck = null;
	TextField agree = null;
	public void mama() {
		
		this.fr.setBounds(200, 200, 350, 180);
        this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.bt = new Button("인증번호발송");
		this.btcheck = new Button("인증확인");
		this.close = new Button("X");
		this.agree = new TextField();
		this.msg.setBackground(Color.lightGray);
		this.bt.setBounds(40,40,100,25); 
		this.btcheck.setBounds(190,100,100,25);
		this.close.setBounds(300,40,30,25);
		this.agree.setBounds(40, 100, 140, 25);
		this.msg.setBounds(40,140,250,25);
		
		this.fr.add(agree);
		this.fr.add(msg);
		this.fr.add(bt);
		this.fr.add(btcheck);
		this.fr.add(close);
        this.click();
	}

    public void click() {
    	
    	this.bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int r=1;r<5;r++) {
					double a = Math.random();    
					int b = (int) (Math.random()*9)+1;
					System.out.print(b + " ");
				}
				
				
				
				
			}
		});
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});  //
	}		    	
    }
    	
    
	
	
	
	
	
	
	

