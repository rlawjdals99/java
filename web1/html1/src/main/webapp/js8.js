//B파트 js9.js  (연락처 및 이메일)
//['Y','N','Y','Y','Y];
//['01012345678','01055994411','01035370132','01078015457','01031374882']
//['hong@naver.com','park@nate.com','kim_001@gmail.com','jang_go@gmail.com','lee09@naver.com'];

var out = ['Y','N','Y','Y','Y'];
var tel = ['01012345678','01055994411','01035370132','01078015457','01031374882'];
var email = ['hong@naver.com','park@nate.com','kim_001@gmail.com','jang_go@gmail.com','lee09@naver.com'];


function bbb(w){
	

	var a = -1;
		if (out[w] == "Y"){
			return [tel[w],email[w]];
		}	
		else if(out[w] == "N"){
			return a;
		}
}
	