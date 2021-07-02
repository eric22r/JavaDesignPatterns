package mypackage;

public class RpgGameDriver {
	public static void main(String[] args) {
		Character character = new Priest();

		character = new IceAmulet( character );
		
		System.out.println(character.getDescription());
		
		Character character2 = new Mage();

		character2 = new ArcaneNecklace( character2 );
		character2 = new ShadowMask( character2 );
		
		System.out.println(character2.getDescription());
		
		Character character3 = new Priest();

		character3 = new IceAmulet( character3 );
		character3 = new BonescytheHelmet( character3 );
		character3 = new GladiatorsPendant( character3 );
		
		System.out.println(character3.getDescription());
		
		Character character4 = new Mage();

		character4 = new ShadowMask( character4 );
		character4 = new ArcaneNecklace( character4 );
		
		System.out.println(character4.getDescription());
	}
}
