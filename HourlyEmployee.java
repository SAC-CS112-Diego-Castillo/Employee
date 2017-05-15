

public class HourlyEmployee extends Employee {



	private double _wage;

	private double _hours;



	public HourlyEmployee(String fName, String lName, String ssn, double wage, double hours) {

		super(fName, lName, ssn);

		this.setWage(wage);

		this.setHours(hours);

	}



	public double getWage() {

		return _wage;

	}



	public double getHours() {

		return _hours;

	}



	public void setWage(double wage) {

		if (wage < 0.0)

			throw new IllegalArgumentException("Hourly wage must be >= 0.0");

		this._wage = wage;

	}



	public void setHours(double hours) {

		if (hours < 0.0 || hours > 168)

			throw new IllegalArgumentException("Hours worked must be between 0.0 and 168.0");

		this._hours = hours;

	}



	@Override

	public double earnings() {

		if (this.getHours() <= 40) {

			return this.getWage() * this.getHours();

		}

		// working overtime

		else {

			return 40 * this.getWage() + (this.getHours() - 40) * this.getWage() * 1.5;

		}

	}



	@Override

	public String toString() {

		return String.format("Hourly Employee:%n%s%n%s: $%.2f%n%s: %.2f", super.toString(), "Hourly Wage",

				this.getWage(), "Hours Worked", this.getHours());

	}

}