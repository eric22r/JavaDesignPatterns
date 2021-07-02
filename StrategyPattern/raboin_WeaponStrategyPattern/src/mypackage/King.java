package mypackage;

public class King extends Character {
		public King() {
			weapon = new SwordBehavior();
		}
		public void fight()
		{
			System.out.println("The King attacks with a sword!");
		}
}
