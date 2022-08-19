<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사 참여자 저장파일</title>
</head>
<body>
<%@ include file="./dbconnect.jsp" %>

<%
request.setCharacterEncoding("utf-8");
String user = request.getParameter("user").replaceAll(" ", " "); //replaceAll("", "") : 공백제거
String id = request.getParameter("id").replaceAll(" ", " ");
String tel = request.getParameter("tel");
String ch = request.getParameter("rd").intern();


String sql = "select *from poll where pid='"+id+"'";
PreparedStatement ps = null;
try{
ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();	
if(rs.next() == true){
	out.print("<script>alert('이미 설문조사 참여하였습니다.'); history.go(-1)</script>");
}
else{
	
}
}catch(Exception e){
	
}

%>

<ul>
<li><%=user %></li>
<li><%=id %></li>
<li><%=tel %></li>
<li><%=ch %></li>
</ul>

</body>
</html>