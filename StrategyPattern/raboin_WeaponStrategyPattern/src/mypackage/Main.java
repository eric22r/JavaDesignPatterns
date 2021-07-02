package mypackage;

public class Main {
	public static void main(String[] args)
	{
		Character troll = new Troll();
		troll.fight();
		
		Character queen = new Queen();
		queen.fight();
		
		Character king = new King();
		king.fight();
		
		Character knight = new Knight();
		knight.fight();
	}
}