package mypackage;

public abstract class DogFactory {
	public Dog orderDog(String type)
	{
		Dog dog;
		
		dog = createDog(type);
		
		dog.FindDog();
		dog.SearchingDog();
		dog.SelectingDog();
		dog.DropDog();
		
		return dog;
	}
	
	protected abstract Dog createDog(String type);
}
