<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 - SQL연동</title>
</head>
<body>
<%@ include file="dbconnect.jsp" %>	
<%
	String sql = "select * from poll order by pidx desc";
	ArrayList<Map<String,Object>> al = null;
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		al = new ArrayList();
		while(rs.next()){
			Map<String,Object> mp = new HashMap<>();
			mp.put("pidx", rs.getString("pidx"));	
			mp.put("pnm", rs.getString("pnm"));	
			mp.put("pid", rs.getString("pid"));	
			mp.put("ptel", rs.getString("ptel"));	
			mp.put("ptext", rs.getString("ptext"));	
			mp.put("pindate", rs.getString("pindate").substring(0,19));	
			al.add(mp);
			
			out.print(rs.getString("pnm"));
		}
	}catch(Exception e){
		out.print("DB 연결 실패 및 테이블 오류");
	}finally{
		if(con != null){
			con.close();
		}
	}
%>
<%
	int w = 0;
	while(w < al.size()){
		//jsp태그 사용 이유는 설문조사 0~4 내용이 확인이 안됨
		//switch,jsp에서 사용자가 어떤 내용에 대한 설문조사를 응하였는지
		//확인하는 사항
	
%>	
<jsp:include page="switch.jsp" >
<jsp:param value='<%= al.get(w).get("ptext")%>' name="cate"/>
</jsp:include>
<%
	//setAttribute로 생성된 가변수명을 getAttribute로 받아서 처리 
	//또는 ${msg} 기호로 바로 출력 가능
	String msg = (String)request.getAttribute("msg");
%>
	<ul>
	<li>고유번호 : <%=al.get(w).get("pidx")%></li>			
	<li>고객명 : <%=al.get(w).get("pnm")%></li>			
	<li>고객아이디 : <%=al.get(w).get("pid")%></li>			
	<li>연락처 : <%=al.get(w).get("ptel")%></li>			
	<li>설문조사내용 : <%=msg%></li>			
	<li>참여일자 : <%=al.get(w).get("pindate")%></li>			
	</ul>			
<%
w++;
	}
%>
</body>
</html>