import java.awt.*;
import java.awt.event.*;

// AWT 환경설정
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
		this.bt = new Button("중복확인");
		this.close = new Button("닫기");
		this.mid = new TextField();
        this.msg.setBackground(Color.lightGray);		
		this.msg.setBounds(25,200,250,25); // 메세지
		this.mid.setBounds(25,150,160,30); // 아이디
		this.bt.setBounds(195,150,80,25);  // 중복체크
		this.close.setBounds(200,400,80,25);  // 종료
		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(bt);
		this.fr.add(close);
		this.click(); //awt 디자인이 완료 후 해당 핸들링 메소드로 이동
	}
            public void click() {
                // 중복확인 					
            	this.bt.addActionListener(new ActionListener() {
				

            		@Override
            		// setText(출력), getText(입력값 가져오기)
            		public void actionPerformed(ActionEvent e) {
                    String userid = awt5_abstract.this.mid.getText();             
            			
                    if (userid.equals("")) {
						msg.setText("아이디를 입력하세요.");
					}
                    
                    else {
                            idcheck(userid);
                            String result = singok();
                    if (result == null) {
						msg.setText("사용가능한 아이디 입니다.");
					}
                    else {
						msg.setText("이미 사용중 입니다.");
					}
                    }
                    
					}
				});  //
            	
            
				// 닫기버튼
				this.close.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});  //
			}		
		
		
		

}