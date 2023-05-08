package com.example.Educationaloan.Interface;

import java.util.List;

import com.example.EducationalLoan.Model.AdminModel;

public interface AdminInterface {

	List<AdminModel> fetchAdminDetails();
	AdminModel postAdminDetails(AdminModel a);
	AdminModel putAdminDetails(AdminModel a);
	void deleteAdminDetails(int id);
}

