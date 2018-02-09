package actions;

public class ActionFactory {
	public final static String LANDING = "landing";
	public final static String LOGIN = "login";
	public final static String ROOT = "controller";
	
	public static Action getAction(String url) {
		url = url.toLowerCase();
		Action result = null;
			if(url.endsWith(ActionFactory.LANDING) || url.endsWith(ActionFactory.ROOT)) {
				result = new LandingAction();
			}
			else if(url.toLowerCase().endsWith(ActionFactory.LOGIN)) {
				result = new LoginAction();
			}
			
		return result;
	}
}
