package controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginAction extends AbstractAction {
	private String userName,password,prevUser,prevPass;
	
	public LoginAction() {
		super();
		this.prevUser="";
		this.prevPass ="";
		this.userName = "";
		this.password = "";
	}
	
	public LoginAction(HttpServletRequest req,HttpServletResponse res) {
		super(req,res);
	}

	@Override
	protected void parseReq() {
		
	}

	@Override
	protected void formRes() {
		
		
	}

	@Override
	protected void processPayload() {
		
		if(super.reqMethod.equalsIgnoreCase("POST")) {
		
		}
		else if(super.reqMethod.equalsIgnoreCase("GET")) {
			super.resUrl = "/login.jsp";
		}
		else {
			
		}
	}

	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
