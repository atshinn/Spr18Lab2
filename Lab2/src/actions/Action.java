package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	final static String ERROR = "err";
	final static String ROLE = "role";
	
	final static String GUEST = "Guest";
	final static String SUBSCRIBER = "Subscriber";
	final static String REPORTER = "Reporter";
	
	public String doAction(HttpServletRequest req,HttpServletResponse res);
}
