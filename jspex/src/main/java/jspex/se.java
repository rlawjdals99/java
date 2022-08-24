package jspex;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class se extends Authenticator{

	protected PasswordAuthentication getPasswordAuthentication() {
		String eid = "andreas0805@naver.com";
		String epw = "jeongminn99";
		return new PasswordAuthentication(eid,epw);
	}
}
