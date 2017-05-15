public class CommissionEmployee extends Employee {

	private double _grossSales;

	private double _commisionRate;



	/**

	 * Initializes CommisionEmployee with first, last name, SSN, gross, commRate

	 * 

	 * @param firstName

	 * @param lastName

	 * @param socialSecurityNumber

	 * @param grossSales

	 * @param commisionRate

	 */

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,

			double commisionRate) {

		super(firstName, lastName, socialSecurityNumber);



		this.setGrossSales(grossSales);

		this.setCommisionRate(commisionRate);

	}



	public double getGrossSales() {

		return _grossSales;

	}



	public double getCommisionRate() {

		return _commisionRate;

	}



	public void setGrossSales(double grossSales) {

		if (grossSales < 0.0f) {

			throw new IllegalArgumentException("Gross sales must be >= 0.0");

		}

		this._grossSales = grossSales;

	}



	public void setCommisionRate(double commisionRate) {

		if (commisionRate <= 0.0 || commisionRate >= 1.0)

			throw new IllegalArgumentException("Commision rate must be > 0 and < 1.0");



		this._commisionRate = commisionRate;

	}



	@Override

	public double earnings() {

		// TODO Auto-generated method stub

		return this.getCommisionRate() * this.getGrossSales();

	}



	@Override

	public String toString() {

		return String.format("%s:%n%s%nGross Pay: $%.2f%nCommission Rate: %.2f%%", "Commission Employee",

				super.toString(), this.getGrossSales(), this.getCommisionRate());

	}

}