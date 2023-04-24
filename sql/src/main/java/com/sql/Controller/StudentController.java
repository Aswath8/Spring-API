package com.sql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sql.Service.StudentService;
import com.sql.model.Student;

@RestController
public class StudentController {

	
	
	
	
	@Autowired
	StudentService ss;
	
	@GetMapping("/details")
	public List<Student> getAllDetails()
	{
		return  ss.getAllDetails();
	}
	
	@PostMapping("/save")
	public Student saveData(@RequestBody Student s)
	{
		return ss.saveDetail(s);
	}
	
	

}
