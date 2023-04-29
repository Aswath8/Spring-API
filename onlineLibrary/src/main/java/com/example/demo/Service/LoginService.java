package com.example.demo.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Contents.Login;
import com.example.demo.Repository.LoginRepo;

@Service
public class LoginService {

	@Autowired
	LoginRepo lg;
	
	public List<Login> getByUserNameAndUserPassword(String email, String password) {
		// TODO Auto-generated method stub
		return lg.getByUserNameAndUserPassword(email, password);

	}
}
