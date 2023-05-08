package com.example.EducationalLoan.Model;




public class LoginModel {

	public LoginModel(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	@Override
	public String toString() {
		return "LoginModel [Email=" + Email + ", Password=" + Password + "]";
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	private String Email;
	private String Password;
	
	LoginModel(){}


	
}
