package mypackage;

public class ShadowMask extends CharacterDecorator{
	Character character;
	
	public ShadowMask(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + " Malefic Mask of the Shadows, ";
	}
	
}
