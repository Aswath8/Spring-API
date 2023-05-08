package com.example.EducationalLoan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan.Model.AdminModel;
import com.example.EducationalLoan.Repository.AdminRepo;
import com.example.Educationaloan.Interface.AdminInterface;

@Service
public class AdminService implements AdminInterface {

	@Autowired
	AdminRepo ar;
	@Override
	public List<AdminModel> fetchAdminDetails() {
		return ar.findAll();
	}

	@Override
	public AdminModel postAdminDetails(AdminModel a) {
	
		return ar.save(a);
	}

	@Override
	public AdminModel putAdminDetails(AdminModel a) {
		
		return ar.save(a);
	}

	@Override
	public void deleteAdminDetails(int id) {
		ar.deleteById(id);

	}
}
