function api(){
	this.map = function(){
		var way = "신촌역 2번 출구";
		return way;
	}
	this.login = function(mid){
		var msg;
		if(mid=="hong"){
			msg = "해당 고객 확인";			
		}		
		else{
			msg = "error";
		}		
		return msg;
	
	
	
	}
}
var kakao = new api();