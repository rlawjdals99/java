<%@page import="jspex.se"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.PasswordAuthentication"%>
<%@page import="javax.mail.Authenticator"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.Properties"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String admin = request.getParameter("admin");
String postmail = request.getParameter("postmail");
String postsubject = request.getParameter("postsubject");
String postmsg = request.getParameter("postmsg");

/* 난수번호 */
String code = "132456789";

Properties pro = new Properties();
pro.put("mail.smtp.host","smtp.naver.com");
pro.put("mail.smtp.port",587);
pro.put("mail.smtp.auth",true);
pro.put("mail.smtp.debug",true);
pro.put("mail.smtp.socketFactory.port",587);
pro.put("mail.smtp.protocols","TLSv1.2");


	try{
		//se.java와 연계하여 Session을 로드하게 됨
		Authenticator at = new se();
		Session se = Session.getInstance(pro,at);
		
		//본 코드 = servlet와 동일
		MimeMessage msg = new MimeMessage(se);
		msg.setFrom(new InternetAddress(admin,"관리자"));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(postmail));
		msg.setSubject("인증번호 발송");
		msg.setText("인증코드번호 : " + code);	
		Transport.send(msg);
		out.print("<script>alert('인증번호가 발송되었습니다.');</script>");
	}catch(Exception e){
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="f" name="f">
<p>인증번호 확인 : <input type="text" name="user_code" maxlength="9" placeholder="인증코드를 입력해 주세요"></p>
<input type="button" value="인증번호 확인" onclick="code_ck()">
</form>
</body>
<script>
function code_ck() {
	var ori_code = '<%=code%>';
	var user_code = f.user_code.value;
	if (user_code == "" || user_code.length < 9) {
		alert("인증코드를 입력해 주세요")
		f.user_code.focus();
	}
	else{
		if (ori_code != user_code) {
			alert("인증코드가 맞지 않습니다.");
		}
		else {
			alert("인증이 완료 되었습니다.");
		}
	}
}
</script>

</html>