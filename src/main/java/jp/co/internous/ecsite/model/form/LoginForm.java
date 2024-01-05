package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable{
	private String userName;
	private String password;
	
	public String getUserName() {return userName;}
	public void setUserName(final String userName) {
		this.userName=userName;
	}
	
	public String getPassword() {return password;}
	public void setPassword(final String password) {
		this.password=password;
	}
}
