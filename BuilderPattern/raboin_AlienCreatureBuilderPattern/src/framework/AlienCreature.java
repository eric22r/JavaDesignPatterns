package framework;

public class AlienCreature 
{
	String alienHome;
	Eyes eyes;
	Head head;
	Nose nose;
	Ears ears;
	Mouth mouth;
	Body body;
	Arms arms;
	Hands hand;
	Legs legs;
	
	public String getAlienHome()
	{
		return alienHome;
	}
	
	public String getAlienInfo()
	{
		StringBuffer alienInfo = new StringBuffer();
		
		alienInfo.append(" \n Eyes : ");
		alienInfo.append(this.eyes.getAlienPart() + "\n Head:  ");
		alienInfo.append(this.head.getAlienPart() + "\n Nose: ");
		alienInfo.append(this.nose.getAlienPart() + "\n Ears: ");
		alienInfo.append(this.ears.getAlienPart() + "\n Mouth:  ");
		alienInfo.append(this.mouth.getAlienPart() + "\n Body: ");
		alienInfo.append(this.body.getAlienPart() + "\n Arms:  ");
		alienInfo.append(this.arms.getAlienPart() + "\n Hands: ");
		alienInfo.append(this.hand.getAlienPart() + "\n Legs: ");
		alienInfo.append(this.legs.getAlienPart() + "\n ");
		
		return alienInfo.toString();
	}
}
