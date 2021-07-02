package MyPackage;

public class Main {
	public static void main(String[] args) 
	{
		RoundHole hole = new RoundHole();
		
		SquarePeg squarePeg = new SquarePeg();
		
		squarePeg.setWidth(10);
		
		
		RoundPeg squarePegAdapter = new PegAdapter(squarePeg);
		
	
		RoundPeg roundPeg = new RoundPeg();
		roundPeg.setRadius(13);
		
		
		System.out.println("Hole raduis = " + hole.radius);
		
		if(hole.pegFits(roundPeg) == true)
		{
			System.out.println("With a radius = " + roundPeg.getRadius() +" The Round Peg fits!");
		}
		else
		{
			System.out.println("With a radius = " + roundPeg.getRadius() +" The Round Peg can't fit!");
		}
		
		if(hole.pegFits(squarePegAdapter) == true)
		{
			System.out.println("With a radius = " + squarePegAdapter.getRadius() +" The Square Peg fits!");
		}
		else
		{
			System.out.println("With a radius = " + squarePegAdapter.getRadius() +" The Square Peg can't fit!");
		}

	}
	

}

