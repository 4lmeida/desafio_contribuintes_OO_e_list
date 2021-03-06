package entities;

public class TaxPayer {
	
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer() {
	}
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	
	public double getSalaryIncome() {
		return salaryIncome;
	}
	
	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	
	public double getServicesIncone() {
		return servicesIncome;
	}
	
	public void setServicesincome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}
	
	public double getCapitalIncome() {
		return capitalIncome;
	}
	
	public void setCapitalIncone(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}
	
	public double getHealthSpending() {
		return healthSpending;
	}
	
	public void setHealthSpending(double helathSpending) {
		this.healthSpending = helathSpending;
	}
	
	public double getEducationSpending() {
		return educationSpending;
	}
	
	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double salaryMonth = salaryIncome / 12.0;
		
		if (salaryMonth < 3000.0) {
			return 0.0;
		}
		else if (salaryMonth < 5000.0) {
			return salaryIncome * 0.1;
		}
		else {
			return salaryIncome * 0.2;
		}	
	}
	
	public double servicesTax() {
		return servicesIncome * 0.15;	
	}
	
	public double capitalTax() {
		return capitalIncome * 0.2;
	}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		double spendingTotal = educationSpending + healthSpending;
		
		if (grossTax() < spendingTotal) {
			return grossTax() * 0.3;
		}
		else {
			return spendingTotal;
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
		
}
