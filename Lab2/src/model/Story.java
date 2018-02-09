package model;

public class Story {
	private String name;
	private String access;
	private String story;
	
	
	public Story(String name,String story,String access) {
		this.name = name;
		this.access = access;
	}
	
	public boolean canUserView(String userRole) {
		boolean result = true;
		boolean restrictedAccess = (this.access.equalsIgnoreCase("subscriber") || this.access.equals("reporter"));
		
		if(restrictedAccess && userRole.equalsIgnoreCase("guest"))
			result = false;
			
		return result;
	}

	public String toQueryString() {
		StringBuilder sb = new StringBuilder("");
		
		return sb.toString();		
	}
	
	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	
}
