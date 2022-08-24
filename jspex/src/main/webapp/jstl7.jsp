<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="kk" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>    
    <%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 7일차 - JSTL 문자열</title>
</head>
<body>
<kk:set var="msg" value=" 홍길동님 반갑습니다. "></kk:set>
${fn:length(msg)}<br>	<!-- 문자열 갯수 -->
${fn:substring(msg,0,3)}<br>	<!-- 문자열 자르기 -->
${fn:replace(msg,"홍길동","이순신")}<br>	<!-- 문자열 단어 변경 -->
${fn:indexOf(msg,"길동")}<br>		<!-- 문자열 단어 검색 (1 있음, -1 없음) -->
${fn:trim(msg)}<br>	<!-- 앞, 뒤 공백 없애기 -->
<kk:out value="${msg}"></kk:out><br>

</body>
</html>