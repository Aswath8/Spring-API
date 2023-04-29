package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Contents.Signup;
import com.example.demo.Service.SignupService;

@RestController
public class SignupController {
	
	@Autowired
	SignupService mg;
	
	@GetMapping("/getSignup")
	public List<Signup> getSignup()
	{
		return mg.getSignup();
	}
	
	@PostMapping("/postsignup")
	public Signup postSignup (@RequestBody Signup xxx )
	{
		return mg.postSignup(xxx);
	}
	
	@PostMapping("/putsignup")
	public Signup putSignup (@RequestBody Signup xxk )
	{
		return mg.postSignup(xxk);
	}
	
	@DeleteMapping("/deletesignup/{url}")
	public void deletesignup(@PathVariable int id)
	{
		mg.deletesignup(id);
	}

}
