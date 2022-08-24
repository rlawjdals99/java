package jspex;

import java.io.*;
import java.io.PrintWriter;
import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.*;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class mailto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public mailto() {
    /* 1. javax.mail - 라이브러리 추가
       - mail-1.4.7.jar : 메일 클라이언트 (Outlook동일)
       - mailapi.jar : 메일 서버 (송,수신)
       - dsn.jak " 메일 송, 수신된 내용을 데이터 소스로 변환하여 저장 시킬 수 있도록
       - gimap.jar : 이미지 첨부파일에 대한 파일 저장 및 출력
       - imap.jar : 첨부파일 및 메일내용 (서버와 동기)
       - pop3.jar : 첨부파일 및 메일내용 (서버와 비동기)
       - smtp.jar : 메일 발송 담당 
       
       2. 각 송수신에 대한 서버 메일을 세팅
       - IMAP/SMTP 수신을 체크해야 합니다.
       - SSL 기능 : https : 통신관련 보안정책
       - TLS (SSL 기능이 없을 경우) : 통신관련 보안정책
       - SMTP 서버주소, SMTP 포트번호
       
       3. 코드 장성시 필요사항
       - 송신메일 주소
       - 수신메일 주소
       - 수신제목
       - 수신내용
       ※ SMTP 접속 아이디 및 패스워드 (단, 자체서버일 경우 사용안함)     */
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pwr = response.getWriter();
		
		
		String postmail = request.getParameter("postmail");
		String postsubject = request.getParameter("postsubject");
		String postmsg = request.getParameter("postmsg");
		String admin = request.getParameter("admin");
		
		String host = "smtp.naver.com";
		String user = admin;
		String pw = "jeongminn99";
		
		Properties pr = new Properties();
		pr.put("mail.smtp.host",host);
		pr.put("mail.smtp.port",587);
		pr.put("mail.smtp.auth",true);	//메일 전송에 따른 연결 인증절차
		pr.put("mail.smtp.debug",true);	//메일 회신 정보 결과
		pr.put("mail.smtp.socketFactory.port",587);	//
		pr.put("mail.smtp.protocols","TLSv1.2");	//TLS 규격버전
	
		//비밀번호 생성 → 회원가입(비밀번호)
		Session se = Session.getDefaultInstance(pr,new Authenticator() {
		 
			@Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(user, pw);
			}
		});
		try {
			MimeMessage msg = new MimeMessage(se);
			msg.setFrom(new InternetAddress(admin,"관리자"));
			msg.addRecipient(Message.RecipientType.TO,new InternetAddress(postmail));
			msg.setSubject(postsubject);
			String img = "<img src= 'https://helpx.adobe.com/content/dam/help/en/photoshop/using/quick-actions/remove-background-before-qa1.png'>";
			msg.setContent(img,"text/html;charset=utf-8");	//setContent : text/html을 이용하며 태그를 적용하여 메일 발송을 함
			msg.setText(img);	//setText : 수신내용
			Transport.send(msg);	//메일 발송
			
			System.out.println("전송완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}