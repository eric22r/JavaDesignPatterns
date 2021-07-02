package mypackage;

public class Alabama implements TaxInterface {
	float taxRate;
	int unitPrice = 80;
	int unitsSold = 80000;
	public float CalculateTaxes()
	{
		taxRate = .04f;
		float revenue = (unitPrice + (unitPrice * taxRate)) * unitsSold;
		System.out.println("Printing revenue for Alabama: " + revenue);
		return revenue;
	}
}
