package mypackage;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("First customer ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Second customer ordered a " + pizza.getName() + "\n");
	}
}
