package com.example.Educationaloan.Interface;

import java.util.List;

import com.example.EducationalLoan.Model.LoanApplicationModel;

public interface LoanApplicationInterface {
	
	List<LoanApplicationModel> fetchLoanDetails();
	LoanApplicationModel postLoanDetails(LoanApplicationModel l);
	LoanApplicationModel putLoanDetails(LoanApplicationModel l);
	void deleteLoanDetails(int loanid);

}
