<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="kk" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>    
    <%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <!-- 
    core : 기본엔진
    fn : 문자열 함수
    sql : DB 연결
    fmt(formatting) : 시간, 날짜, 다국어 -->
<%
//응용문제
	request.setCharacterEncoding("utf-8");
String data[] = {"홍길동","이순신","강감찬","유관순"};
%>
<kk:set var="user" value="<%=data %>"></kk:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 - JSTL 반복문</title>
</head>
<!-- foreach : jstl에 반복문 출력 부분 -->
<body>

<kk:forEach var="user" items="${user }">
${user}<br>
</kk:forEach>
<br><br>

<table>
<tr>
<kk:forEach var="a" begin="1" end="5">
<td><kk:out value="${a}"></kk:out></td>
</kk:forEach>
</tr>
</table>
<br><br>
<kk:forEach var="b" begin="2" end="4">
<kk:forEach var="c" begin="1" end="5">
<span>${b} * ${c} = ${b*c}</span><br>
</kk:forEach>
</kk:forEach>



</body>
</html>