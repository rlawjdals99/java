package jspex;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class qwe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public qwe() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	
	String usernm = request.getParameter("usernm");
	String usertel = request.getParameter("usertel");
	String useremail = request.getParameter("useremail");
	String admin = request.getParameter("admin");
	
	String host = "stmp.naver.com";
	String user = admin;
	String pw = "jeongminn99";
	String num = "13245-678912";
	
	Properties pr = new Properties();
	pr.put("mail.smtp.host",host);
	pr.put("mail.smtp.port",587);
	pr.put("mail.smtp.auth",true);
	pr.put("mail.smtp.debug",true);
	pr.put("mail.smtp.socketFactory.port",587);
	pr.put("mail.smtp.protocols","TLSv1.2");

	Session se = Session.getDefaultInstance(pr,new Authenticator() {
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(user,pw);
	}
	});
	
	try {
		MimeMessage msg = new MimeMessage(se);
		msg.setFrom(new InternetAddress(admin,"관리자"));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(useremail));
		msg.setSubject("팬션예약");
		String go = usernm+usertel+useremail+num;
		msg.setContent(go,"text/html;charset=utf-8");
		msg.setText(go);
		Transport.send(msg);
		System.out.println("전송완료");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	}

}
