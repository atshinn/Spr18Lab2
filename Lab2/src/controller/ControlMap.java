package controller;

import java.util.concurrent.ConcurrentHashMap;

import actions.*;

public class ControlMap extends ConcurrentHashMap<String, Action> {
	//REQUEST URLS
	public static final String LANDING="landing", LOGIN="login",CREATE_ACC="account/create",
			STORY_DEL="story/delete",STORY_EDIT="story/edit",STORY_NEW="story/new";
	
	public static final String LANDING_DEST="/landing.jsp",LOGIN_DEST="login/";
	public String context;
	
	public ControlMap(String context) {
		super();
		this.context = "/" + context+ "/";
		String urlSourcePrefix = context + "controller/";
		
		String destUrlSuffix = ".jsp";
		
		/*super.put(urlSourcePrefix+LANDING,new LandingAction());
		super.put(urlSourcePrefix+LOGIN, new LoginAction());
		super.put(urlSourcePrefix+CREATE_ACC, new CreateAccountAction());
		super.put(urlSourcePrefix+STORY_DEL,"/confirmdelete.jsp");
		super.put(urlSourcePrefix+STORY_EDIT, "/editstory.jsp");
		super.put(urlSourcePrefix+STORY_NEW, "/editstory.jsp");*/
		
		
	}
}
