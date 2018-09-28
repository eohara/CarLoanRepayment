package pkgTest;

import static pkgLoan.LoanRepayment.*;

import static org.junit.Assert.*;



import org.junit.Test;


import pkgLoan.LoanRepayment;

public class LoanRepaymentTest {

	@Test
	public void monthlyCarPayment_test1() {
		
		LoanRepayment lr = new LoanRepayment();
		
		System.out.print(LoanRepayment.monthlyCarPayment(35000.0, 0.10, 60.0));
		
	}


	}

	


