package mypackage;

public class Troll extends Character {
		public Troll() {
			weapon = new AxeBehavior();
		}
		public void fight()
		{
			System.out.println("The Troll attacks with a heavy axe!");
		}
}
