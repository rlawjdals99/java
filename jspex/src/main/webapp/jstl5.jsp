<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="kk" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>    
    <%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@ taglib prefix="uf" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 7일차 - tagdir 사용법</title>
</head>
<body>
<kk:set var="username" value="홍길동"></kk:set>
<!-- 태그파일을 로드할 때 사용. 사용방식은 prefix 이름 : 파일명  -->
<uf:test></uf:test>
<br>
<uf:test2>${username}</uf:test2>
<br>
<uf:test3>${username}</uf:test3>
<br>
</body>
</html>