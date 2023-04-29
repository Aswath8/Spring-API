package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Contents.Login;


@Repository
public interface LoginRepo extends JpaRepository <Login,Integer> {
	
	
	List<Login> getByUserNameAndUserPassword (String name,String password);
      //   Login findByUserPassword (String UserPassword);

}
