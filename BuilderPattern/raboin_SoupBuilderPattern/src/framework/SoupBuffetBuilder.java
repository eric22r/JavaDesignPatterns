package framework;

abstract class SoupBuffetBuilder 
{
		SoupBuffet soupBuffet;
		
		public SoupBuffet getSoupBuffet() {return soupBuffet;}
		
		public void buildSoupBuffet() {soupBuffet = new SoupBuffet();}
		
		public abstract void setSoupBuffetName();
		
		public void buildChickenSoup() {soupBuffet.chickenSoup = new ChickenSoup();}
		public void buildClamChowder() {soupBuffet.clamChowder = new ClamChowder();}
		public void buildFishChowder() {soupBuffet.fishChowder = new FishChowder();}
		public void buildMinnestrone() {soupBuffet.minnestrone = new Minnestrone();}
}
