package controller.actions;

import model.Story;

public class NewStoryAction extends AbstractAction {
	private Story newStory;
	
	@Override
	protected void parseReq() {
		

	}

	@Override
	protected void formRes() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processPayload() {
		String title = pMap.get("title")[0];
		String story = pMap.get("story")[0];
		String access = pMap.get("acess")[0];
		if(access == null)
			access="public";
		this.newStory = new Story(title,story,access);
	}

	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		return null;
	}

}
