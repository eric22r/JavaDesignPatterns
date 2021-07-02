package mypackage;

public class Arkansas implements TaxInterface {
	float taxRate;
	int unitPrice = 80;
	int unitsSold = 80000;
	public float CalculateTaxes()
	{
		taxRate = .06f;
		float revenue = (unitPrice + (unitPrice * taxRate)) * unitsSold;
		System.out.println("Printing revenue for Arkansas: " + revenue);
		return revenue;
	}
}
