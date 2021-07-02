package framework;

class LexusES300Builder extends MidSizeCarBuilder {
	private static LexusES300Builder uniqueInstance;
	private LexusES300Builder()
	{
		
	}
	public static LexusES300Builder getInstance()
	{
		if(uniqueInstance == null)
		{
			uniqueInstance = new LexusES300Builder();
		}
		return uniqueInstance;
	}
	
	public void setCarName()
	{
		brandNewCar.carName = "Lexus ES-300";
	}
}
