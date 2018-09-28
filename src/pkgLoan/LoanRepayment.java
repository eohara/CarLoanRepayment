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
		
		double monthlyPMT = (iCarCost*iInterestRate/12)/Math.pow(((1-(1+iInterestRate/12))) , (-(iLoanLength/12)*12));
	
	
		return monthlyPMT;
		
	}


	
 


}

