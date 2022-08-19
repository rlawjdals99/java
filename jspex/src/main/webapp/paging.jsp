<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="kk" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>    
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<sql:setDataSource var="dbs" url="jdbc:mysql://umj7-009.cafe24.com/andreas0805" driver="com.mysql.jdbc.Driver" user="andreas0805" password="jeongminn99!"></sql:setDataSource>
<%
/* 리스트 출력 페이지[공지사항, 게시판, 뉴스, Q&A, 리뷰, 자료실 등등] 
   1. 리스트 데이터를 출력
   2. 한 페이지당 출력할 갯수 변수를 셋팅
   3. SQL문법에서 select 파트에 limit을 이용
   4. 최초 limit에는 0, 한 페이지당 출력할 갯수를 적용하여 리스트 출력 화면을 확인
   5. Count를 하는 sql문법을 생성(전체 데이터 갯수)
   6. 전체 데이터 갯수와 한 페이지당 갯수를 나누어서 올림으로 총 합계를 구함 / Ceil(소수점을 무조건 올림) ex) 4.3 → 5page
   7. 페이지를 반복문으로 해당 갯수만큼 출력
   8. 페이지에 JS로 함수를 이용하여 파라미터 값으로 페이지를 변경
   9. 파라미터 1 또는 파라미터가 없을 경우는 limit에 대한 시작값을 0으로 처리 (조건문)  
   ex) select * from poll order pidx desc limit 시작값, 한페이지당 보여주는 수
   10. 파라미터가 1 외에 숫자일 경우 limit 시작값이 변경되도록 설정합니다.
   공식 = (파라미터값-1) * 한페이지당 보여주는 수
   11. 게시물 순차 번호를 출력
   
   (전체게시물 - 시작값) - 반복문 값
   */

%>
<%
String startpage = null;
String pageno = "3"; //한 페이지당 5개
String getpage = (String)request.getParameter("p");
if(getpage == null || getpage.equals("") || getpage.equals("1")){
	startpage = "0";
}
else{
	int s = Integer.parseInt(pageno);	//한 페이지에서 보여주는 데이터 갯수
	int g = Integer.parseInt(getpage);	//
	int t = (g-1)*s;
	startpage = String.valueOf(t);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 7일차 - 전체 리스트 및 paging 사용법</title>
</head>
<body>
<!-- 전체갯수 -->
<sql:query var="num" dataSource="${dbs}">	
select * from poll order by pidx desc;
</sql:query>
<kk:out value="${num.rowCount}"></kk:out>
<!-- 한 페이지당 출력 파트 -->
<sql:query var="datas" dataSource="${dbs}">
select * from poll order by pidx desc limit <%=startpage%>,<%=pageno%>;
</sql:query>

<table border="1">
<tr>
<td>NO</td>
<td>아이디</td>
<td>고객명</td>
<td>전화번호</td>
<td>입력일자</td>
</tr>
<kk:set var="spage" value="<%=startpage %>"></kk:set>
<kk:forEach var="data" items="${datas.rows}" varStatus="ct">
<!-- varStatus : 순번을 체크(count(1부터 시작), index(0부터시작) ) -->
<tr>
<td><kk:out value="${(num.rowCount-spage)-ct.index}"></kk:out></td>
<td><kk:out value="${data['pid']}"></kk:out></td>
<td><kk:out value="${data['pnm']}"></kk:out></td>
<td><kk:out value="${data['ptel']}"></kk:out></td>
<kk:set var="indate" value="${data['pindate']}"></kk:set>
<td><kk:out value="${fn:substring(indate,0,19)}"></kk:out></td>
</tr>
</kk:forEach>
</table>

<br>

<table border="1">
<tr>
<kk:set var="pageno" value="<%=pageno%>"></kk:set>
<kk:set var="pagenum" value="${num.rowCount/pageno+((1-num.rowCount/pageno%1)%1)}"></kk:set>
<kk:forEach var="ns" begin="1" end="${pagenum}">
<td onclick="pagego(${ns})">${ns}</td>
</kk:forEach>
<td></td>
</tr>

</table>
<script>
function pagego(p) {
	location.href='./paging.jsp?p='+p;
}
</script>
</body>
</html>