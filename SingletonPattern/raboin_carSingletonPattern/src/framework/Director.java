package framework;

class Director {
	public static void main(String[] args)
	{
		BrandNewCar lexus = buildCar(LexusES300Builder.getInstance());
		System.out.println(
				"Newly built car: "
		+ lexus.getCarName()
		+ "."
		+ lexus.getCarSpecs());
		
		
	}
	
	public static BrandNewCar buildCar(MidSizeCarBuilder midSizeCarBuilder)
	{
		midSizeCarBuilder.buildBrandNewCar();
		midSizeCarBuilder.setCarName();
		midSizeCarBuilder.buildChassis();
		midSizeCarBuilder.buildBody();
		
		return midSizeCarBuilder.getBrandNewCar();
	}
}
