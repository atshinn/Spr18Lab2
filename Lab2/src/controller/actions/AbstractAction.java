package controller.actions;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Exceptions.InvalidInputErr;
import Exceptions.InvalidRequestErr;

public abstract class AbstractAction {
	
	protected HttpSession session;
	protected HttpServletRequest req;
	protected HttpServletResponse res;
	protected Enumeration pNames;
	protected Map<String,String[]> pMap = new ConcurrentHashMap<String,String[]>();
	protected Map<String,Cookie> cMap = new ConcurrentHashMap<String,Cookie>();
	protected String reqUrl,reqMethod,contextPath,resUrl;
	protected ServletContext sc;
	
	protected AbstractAction(HttpServletRequest req,HttpServletResponse res) {
		this.req = req;
		this.res = res;
		this.session = req.getSession(false);
		this.sc = this.session.getServletContext();
		this.pNames = req.getParameterNames();		
		this.pMap = req.getParameterMap();		
		Cookie[] cookies = req.getCookies();
		for(Cookie c : cookies) {
			this.cMap.put(c.getName(),c);
		}		
	}
	
	abstract public String doAction(); 
	
	abstract protected void parseReq() throws InvalidRequestErr;
	
	abstract protected void formRes();
	
	abstract protected void processPayload() throws InvalidInputErr;
	
	public String getResUrl() {
		return this.resUrl;
	}
	
	

}
