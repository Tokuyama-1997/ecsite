package jp.co.internous.ecsite.model.domain;

public class MstUser {
	private int id;
	private String userName;
	private String password;
	private String fullName;
	private int isAdmin;
	
	public int getId() {return id;}
	public void setId(final int id) {this.id=id;}
	
	public String getUserName() {return userName;}
	public void setUserName(final String userName) {
		this.userName=userName;
	}
	
	public String getPassword() {return password;}
	public void setPassword(final String password) {
		this.password=password;
	}
	
	public String getFullName() {return fullName;}
	public void setFullName(final String fullName) {
		this.fullName=fullName;
	}
	
	public int getIsAdmin() {return isAdmin;}
	public void setIsAdmin(final int isAdmin) {
		this.isAdmin=isAdmin;
	}
}
