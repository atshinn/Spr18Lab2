package controller.actions;

import Exceptions.GeneralErr;
import Exceptions.InvalidRequestErr;

public class LandingAction extends AbstractAction {

	@Override
	protected void parseReq() throws InvalidRequestErr {
		if(super.reqMethod.equalsIgnoreCase("get")) {
			throw new InvalidRequestErr(GeneralErr.REQ_METHOD,"Request method not supported by url");
		}
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
