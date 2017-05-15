public class Test {

	public static void main(String[] args) {

		CommissionEmployee commissionEmployee = new CommissionEmployee("Wallace", "Balaniuc", "222-22-2222", 10000,

				0.6);

		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Tom", "Tsilliopolous",

				"123-45-6789", 2000, .1, 5000);

		

		System.out.println(commissionEmployee);

		

		System.out.println(basePlusCommissionEmployee);

		

		CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;

		

		System.out.println(commissionEmployee2);

	}

}