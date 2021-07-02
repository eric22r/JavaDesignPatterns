package mypackage;

import java.util.ArrayList;

public abstract class Dog {
	String name;
	String type;
	String breed;
	ArrayList attributes = new ArrayList();
	
	void FindDog()
	{
		System.out.println("Finding dog..... " + name + " found!" );
		for(int i = 0; i < attributes.size(); i++)
		{
			System.out.println("    " + attributes.get(i));
		}
	}
	
	void SearchingDog()
	{
		System.out.println("Comparing best traits....");
	}
	
	void SelectingDog()
	{
		System.out.println("Selecting Dog.....");
	}
	
	void DropDog()
	{
		System.out.println("Dog is ready for pickup!");
	}
	
	public String GetBreed()
	{
		return breed;
	}
	
}
