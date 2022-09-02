<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ include file="./dbconfig.jsp" %>
         <%
        request.setCharacterEncoding("utf-8");
		String num = request.getParameter("rnumber");
				
				
		String sql = "select * from reser_user where rnumber=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, num);
		ResultSet rs = ps.executeQuery();
	String remail = null;
	String rnumber = null;
	String rdate = null;
	String ruser = null;
	String rtel = null;
	String rpeople = null;
	String rarrival = null;
	String rname = null;
	
       while(rs.next()){
    	   remail = rs.getString("remail");
    	   rnumber = rs.getString("rnumber");
    	   rdate = rs.getString("rdate").substring(0,10);
    	   ruser = rs.getString("ruser");
    	   rtel = rs.getString("rtel");
    	   rpeople = rs.getString("rpeople");
    	   rarrival = rs.getString("rarrival").substring(11,16);
    	   rname = rs.getString("rname");
       }
       %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>팬션 예약시스템</title>
    <link rel="stylesheet" href="./css/default.css?v=3">
    <script src="./js/jquery.js"></script>
    <script src="./js/jquery-ui.js"></script>
    <script src="./js/index.js"></script>
    <link rel="stylesheet" href="./js/jquery-ui.css?v=1">
</head>
<body>
    <header class="header_css">
      <div class="title">
        [더조은 펜션 예약시스템]
      </div>
    </header>
    <nav class="nav_css">
        <ul class="ul_css">
            <li>예약현황</li>
            <li>예약하기</li>
            <li class="li_btn">예약확인</li>
        </ul>
    </nav>
    <section class="section_css">
       <div class="reserve_info">
        <p>예약 정보 확인</p>
        <ul>
            <li>예약번호</li>
            <li><%=rnumber %></li>
        </ul>
        <ul>
            <li>예약일자</li>
            <li><%=rdate %></li>
        </ul>
        <ul>
            <li>객실명</li>
            <li><%=rname %></li>
        </ul>
        <ul>
            <li>예약자</li>
            <li><%=ruser %></li>
        </ul>
        <ul>
            <li>연락처</li>
            <li><%=rtel %></li>
        </ul>
        <ul>
            <li>이메일</li>
            <li><%=remail %></li>
        </ul>
        <ul>
            <li>인원수</li>
            <li><%=rpeople %> 명</li>
        </ul>
        <ul>
            <li>도착예정시간</li>
            <li><%=rarrival%></li>
        </ul>
       </div>
       <div class="reserve_btn">
        <input type="button" value="예약수정" class="btn1" name="change" id="change" onclick="ch()">
       </div>
    </section>
    <footer class="footer_css">
        <div>Copyright ⓒ 사이트 주소 2022 All Rights reserved.</div>
    </footer>
</body>
<script>
function ch() {
	location.href = "http://192.168.100.209:8080/reser_system/modify?rnumber="+<%=num%>;
}

</script>
</html>