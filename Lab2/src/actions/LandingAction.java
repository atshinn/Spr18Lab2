package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

public class LandingAction implements Action{
	final public static String GUEST_VIEW = "guestlanding";
	final public static String SUBSCRIBER_VIEW = "subscriberlanding";
	final public static String REPORTER_VIEW = "reporterlanding";
			
	
	public String doAction(HttpServletRequest req, HttpServletResponse res) {
		String result = Action.ERROR;
		
		//check for session
		HttpSession session = req.getSession(true);
		
		
		
		
		return result;		
	}
	

}
