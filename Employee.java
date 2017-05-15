public abstract class Employee {

	private final String _firstName;

	private final String _lastName;

	private final String _socialSecurityNumber;



	public Employee(String firstName, String lastName, String ssn) {

		this._firstName = firstName;

		this._lastName = lastName;

		this._socialSecurityNumber = ssn;

	}



	public String getFirstName() {

		return _firstName;

	}



	public String getLastName() {

		return _lastName;

	}



	public String getSocialSecurityNumber() {

		return _socialSecurityNumber;

	}



	@Override

	public String toString() {

		return String.format("Name: %s %s%nSocial Security Number: %s", this.getFirstName(), this.getLastName(),

				this.getSocialSecurityNumber());

	}



	public abstract double earnings();

}