package com.example.demo.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Contents.Login;
import com.example.demo.Service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService ls;

	public String VerifyData(@RequestParam String email,@RequestParam String password)
	  {
		  List<Login> li = new ArrayList<>();
		  li = ls.getByUserNameAndUserPassword(email, password);
		  if(li.isEmpty()) {
			  return "login failed";
		  }
		  else
		  {
			  return "login successfull";
		  }
		  }
}
