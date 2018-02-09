package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actions.Action;
import actions.ActionFactory;
import actions.LandingAction;
import actions.LoginAction;

public class ControllerServlet extends HttpServlet {
	private final Map<String,String> pages = new HashMap<String,String>();
	private static String contextName;
	
	public static final String LANDING = "landing",LOGIN="login",CREATEACC="createAccount";
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		ServletContext sc = getServletContext();
		contextName = sc.getServletContextName();
		
		String dbPath =(sc.getRealPath((String)sc.getAttribute("database")));
		
		sc.log("DEBUG:ControllerServlet:INIT COMPLETE");
		
		pages.put(LANDING,"/landing.jsp");
		pages.put(LOGIN,"/login.jsp");
		pages.put(CREATEACC,"/createaccount.html");
	}
	
	private void doAction(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		ServletContext sc = getServletContext();
		Action action = ActionFactory.getAction(req.getRequestURL().toString());
		if(action == null) {
			sc.log("DEBUG:Lab2:Controller:action == null");
			//that page is not supported throw err
		}
		else {
			sc.log("DEBUG:Lab2:Controller:action != null");
		}
		
		String page = action.doAction(req, res);
		if(page == null) {
			sc.log("DEBUG:Lab2:Controller:page == null");
		}
		else {
			sc.log("DEBUG:Lab2:Controller:page = " + page);
		}
		
		
		String fPage = pages.get(page);
		if(fPage == null) {
			sc.log("DEBUG:Lab2:Controller:fPage is null");
		}
		else {
			sc.log("DEBUG:Lab2:Controller:fPage = " + fPage);
		}
		
		req.getRequestDispatcher(res.encodeURL(fPage)).forward(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		// now we can do our action
		doAction(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doAction(req,res);
	}
	
	@Override
	public void destroy() {
		super.destroy();
		
	}
	
	
}
