<%@ tag language="java" pageEncoding="UTF-8" body-content="empty" %>
<%@ tag import="java.sql.*" %>
<%
Connection con = null;
try{
	String driver = "com.mysql.jdbc.Driver";	
	String url = "jdbc:mysql://umj7-009.cafe24.com/andreas0805";
	String user = "andreas0805";
	String pw = "jeongminn99!";
	Class.forName(driver);
	con = DriverManager.getConnection(url,user,pw);
// 	out.print("DB접속성공");
	String sql = "select * from poll order by pidx desc";
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		out.print(rs.getString("pid"));
		
	}catch(Exception e){
		
	}
}catch(Exception e){
	e.getMessage();
}

%>