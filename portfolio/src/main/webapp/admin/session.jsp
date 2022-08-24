<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

String mname = null;
String mid = null;

mname = (String)session.getAttribute("mname");
mid = (String)session.getAttribute("mid");

if(mname.equals(null)){
	out.print("<script>alert('로그인 하셔야만 접근이 됩니다.'); location.href= </script>");
}
	
%>