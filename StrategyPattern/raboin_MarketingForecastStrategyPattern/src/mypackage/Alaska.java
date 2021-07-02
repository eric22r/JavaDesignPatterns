package mypackage;

public class Alaska implements TaxInterface {
	float taxRate;
	int unitPrice = 80;
	int unitsSold = 80000;
	public float CalculateTaxes()
	{
		taxRate = .0f;
		float revenue = (unitPrice + (unitPrice * taxRate)) * unitsSold;
		System.out.println("Printing revenue for Alaska: " + revenue);
		return revenue;
	}
}
