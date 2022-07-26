let data;
function wck(){
	if(window.XMLHttpRequest){
		return new XMLHttpRequest();
	}
}
function members(){
	if(data.readyState == XMLHttpRequest.DONE && data.status == 200){
		member_list(data.response);
	}
	else if(data.status == 404){
		alert("해당 데이터 통신이 되지 않습니다.");
		error();
	}
}
data = wck();
data.onreadystatechange = members;
data.open("GET","./index3.json",true);
data.send();

/*function member_list(jdata){
	var html,tr,td;
	html = document.getElementById("tbody");
	
	var j = JSON.parse(jdata);
//	console.log(j);
	var k;
	for(k in j["members"]){
//		console.log(j["members"][k]);
	tr = document.createElement("tr");
	var kk;
	for(kk in j["members"][k]){
		console.log(kk);
	td = document.createElement("td");
		
		var code;
		switch(kk){
		case "id":
		 code = "id";
		break;	
		
		case "name":		
		 code = "name";
		break;
		
		case "email":		
		 code = "email";
		break;		
		
		case "area":		
		 code = "phone";
		break;	
		
		case "phone":		
		 code = "area";
		break;	
		}
		td.append(j["members"][k][code]);
		tr.append(td);		
	}
		html.append(tr);
			}
	}	*/

		function member_list(jdata){
			var j = JSON.parse(jdata);
			var total = j["members"].length;
			var f;
			var tbody = document.getElementById("tbody");
			var tr,td,text;
			
			
			
			for(f in j.members){
				tr = document.createElement("tr");
				td = document.createElement("td");	//no
				td = innerText = total;	//no
				tr.append(td);	//no
				var ff;
				for(ff in j.members[f]){
				//getAttribute : 속성값을 가져올 때 사용(style, onclick, class)
				if(ff == "id"){
				tr.setAttribute("onclick", "java_get('"+j.members[f][ff]+"')");
				}
				td = document.createElement("td");

					if(ff == "area"){
						ff = "phone";
					}
					else if(ff == "phone"){
						ff = "area";
					}
					text = document.createTextNode(j.members[f][ff]);
					td.append(text);	//no
					tr.append(td);
//					console.log(j.members[f][ff]);
				}				
				tbody.append(tr);
				total --;	//no
			}			
		}

function error(){
	alert("해당 파일을 로드할 수 없습니다.");
	return;	
}

function java_get(mid){
	location.href = './first.do?mid=' + mid;
}