
public class Score2 {


	       private String name;
	       private String subject;
           private String sign = "false";	
           private String score = null;
           
	       // 사용자 정보 확인 및 데이터 검수 파트
	public void stdata(String name, String subject) {
            this.name = name;
            this.subject = subject;
		
		
		
		String st [][]= {
			      {"박은경", "이경훈", "장운", "조기현", "김진수"},
		          {"80","78","92","67","40"}, //국어
			 	  {"40","80","80","92","100"}, //수학
			 	  {"95","30","55","90","65"}, // 과학
			 	  {"20","80","100","95","30"} //역사
			 					 };
		
//		System.out.println(name + "," + subject);
		int w = 0;
		int index= 0;
        int ea = st[0].length;
        
        while(w<ea){
        	
        	if (this.subject == null || this.name != null) {
				if (this.name.equals(st[0][w])) {
					this.sign = "true";
				}
        	}
        	else if (this.subject != null) {
        		if (this.name.equals(st[0][w])) {
				  index = w;
				}				
        		switch(this.subject) {
				case "국어":
					this.score = st[1][index];
					break;

				case "수학":
					this.score = st[2][index];

					break;
				
				case "과학":
					this.score = st[3][index];

				break;
				
				case "역사":
					this.score = st[4][index];
				break;
				
				default:
					this.score = st[1][index] + "," + st[2][index]+ "," + st[3][index]
							+ "," + st[4][index];
					break;
				
				
				}
			}
        	
        	w++;
        }
	
	
	
	
	
	
	
	
	}
	
  public String gtdata() {     //getter
         if (this.subject==null) {
        	 return this.sign;  
         }	
         else {
			return this.score;
		}			
	
  }
		
		
		
		
		
		
		
	
	
		

}
