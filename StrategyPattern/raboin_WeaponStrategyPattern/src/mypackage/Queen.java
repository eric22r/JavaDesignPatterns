package mypackage;

public class Queen extends Character {
		public Queen() {
			weapon = new KnifeBehavior();
		}
		public void fight()
		{
			System.out.println("The Queen attacks with a pointy knife!");
		}
}
