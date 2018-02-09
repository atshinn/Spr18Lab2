package controller.actions;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DatabaseValue;
import model.User;

public class CreateAccAction extends AbstractAction {
	private DatabaseValue creation;
	private String type;
	public CreateAccAction() {
		super();
	}

	public CreateAccAction(HttpServletRequest req, HttpServletResponse res) {
		super(req, res);		
	}

	@Override
	protected void parseReq() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void formRes() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processPayload() {
		// TODO Auto-generated method stub

	}

	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		return null;
	}

}
