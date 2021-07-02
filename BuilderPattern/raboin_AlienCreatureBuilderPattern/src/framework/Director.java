package framework;

public class Director 
{
	public static void main(String[] args)
	{
		AlienCreature marsAlien = buildAlien(new MarsAlienCreatureBuilder());
		System.out.println(
				"Alien Information \n Homeworld:"
				+ marsAlien.getAlienHome()
				+marsAlien.getAlienInfo()
				);
		AlienCreature neptuneAlien = buildAlien(new NeptuneAlienCreatureBuilder());
		System.out.println(
				"Alien Information: \n Homeworld: "
				+ neptuneAlien.getAlienHome()
				+neptuneAlien.getAlienInfo()
				);
	}
	public static AlienCreature buildAlien(AlienCreatureBuilder alienCreatureBuilder)
	{
		alienCreatureBuilder.buildAlien();
		alienCreatureBuilder.setAlienHome();
		alienCreatureBuilder.buildEye();
		alienCreatureBuilder.buildHead();
		alienCreatureBuilder.buildNose();
		alienCreatureBuilder.buildEar();
		alienCreatureBuilder.buildMouth();
		alienCreatureBuilder.buildBody();
		alienCreatureBuilder.buildArm();
		alienCreatureBuilder.buildHand();
		alienCreatureBuilder.buildLeg();
		
		return alienCreatureBuilder.getAlien();
	}
	
}
