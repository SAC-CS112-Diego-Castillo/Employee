public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double _baseSalary;



	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,

			double commisionRate, double baseSalary) {

		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);

		this.setBaseSalary(baseSalary);

	}



	public double getBaseSalary() {

		return _baseSalary;

	}



	public void setBaseSalary(double baseSalary) {

		if (baseSalary < 0.0)

			throw new IllegalArgumentException("Base salary must be greater than 0.0!");

		this._baseSalary = baseSalary;

	}



	@Override

	public String toString() {

		// return super.toString() + String.format("%nBase Salary: $%.2f",

		// this.getBaseSalary());

		return String.format("%s:%n%s%nBase Salary: $%.2f", this.getClass(), super.toString(), this.getBaseSalary());

	}



	@Override

	public double earnings() {

		// TODO Auto-generated method stub

		return super.earnings() + this.getBaseSalary();

	}

}