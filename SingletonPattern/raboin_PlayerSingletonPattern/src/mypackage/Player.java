package mypackage;

public class Player 
{
	
	private int attackPower;
	private String name;
	public Player()
	{
		attackPower = 20;
		name = "Unknown";
	}
	
	public void setAttackPower(int x)
	{
		attackPower = x;
	}
	
	public int getAttackPower()
	{
		return attackPower;
	}
	
	public void setName(String x)
	{
		name = x;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void strike()
	{
		int x = getAttackPower();
		
		Boss.bossHP -= x;
		
		if(Boss.bossHP < 0)
		{
			Boss.bossHP = 0;
		}
				
		System.out.println("Player " + getName() + " attacks the big boss and delivers " + getAttackPower() + " damage to HP! \n BIG BOSS HP: " + Boss.bossHP);
		
	}
	
	
	
}
