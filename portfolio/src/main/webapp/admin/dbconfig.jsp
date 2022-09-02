<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Connection con = null;
try{
	String db = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://umj7-009.cafe24.com/andreas0805";
	String user = "andreas0805";
	String pw = "jeongminn99!";
	
	Class.forName(db);
	con = DriverManager.getConnection(url,user,pw);
}catch(Exception e){
}
%>