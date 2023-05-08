package com.example.EducationalLoan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EducationalLoan.Model.LoanApplicationModel;
import com.example.EducationalLoan.Service.LoanApplicationService;


@RestController
public class LoanApplicationController {

	@Autowired
	LoanApplicationService ls;
	@GetMapping("/fetchLoanDetails")
    public List<LoanApplicationModel> fetchLoanDetails() {
		
		return ls.fetchLoanDetails();
	}
	
	@PostMapping("/postLoanDetails")
	public LoanApplicationModel postLoanDetails(LoanApplicationModel l) {
		
		return ls.postLoanDetails(l);
	}
	
	@PutMapping("/putLoanDetails")
	public LoanApplicationModel putLoanDetails(LoanApplicationModel l) {
		
		return ls.putLoanDetails(l);
	}
	
	@DeleteMapping("/deleteLoanDetails")
	public String deleteLoanDetails(int loanid) {
		
		ls.deleteLoanDetails(loanid);
		return "LoanDetails deleted";
	}
}
