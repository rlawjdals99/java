<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 - Javascript(정규식 코드)</title>
<script>
function abc() {
	var z = document.getElementById("mid");
	
// 	var code = /java/i;	// i : 문자열 전체(대소문자 관계없이)	
	
	//a-z(소문자 a~z),A-Z,0-9
	/* 숫자만 입력 받아야 할 경우 */
// 	var code = /[a-z]/i;
// 	var code = /[^0-9]/;	//^(캐럿기호) : not
	
	
// 	console.log(code.test(z.value));	//test : true, false


// 	var ck = code.exec(z.value);	//exec : 정규식 코드에 대한 데이터 리스트

	/* 한글만 입력 받아야 하는 경우 */
// 	var code = /[^ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;	//배열 범위
// 	console.log(code.test(z.value));

	/* 입력값 패턴별 확인사항 ( -가 없이 숫자만) */
// 	var code = /^[0-9]\d{9}/;
// 	console.log(code.test(z.value));
	
	/* 특문자 조합(아이디) */
// 	var code = /[a-z|A-Z|0-9\\d_-]/g;	// g : 문자열 전체
// 	var ck = z.value.match(code);	//match : 해당 사용값이 모두 정규식코드 안에 있을경우배열로 생성
// 	console.log(code.value.match(code));
// 	if (z.value.length != ck.length) {
// 		alert("특수문자는 -, _ 기호만 사용가능 합니다.");
// 	}
	
	/* 특문자 2개 포함(패스워드) */
	var code2 = /[ㄱ-ㅎ가-힣ㅏ-ㅣ]/g;
	if (code2.test(z.value) == true) {
		alert("패스워드가 올바르지 않습니다.");
	}
	else{
	var code = /[^a-zA-Z0-9ㄱ-ㅎ가-힣ㅏ-ㅣ]/g;
	var ck = z.value.match(code);
		if (ck != null) {
			if (ck.length < 2) {
		alert("특수문자 2개 이상 입력하세요.");
			
		}
	}
		else{
			alert("특수문자 2개 이상 입력하세요.");
		}
	}
	
	
}

/* 정규식 코드 문법 
match, test, exec, replace, replaceAll, split 
 
 */

</script>
</head>
<body>
<input type="text" id="mid" maxlength="11">
<input type="button" value="확인" onclick="abc()">
</body>
</html>