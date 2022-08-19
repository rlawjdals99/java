$(function(){
	$("#add_id").click(function (){
		if($("#user_id").val() == ""){
			alert("아이디를 입력하세요.");
		}
		else if($("#user_pw").val() == ""){
			alert("패스워드를 입력하세요.");
		}	
		else if($("#check_pw").val() == ""){
			alert("동일한 패스워드를 입력하세요.");
		}
		else if($("#user_nm").val() == ""){
			alert("고객명을 입력하세요.");
		}
		else if($("#user_email").val() == ""){
			alert("이메일을 입력하세요.");
		}				
		else if($("#user_tel").val() == ""){
			alert("연락처를 입력하세요.");
		}
		else if($("#user_team").val() == ""){
			alert("담당 부서를 선택하세요.");
		}
		else if($("#user_position").val() == ""){
			alert("담당자 직책을 선택하세요.");
		}
		else{
			if($("#ck").val() != "ok"){
			alert("아이디 중복체크를 해주세요.");
			}
		else if($("#user_pw").val() != $("#check_pw").val() ){
			alert("동일한 패스워드를 입력하세요.");
		}
		else if($("#user_email").val() != ""){
			var eck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,8}$/i;
			if(eck.test($("#user_email").val()) == false){
				alert("정상적인 이메일 주소를 입력하세요.");
			}
		}
		else{
			if(isNan($("#user_tel1").val()) == true){
				alert("연락처가 올바르지 않습니다.");
			}
			else if(isNan($("#user_tel2").val()) == true){
				alert("연락처가 올바르지 않습니다.");
			}
			else if(isNan($("#user_tel3").val()) == true){
				alert("연락처가 올바르지 않습니다.");
			}
			else if($("#user_tel1").val().length < 2){
					alert("정상적인 연락처를 입력하세요.");
				}			
			else if($("#user_tel2").val().length < 3){
					alert("정상적인 연락처를 입력하세요.");
				}
			else if($("#user_tel3").val().length < 3){
					alert("정상적인 연락처를 입력하세요.");
				}		
				else{
				f.method = "POST";
				f.action = "joinok.do";
				f.enctype = "application/x-www-form-urlencoded";
				f.submit();
			}					
		}
	}
	});
});