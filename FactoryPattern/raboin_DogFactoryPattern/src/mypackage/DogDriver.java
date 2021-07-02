package mypackage;

public class DogDriver {
	public static void main(String[] args)
	{
		DogStore dogStore = new DogStore();
		
		Dog smDog = dogStore.orderDog("Small");
		System.out.println("Family #1 wants a " + smDog.GetBreed() + "\n" );
		
		Dog mdDog = dogStore.orderDog("Medium");
		System.out.println("Family #2 wants a " + mdDog.GetBreed() + "\n" );
		
		Dog lgDog = dogStore.orderDog("Large");
		System.out.println("Family #3 wants a " + lgDog.GetBreed() + "\n" );
	}
}
