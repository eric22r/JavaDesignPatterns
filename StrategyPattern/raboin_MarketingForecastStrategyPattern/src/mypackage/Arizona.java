package mypackage;

public class Arizona implements TaxInterface {
	float taxRate;
	int unitPrice = 80;
	int unitsSold = 80000;
	public float CalculateTaxes()
	{
		taxRate = .056f;
		float revenue = (unitPrice + (unitPrice * taxRate)) * unitsSold;
		System.out.println("Printing revenue for Arizona: " + revenue);
		return revenue;
	}
}
