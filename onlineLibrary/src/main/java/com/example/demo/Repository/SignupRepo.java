package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Contents.Signup;

public interface SignupRepo extends JpaRepository <Signup,Integer> {

}
