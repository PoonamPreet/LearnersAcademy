
package com.hibernate.bean;



public class Login {

	private int id;

	private String password;
	private String username;
	public String getPassword() {
		return password;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", password=" + password + ", username=" + username + "]";
	}

}
