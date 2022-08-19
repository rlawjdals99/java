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
<title>JSP 7일차 - SQL 데이터 입력</title>
</head>
<body>
<!-- update : insert, update, delete 세가지만 사용함 -->
<sql:query var="sresult" dataSource="${dbs}">
select count(*) from poll where pid= "lee";
</sql:query>
<kk:out value="${sresult.rowCount}"></kk:out>
<kk:out value="${sresult.rowsByIndex[0][0]}"></kk:out>

<sql:update var="result" dataSource="${dbs}">
insert into poll values ('0','이순신','lee','010-4567-1238','3','2022-08-16 17:15:22');
</sql:update>
<kk:if test="${result==0}">입력 오류</kk:if>
<kk:if test="${result==1}">입력 성공</kk:if>

</body>
</html>