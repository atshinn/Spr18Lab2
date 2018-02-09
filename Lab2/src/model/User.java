package model;

public class User {
	private String role;
	private String[] favs;
	
	public User(String role) {
		this.role = role;
		this.favs = null;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String[] getFavs() {
		return favs;
	}

	public void setFavs(String[] favs) {
		this.favs = favs;
	}
}
