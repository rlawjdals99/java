<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="kk" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>    
    <%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- sql:setDataSource : DB 연결태그 -->
<sql:setDataSource var="dbs" url="jdbc:mysql://umj7-009.cafe24.com/andreas0805" driver="com.mysql.jdbc.Driver" user="andreas0805" password="jeongminn99!"></sql:setDataSource>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 - SQL 연결</title>
</head>
<body>
<!-- 
dataSource = Connect
query : db쿼리문 (selectm insert, update, delete)
var로 query문을 실행
 -->
<sql:query var="select" dataSource="${dbs}">
select * from poll order by pidx desc;</sql:query>
<!-- columnNames : SQl 필드명을 가져올 때 사용 -->
<kk:forEach var="poll" items="${select.columnNames}">
<span><kk:out value="${poll}"></kk:out></span>
</kk:forEach>

<br><br><br>
<kk:forEach var="data" items="${select.rows}">
<span>
<kk:out value="${data[pnm]}"></kk:out>
</span>
<span>
<kk:out value="${data[pid]}"></kk:out>
</span>
<span>
<input type="button" value="삭제" onclick="abc(${data['pidx']})">
</span>

</kk:forEach>
</body>

<script>
function abc(z) {
	alert(z);
}



</script>





</html>