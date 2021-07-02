package iteratorpackage;

public class DinerMenu1 
{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu1()
	{
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", 
				"(Fakin') Bacon with lettuce & tomato on whole wheat",
				true, 2.99);
	}
	
	public void addItem(String name, String description,
						boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS)
		{
			System.err.println("Sorry, menu is full! Can't add item to menu");
		}
		else
		{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public MenuItem[] getMenuItems()
	{
		return menuItems;
	}
}
