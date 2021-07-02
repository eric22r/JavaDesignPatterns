package mypackage;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza()
	{
		name = "Chicago Style Deep Dish Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozarella Cheese");
	}
	
	void cut()
	{
		System.out.println("Cutting hte pizza into square slices");
	}
}
