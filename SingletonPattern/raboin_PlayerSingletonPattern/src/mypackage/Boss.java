package mypackage;

public class Boss 
{
	public static int bossHP;
	
	private static Boss boss;
	
	private Boss()
	{
		bossHP = 100;
	}
	
	public static Boss getBoss()
	{
		if(boss == null)
		{
			boss = new Boss();
		}
		return boss;
	}
	
}
