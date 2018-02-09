package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction implements Action {
	public static final String LOGIN = "login";
	public static final String POST_RESULT = "landing";
	
	@Override
	public String doAction(HttpServletRequest req, HttpServletResponse res) {
		String result = "error";
		if(req.getMethod().equalsIgnoreCase("GET")) {
			result = LOGIN;
		}
		else if(req.getMethod().equalsIgnoreCase("POST")) {
			HttpSession session = req.getSession(true);
			
			session.setAttribute("username",req.getParameterValues("username")[0]);
			result = POST_RESULT;
		}
		else {
			
		}
		return result;
	}

}
