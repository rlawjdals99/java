<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            <li onclick="re()">예약현황</li>
            <li onclick="res()">예약하기</li>
            <li onclick="ck()" class="li_btn">예약확인</li>
        </ul>
    </nav>
    <section class="section_css">
    <form name="f" enctype="application/x-www-form-urlencoded">
       <div class="reserv_login">
        <p>예약자 정보 확인</p>
        <ul>
            <li>예약번호</li>
            <li><input type="number" name="rnumber" id = "rnumber" class="login1" placeholder="8자리 코드 입력" maxlength="8"></li>
        </ul>
        <ul>
            <li>예약자 이름</li>
            <li><input type="text" name="rname" id = "rname"  class="login1" placeholder="예약자 고객명"></li>
        </ul>
        <ul>
            <li>예약자 연락처</li>
            <li><input type="number" name="rtel" id = "rtel"  class="login2" placeholder="연락처를 입력하세요"></li>
        </ul>
        <ul>
            <li>예약자 이메일</li>
            <li><input type="email" name="remail" id="remail"  class="login2" placeholder="이메일을 입력하세요"></li>
        </ul>
       </div>
       <div class="reserve_btn">
        <input type="button" value="예약확인" class="btn1" onclick="np()">
       </div>
      </form>
    </section>
    <footer class="footer_css">
        <div>Copyright ⓒ 사이트 주소 2022 All Rights reserved.</div>
    </footer>
</body>

<script type="text/javascript">
function np() {
	var a = document.getElementById("rnumber").value;
	var b = document.getElementById("rname").value;
	var c = document.getElementById("rtel").value;
	var d = document.getElementById("remail").value;
	if(a == ""){
		alert("예약번호를 확인해 주세요");
	}
	else if(b==""){alert("이름을 확인해 주세요");}
	else if(c==""){alert("전화번호를 확인해 주세요");}
	else if(d==""){alert("이메일을 확인해 주세요");}
	else{
		f.method="post";
		f.action = "check_serv";
		f.submit();
	}
}
function re() {
	location.href="index";
}
function res() {
	location.href="http://192.168.100.210:8080/reser_system/reserve.html";
}
function ck() {
	location.href="check";
}
</script>

</html>