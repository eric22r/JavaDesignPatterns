package mypackage;

public class Knight extends Character {
		public Knight() {
			weapon = new BowAndArrowBehavior();
		}
		public void fight()
		{
			System.out.println("The Knight attacks with a menacing bow!");
		}
}
