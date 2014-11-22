package com.example.ratracegame;


public class Doctor extends Profession {
	
	// income
	int salary;
	int interest;
	int dividends;
	int retail_income;
	// expenses
	int taxes;
	int rentpay;
	int schoolloanpay;
	int carpay;
	int creditcardpay;
	int retailpayment;
	int other_expenses;
	// assets
	int savings;
	// liabilities
	int mortgage;
	int schoolloan;
	int carloan;
	int creditcard;
	int retaildebt;
	
	int passive_income;
	int total_income;
	int total_expense;
	int monthlycashflow;
	
	int balance;
	String name;
	
	Doctor() {
		name = "Doctor";
		salary = 13000;
		interest = 0;
		dividends = 0;
		retail_income = 0;
		taxes = 3420;
	    rentpay = 1900;
	    schoolloanpay = 750;
	    carpay = 380;
		creditcardpay = 270;
		retailpayment = 50;
		other_expenses = 2880;
		savings = 0;
		mortgage = 200000;
		schoolloan = 150000;
		carloan = 19000;
		creditcard = 9000;
		retaildebt = 1000;
		passive_income = 0;
		total_income = salary + passive_income;
		total_expense = taxes + rentpay + schoolloanpay + carpay +
				creditcardpay + retailpayment + other_expenses;
		monthlycashflow = total_income - total_expense;
		balance = monthlycashflow + 400;
		
	}
	
	// return salary
	int getSalary() {
		return salary;
	}
	
	// add salary
	void addSalary(int money) {
		salary += money;
	}
	
	// return interest
	int getInterest() {
		return interest;
	}
	
	// add interest
	void addInterest(int money) {
		interest += money;
	}
	
	// return dividends
	int getDividends() {
		return dividends;
	}
	
	// add dividends
	void addDividends(int money) {
		dividends += money;
	}
	
	// return retail income
	int getRetail_income() {
		return retail_income;
	}
	
	// add retail_income
	void addRetail_income(int money) {
		retail_income += money;
	}
	
	// return taxes
	int getTaxes() {
		return taxes;
	}
	
	// add taxes
	void addTaxes(int money) {
		taxes += money;
	}
	
	// return rent payment
	int getRentpay() {
		return rentpay;
	}
	
	// add rent payment
	void addRentpay(int money) {
		rentpay += money;
	}
	
	// return school loan payment
	int getSchoolloanpay() {
		return schoolloanpay;
	}
	
	// add school loan payment
	void addSchoolloanpay(int money) {
		schoolloanpay += money;
	}
	
	// return car payment
	int getCarpay() {
		return carpay;
	}
	
	// add car payments
	void addCarpay(int money) {
		carpay += money;
	}
	
	// return credit card payments
	int getCreditcardpay() {
		return creditcardpay;
	}
	
	// add credit card payment
	void addCreditcardpay(int money) {
		creditcardpay += money;
	}
	
	// return retail payments
	int getRetailpayment() {
		return retailpayment;
	}
	
	// add retail payment
	void addRetailpayment(int money) {
		retailpayment += money;
	}
	
	// return other expenses
	int getOther_expenses() {
		return other_expenses;
	}
	
	// add other expenses
	void addOther_expenses(int money) {
		other_expenses += money;
	}
	
	// return savings
	int getSavings() {
		return savings;
	}
	
	// return mortgage
	int getMortgage() {
		return mortgage;
	}
	
	// add mortgage
	void addMortgage(int money) {
		mortgage += money;
	}
	
	// return school loan
	int getSchoolloan() {
		return schoolloan;
	}
	
	// add school loan
	void addSchoolloan(int money) {
		schoolloan += money;
	}
	
	// return car loan
	int getCarloan() {
		return carloan;
	}
	
	// add car loan
	void addCarloan(int money) {
		carloan += money;
	}
	
	// return credit card
	int getCreditcard() {
		return creditcard;
	}
	
	// add credit card
	void addCreditcard(int money) {
		creditcard += money;
	}
	
	// return retail debt
	int getRetaildebt() {
		return retaildebt;
	}
	
	// add retail debt
	void addRetaildebt(int money) {
		retaildebt += money;
	}
	
	// return balance
	int getBalance() {
		return balance;
	}
	
	// set balance
	void setBalance(int money) {
		balance += money;
	}
	
	// return passive income
	int getPassiveIncome() {
		passive_income = interest + dividends + retail_income;
		return passive_income;
	}
	
	// return total income;
	int getTotalIncome() {
		total_income = salary + getPassiveIncome();
		return total_income;
	}
	
	// return total expenses
	int getTotalExpenses() {
		total_expense = taxes + rentpay + schoolloanpay + carpay + creditcardpay +
				retailpayment + other_expenses;
		return total_expense;
	}
	
	// return monthly cash flow
	int getMonthlyCashFlow() {
		monthlycashflow = getTotalIncome() - total_expense;
		return monthlycashflow;
	}
	
	// return name
	String getName() {
		return name;
	}
}
