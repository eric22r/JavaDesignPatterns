package mypackage;

public class ChicagoStyleClamPizza extends Pizza{
	public ChicagoStyleClamPizza()
	{
		name = "Chicago Style Deep Dish Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozarella Cheese");
	}
	
	void cut()
	{
		System.out.println("Cutting the pizza into square slices");
	}
}
