package com.example.EducationalLoan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan.Model.LoanApplicationModel;
import com.example.EducationalLoan.Repository.LoanApplicationRepo;
import com.example.Educationaloan.Interface.LoanApplicationInterface;

@Service
public class LoanApplicationService implements LoanApplicationInterface{

	@Autowired
	LoanApplicationRepo lr;
	@Override
	public List<LoanApplicationModel> fetchLoanDetails() {
		
		return lr.findAll();
	}

	@Override
	public LoanApplicationModel postLoanDetails(LoanApplicationModel l) {
		
		return lr.save(l);
	}

	@Override
	public LoanApplicationModel putLoanDetails(LoanApplicationModel l) {
		
		return lr.save(l);
	}

	@Override
	public void deleteLoanDetails(int loanid) {
		
		lr.deleteById(loanid);
	}
}
