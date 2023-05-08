package com.example.EducationalLoan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EducationalLoan.Model.UserModel;
import com.example.EducationalLoan.Service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@CrossOrigin("*")

public class UserController {
	

@Autowired
UserService us;
@Tag(name="get",description="getdata")
	@GetMapping("/getAllUserDetails")
    public List<UserModel> getAllUserDetails() {
		
		return us.getAllUserDetails();
	}

	@PostMapping("/postUserDetails")
	public UserModel postUserDetails(UserModel id) {
		
		return us.postUserDetails(id);
	}

	@PutMapping("/putUserDetails")
	public String putUserDetails(UserModel id) {
		
		us.putUserDetails(id);
		return "User details are Updated";
	}

	@DeleteMapping("/deleteUserDetails")
	public String deleteUserDetails(int id) {
		
		us.deleteUserDetails(id);
		return "User details are deleted";
	}
	
}


