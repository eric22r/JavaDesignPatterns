package mypackage;

public class ChicagoStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		if(item.equalsIgnoreCase("cheese")) {
			return new ChicagoStyleCheesePizza();
		}else if(item.equalsIgnoreCase("clam")) {
			return new ChicagoStyleClamPizza();
		}else if (item.equalsIgnoreCase("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		}else return null;
	}
}
