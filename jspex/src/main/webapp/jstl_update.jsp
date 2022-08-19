<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="kk" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>    
    <%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<sql:setDataSource var="dbs" url="jdbc:mysql://umj7-009.cafe24.com/andreas0805" driver="com.mysql.jdbc.Driver" user="andreas0805" password="jeongminn99!"></sql:setDataSource>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 7일차 - SQL 데이터 수정</title>
</head>
<body>
<sql:update var="result" dataSource="${dbs}">
update poll set ptel=? where pidx=?
<sql:param value="010-1548-0148"/>
<sql:param value="5"/>
</sql:update>
<kk:if test="${result==1 }">수정완료</kk:if>
<kk:if test="${result==0 }">수정실패</kk:if>
</body>
</html>