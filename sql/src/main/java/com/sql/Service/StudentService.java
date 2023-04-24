package com.sql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sql.Repository.StudentRepository;
import com.sql.model.Student;

@Service
public class StudentService {
     @Autowired
	StudentRepository sr;

    public List<Student> getAllDetails()
    {
    	return sr.findAll();
    }

    public Student saveDetail(Student s)
    {
        return sr.save(s);	
    }
          
    
	
}
