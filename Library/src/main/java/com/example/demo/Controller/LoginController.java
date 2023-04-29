package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LoginService;
import com.example.demo.model.Login;

@RestController
public class LoginController {
  @Autowired
  private LoginService LS;
  @GetMapping("/verifydata")
  public String VerifyData(@RequestParam String email,@RequestParam String password)
  {
	  List<Login> li = new ArrayList<>();
	  li = LS.getByEmailAndPassword(email, password);
	  if(li.isEmpty()) {
		  return "login failed";
	  }
	  else
	  {
		  return "login successfull";
	  }
	  }
}
