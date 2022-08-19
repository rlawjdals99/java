<%@page import="java.sql.*"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<%

	Connection con = null;
	try{
		String driver = "com.mysql.jdbc.Driver";	
		String url = "jdbc:mysql://umj7-009.cafe24.com/andreas0805";
		String user = "andreas0805";
		String pw = "jeongminn99!";
		Class.forName(driver);
		
		con = DriverManager.getConnection(url,user,pw);
		
	}catch(Exception e){
		e.getMessage();	
	}



%>