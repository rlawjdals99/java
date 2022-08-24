<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form action="./mailto2.jsp" name="f" id="f" enctype="application/x-www-form-urlencoded">
<div>
<ul>
<li>
<input type="hidden" name="admin" value="andreas0805@naver.com"><br>
메일주소(받는분) : <input type="text" name="postmail"><br>
메일제목 : <input type="text" name="postsubject"><br>
메일내용 : 
<textarea rows="10" cols="60" name="postmsg"></textarea><br>
<input type="button" value="메일전송" onclick="ok2()">
</li>
</ul>
</div>
</form>

</body>
<script>
function ok2() {
	f.submit();
}
</script>
</html>