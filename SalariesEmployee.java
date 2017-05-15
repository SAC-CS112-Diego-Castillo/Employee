public class SalariesEmployee extends Employee {

	private double _weeklySalary;



	public SalariesEmployee(String fName, String lName, String ssn, double weeklySalary) {

		super(fName, lName, ssn);

		this.setWeeklySalary(weeklySalary);

	}



	public double getWeeklySalary() {

		return this._weeklySalary;

	}



	public void setWeeklySalary(double weeklySalary) {

		if (weeklySalary < 0.0)

			throw new IllegalArgumentException("Weekly salary must be >= 0.0");

		this._weeklySalary = weeklySalary;

	}



	@Override

	public double earnings() {

		return this.getWeeklySalary();

	}



	@Override

	public String toString() {

		return String.format("Salaried Employee:%n%s%nWeekly Salary: $%.2f", super.toString(), this.getWeeklySalary());

	}

}