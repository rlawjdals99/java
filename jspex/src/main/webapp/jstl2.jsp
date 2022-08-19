<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="kk" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("utf-8");
	String nb = request.getParameter("number");

%>

<kk:set var="n" value="<%=nb %>"></kk:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl2.html 연동</title>
</head>
<body>
<!-- 
choose : 다중 처리 조건문 사용
if : 조건문을 처리함
 -->
<!-- 
<kk:choose>
when : choose태그와 함께 사용하는 태그명 : 참일 경우 
otherwise : 거짓일 경우-->
<!-- 
<kk.when test="${n%2 == 0}">
<kk:out value="${n}"></kk:out>
</kk.when>
<kk:when test="${n%2 != 0}">짝수
<kk:out value="${n}"></kk:out>홀수
</kk:when>
<kk:otherwise>숫자가 아님
</kk:otherwise>
</kk:choose>
 -->

<kk:if test="${n == '홍길동'}">
가입 고객입니다.
</kk:if>

</body>
</html>