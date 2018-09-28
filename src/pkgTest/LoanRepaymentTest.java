package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;


import pkgLoan.LoanRepayment;

public class LoanRepaymentTest {

	@Test
	public void monthlyCarPayment_test1() {
		
		LoanRepayment lr = new LoanRepayment();
	
		System.out.print(lr.monthlyCarPayment(35000.0, 0.1 , 60));
		
	}
	
	@Test
	public void totalInterestPaid_test1() {
		
		LoanRepayment lr = new LoanRepayment();
		
		System.out.print(lr.totalInterestPaid(35000.0, 0.10 , 60));

	}
	
}

	


