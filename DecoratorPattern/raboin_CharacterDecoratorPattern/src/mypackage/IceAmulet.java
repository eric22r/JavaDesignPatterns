package mypackage;

public class IceAmulet extends CharacterDecorator{
	Character character;
	
	public IceAmulet(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + " Icy Blast Amulet, ";
	}
	
}
