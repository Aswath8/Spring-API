package com.example.Educationaloan.Interface;


import java.util.List;

import com.example.EducationalLoan.Model.UserModel;
public interface ServiceInterface {
	List<UserModel> getAllUserDetails();

	UserModel postUserDetails(UserModel id);

	UserModel putUserDetails(UserModel id);

	void deleteUserDetails(int id);
}
