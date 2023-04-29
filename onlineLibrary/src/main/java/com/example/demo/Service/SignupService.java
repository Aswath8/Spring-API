package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Contents.Login;
import com.example.demo.Contents.Signup;
import com.example.demo.Repository.SignupRepo;

@Service
public class SignupService {

	@Autowired
	SignupRepo su;
	
	
	public List<Signup> getSignup()
	{
		return su.findAll();
	}
	
	public Signup postSignup(Signup jj)
	{
		return su.save(jj);
	}
	
	public Signup putSignup(Signup xt)
	{
		return su.save(xt);
	}
	
	public void deletesignup(int id)
	{
		su.deleteById(id);
	}
}
