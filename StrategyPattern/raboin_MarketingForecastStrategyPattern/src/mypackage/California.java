package mypackage;

public class California implements TaxInterface {
	float taxRate;
	int unitPrice = 80;
	int unitsSold = 80000;
	public float CalculateTaxes()
	{
		taxRate = .0725f;
		float revenue = (unitPrice + (unitPrice * taxRate)) * unitsSold;
		System.out.println("Printing revenue for California: " + revenue);
		return revenue;
	}
}
