package com.example.EducationalLoan.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan.Model.UserModel;
import com.example.EducationalLoan.Repository.UserRepo;
import com.example.Educationaloan.Interface.ServiceInterface;

@Service

public class UserService implements ServiceInterface {

	@Autowired
	UserRepo ur;
	
	@Override
	public List<UserModel> getAllUserDetails() {
		
		return ur.findAll();
	}

	@Override
	public UserModel postUserDetails(UserModel id) {
		
		return ur.save(id);
	}

	@Override
	public UserModel putUserDetails(UserModel id) {
		
		return ur.save(id);
	}

	@Override
	public void deleteUserDetails(int id) {
		
		ur.deleteById(id);
	}

	
}
