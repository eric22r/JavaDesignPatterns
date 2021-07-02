package MyPackage;

import java.lang.Math;

public class PegAdapter extends RoundPeg {
	SquarePeg peg;
	int radius;
	
	public PegAdapter(SquarePeg _peg)
	{
		this.peg = _peg;
		this.radius = (int) Math.sqrt(Math.pow(peg.width,2) + Math.pow(peg.width,2))/2;
	}
	
	public int getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(int radius)
	{
		
		this.radius = radius;
	}
}

