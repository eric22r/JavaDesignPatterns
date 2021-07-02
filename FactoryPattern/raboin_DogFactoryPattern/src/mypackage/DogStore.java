package mypackage;

public class DogStore extends DogFactory {
	protected Dog createDog(String item) {
		if(item.equalsIgnoreCase("small")) {
			return new SmallDog();
		}else if (item.equalsIgnoreCase("medium")) {
			return new MediumDog();
		}else if (item.equalsIgnoreCase("large")) {
			return new LargeDog();
		}else return null;
	}
}
