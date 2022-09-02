<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");
 %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 등록 페이지</title>
    <link rel="stylesheet" type="text/css" href="./css/basic.css">
    <link rel="stylesheet" type="text/css" href="./css/login.css?v=1">
    <link rel="stylesheet" type="text/css" href="./css/main.css">
    <link rel="icon" href="./img/logo.png" sizes="128x128">
    <link rel="icon" href="./img/logo.png" sizes="64x64">
    <link rel="icon" href="./img/logo.png" sizes="32x32">
    <link rel="icon" href="./img/logo.png" sizes="16x16">
    <script src="./js/jquery.js"></script>
    
</head>
<body>
<header class="headercss"></header>
<nav class="navcss"></nav>
<main class="maincss">
<section <%@ include file = "./admin_header.html" %>></section>
<section <%@ include file = "./admin_menu.html" %>></section>
<section <%@ include file = "./admin_list.html" %>></section>
<section <%@ include file = "./admin_footer.html" %>></section>
</main>
<footer class="main_copyright"></footer>
</body>
</html>