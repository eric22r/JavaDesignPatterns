package mypackage;

public class PlayGame 
{
	public static void main(String[] args) 
	{
		Boss bigBoss = Boss.getBoss();
		
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
	
		player1.setName("Lorthgar");
		player1.setAttackPower(33);
		player2.setName("Borogan");
		player2.setAttackPower(20);
		player3.setName("Azule");
		player3.setAttackPower(40);
		
		player1.strike();
		if(bigBoss.bossHP <= 0)
		{
			System.out.println("Game Over!");
		}
		
		if(bigBoss.bossHP > 0)
		{
			player2.strike();
			if(bigBoss.bossHP <= 0)
			{
				System.out.println("Game Over!");
			}
		}
		
		if(bigBoss.bossHP > 0)
		{
			player3.strike();
			if(bigBoss.bossHP <= 0)
			{
				System.out.println("Game Over!");
			}
		}
		
		if(bigBoss.bossHP > 0)
		{
			player1.strike();
			if(bigBoss.bossHP <= 0)
			{
				System.out.println("Game Over!");
			}
		}
		
	}
	
}
