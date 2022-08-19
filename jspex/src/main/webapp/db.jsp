<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    <%
    response.setContentType("text/html;charset=utf-8");
	Connection con = null;
    try{
    String d = "com.mysql.jdbc.Driver";	
	String u = "jdbc:mysql://umj7-009.cafe24.com/andreas0805";
	String user = "andreas0805";
	String pw = "jeongminn99!";
	Class.forName(d);
	con = DriverManager.getConnection(u,user,pw);
    	
    }catch(Exception e){
    	e.getMessage();
    }
    %>