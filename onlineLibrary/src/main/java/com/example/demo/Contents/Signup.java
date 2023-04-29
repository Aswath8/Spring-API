package com.example.demo.Contents;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Signup {
	
	@Id
	@GeneratedValue
	private int UserId;
	public Signup(int userId, String name, String password, int age, String gender, String mailId, int mobileNumber) {
		super();
		UserId = userId;
		Name = name;
		Password = password;
		Age = age;
		Gender = gender;
		MailId = mailId;
		MobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Signup [UserId=" + UserId + ", Name=" + Name + ", Password=" + Password + ", Age=" + Age + ", Gender="
				+ Gender + ", MailId=" + MailId + ", MobileNumber=" + MobileNumber + "]";
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMailId() {
		return MailId;
	}
	public void setMailId(String mailId) {
		MailId = mailId;
	}
	public int getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}
	private String Name;
	private String Password;
	private int Age;
	private String Gender;
	private String MailId;
	private int MobileNumber;
	
}
