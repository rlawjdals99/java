<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="./mailto.jsp" name="f" id="f" method="post" enctype="application/x-www-form-urlencoded">
<div>
<ul>
<li>
<input type="hidden" name="admin" value="andreas0805@naver.com"><br>
메일주소(받는분) : <input type="text" name="postmail"><br>
메일제목 : <input type="text" name="postsubject"><br>
메일내용 : 
<textarea rows="10" cols="60" name="postmsg"></textarea><br>
<input type="button" value="메일전송" onclick="ok()">
</li>
</ul>
</div>
</form>



<script>
function ok() {
	f.submit();
}
</script>