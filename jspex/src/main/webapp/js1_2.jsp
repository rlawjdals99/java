<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js1 - session 확인</title>
</head>
<body>
<%

session.setMaxInactiveInterval(1*5);
Object id = session.getAttribute("mid");
String mail = (String)session.getAttribute("mail");
Object lv = session.getAttribute("lv");
out.print(id+"<br>");
out.print(mail+"<br>");
out.print(lv);

if(mail == null){
	out.print("<script>alert('시간경과로 로그아웃됨'); location.href='./js1.jsp'</script>");
}


%>
</body>
</html>