package framework;

abstract class AlienCreatureBuilder 
{
	
	AlienCreature alienCreature;
	
	public AlienCreature getAlien() 
	{
		return alienCreature;
	}
	
	public void buildAlien()
	{
		alienCreature = new AlienCreature();
	}
	
	public abstract void setAlienHome();
	
	
	
	public void buildEye()
	{
		alienCreature.eyes = new Eyes();
	}
	
	public void buildHead()
	{
		alienCreature.head = new Head();
	}
	
	public void buildNose()
	{
		alienCreature.nose = new Nose();
	}

	public void buildEar()
	{
		alienCreature.ears = new Ears();
	}
	
	public void buildMouth()
	{
		alienCreature.mouth = new Mouth();
	}
	
	public void buildBody()
	{
		alienCreature.body = new Body();
	}
	
	public void buildArm()
	{
		alienCreature.arms = new Arms();
	}
	
	public void buildHand()
	{
		alienCreature.hand = new Hands();
	}
	
	public void buildLeg()
	{
		alienCreature.legs = new Legs();
	}

	
	
	
}
