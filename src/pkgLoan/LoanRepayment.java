package pkgLoan;

import java.lang.Math;

public class LoanRepayment {
	
	private double carCost;
	private double downPayment;
	private double loanLength;
	private double interestRate;

	public LoanRepayment() {   
		super();
		
	}



	public double getCarCost() {
		return carCost;
	}



	public void setCarCost(double carCost) {
		this.carCost = carCost;
	}



	public double getDownPayment() {
		return downPayment;
	}



	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}



	public double getLoanLength() {
		return loanLength;
	}



	public void setLoanLength(double loanLength) {
		this.loanLength = loanLength;
	}



	public double getInterestRate() {
		return interestRate;
	}



	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double monthlyCarPayment(double iCarCost, double iInterestRate, double iLoanLength) {
		
		carCost = iCarCost;
		interestRate = iInterestRate;
		loanLength = iLoanLength;
		
		double monthlyPMT = ((iInterestRate/12) * iCarCost) / (1-(Math.pow((1+(iInterestRate/12)), ((-1)*iLoanLength))));
	
	
		return monthlyPMT;  
		
	}

	public double totalInterestPaid(double iCarCost, double iInterestRate, double iLoanLength) {
		
		carCost = iCarCost;
		interestRate = iInterestRate;
		loanLength = iLoanLength;
		LoanRepayment lr = new LoanRepayment();
		
		double totalInterest = (lr.monthlyCarPayment(iCarCost, iInterestRate, iLoanLength) * iLoanLength) - iCarCost;
		
		return totalInterest;  
	}

	 
 
	

}

