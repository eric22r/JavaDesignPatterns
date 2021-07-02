package mypackage;

public class GladiatorsPendant extends CharacterDecorator{
	Character character;
	
	public GladiatorsPendant(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + " Deadly Gladiator's Pendant of Triumph, ";
	}
	
}
