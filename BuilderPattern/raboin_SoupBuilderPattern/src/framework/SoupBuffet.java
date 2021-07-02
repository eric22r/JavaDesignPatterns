package framework;

public class SoupBuffet
{
	String soupBuffetName;
	
	ChickenSoup chickenSoup;
	ClamChowder clamChowder;
	FishChowder fishChowder;
	Minnestrone minnestrone;
	
	public String getSoupBuffetName()
	{
		return soupBuffetName;
	}
	public String getTodaysSoups()
	{
		StringBuffer stringOfSoups = new StringBuffer();
		stringOfSoups.append(" Today's Soups! ");
		stringOfSoups.append(" Chicken Soup: ");
		stringOfSoups.append(this.chickenSoup.getSoupName());
		stringOfSoups.append(" Clam Chowder ");
		stringOfSoups.append(this.clamChowder.getSoupName());
		stringOfSoups.append(" Minnestrone ");
		stringOfSoups.append(this.minnestrone.getSoupName());
		return stringOfSoups.toString();

	}
}
