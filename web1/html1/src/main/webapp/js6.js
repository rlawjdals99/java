function aa(){
	var a = 1;
	var total = 0;
	var c;
	while(a<10){
		c = 5*a;
		total += c;
		a++;
	}	
	var result = calcA(total);
	console.log(result);
	
	
}


//구구단 5단의 대한 결과 값을 모두 더하여 getter로 전송