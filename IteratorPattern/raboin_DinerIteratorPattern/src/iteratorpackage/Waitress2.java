package iteratorpackage;

import java.util.ArrayList;

public class Waitress2 
{
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu2 dinerMenu;
	
	public Waitress2(PancakeHouseMenu pancakeHouseMenu, DinerMenu2 dinerMenu)
	{
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu()
	{
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("MENU\n----\nLUNCH");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator) 
	{
		while(iterator.hasNext())
		{
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
