package mypackage;

public class BonescytheHelmet extends CharacterDecorator{
	Character character;
	
	public BonescytheHelmet(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + " Valorous Bonescythe Helmet, ";
	}
	
}
