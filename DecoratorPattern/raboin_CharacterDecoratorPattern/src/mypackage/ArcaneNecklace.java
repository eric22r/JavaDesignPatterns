package mypackage;

public class ArcaneNecklace extends CharacterDecorator{
	Character character;
	
	public ArcaneNecklace(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + " Necklace of Arcane Spheres, ";
	}
	
}
