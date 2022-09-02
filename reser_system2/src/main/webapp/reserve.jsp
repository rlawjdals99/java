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
            <li>예약현황</li>
            <li class="li_btn">예약하기</li>
            <li>예약확인</li>
        </ul>
    </nav>
    <section class="section_css">
       <div class="reserve_info">
        <p>예약 입력정보</p>
        <ul>
            <li>예약일자</li>
            <li><input type="text" id="reser_date" class="input1"></li>
        </ul>
        <ul>
            <li>객실명</li>
            <li>
                <select class="select1">
                    <option>[객실명을 선택하세요]</option>
                    <option>그린하우스 봄날</option>
                    <option>스칼렛하우스 여름</option>
                    <option>국화하우스 가을</option>
                    <option>블루베리하우스 겨울</option>
                </select>
            </li>
        </ul>
        <ul>
            <li>예약자</li>
            <li><input type="text" id="reser_date" class="input2"></li>
        </ul>
        <ul>
            <li>연락처</li>
            <li><input type="number" id="reser_date" class="input2"></li>
        </ul>
        <ul>
            <li>이메일</li>
            <li><input type="email" id="reser_date" class="input2"></li>
        </ul>
        <ul>
            <li>인원수</li>
            <li><input type="text" id="reser_date" class="input3"> 명</li>
        </ul>
        <ul>
            <li>도착예정시간</li>
            <li><input type="time" id="reser_date" class="input2"></li>
        </ul>
       </div>
       <div class="reserve_btn">
        <input type="button" value="예약하기" class="btn1">
       </div>
    </section>
    <footer class="footer_css">
        <div>Copyright ⓒ 사이트 주소 2022 All Rights reserved.</div>
    </footer>
</body>
</html>