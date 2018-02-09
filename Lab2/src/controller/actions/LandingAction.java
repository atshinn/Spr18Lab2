package controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Exceptions.GeneralErr;
import Exceptions.InvalidRequestErr;
import model.User;

public class LandingAction extends AbstractAction {

	public LandingAction(HttpServletRequest req,HttpServletResponse res) {
		super(req,res);
	}
	
	@Override
	protected void parseReq() throws InvalidRequestErr {
		if(!super.reqMethod.equalsIgnoreCase("get")) {
			throw new InvalidRequestErr(GeneralErr.REQ_METHOD,"Request method not supported by url");
		}
		if(super.session == null) {
			super.session = super.req.getSession(true);
		}
	}

	@Override
	protected void formRes() {
		User user = (User) super.session.getAttribute("user");
		if(user==null)
			user = new User("Guest")

	}

	@Override
	protected void processPayload() {
		

	}

	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		return null;
	}

}
