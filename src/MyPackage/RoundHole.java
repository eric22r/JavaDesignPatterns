package MyPackage;

public class RoundHole {
	int radius = 10;
	
	public boolean pegFits(RoundPeg roundPeg)
	{
		return roundPeg.getRadius() <= radius;
	}
}

