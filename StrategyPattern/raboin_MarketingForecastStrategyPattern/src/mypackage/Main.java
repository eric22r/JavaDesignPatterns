package mypackage;

public class Main {
	
	public static void main(String[] args)
	{
		float revenue;
		float total;
		System.out.println("Printing results of revenue for each state pending 80,000 sold units:\n\n");
		Calculator stateAL = new AlabamaState();
		revenue = stateAL.tInterface.CalculateTaxes();
		
		Calculator stateAK = new AlaskaState();
		revenue = stateAK.tInterface.CalculateTaxes();
		
		Calculator stateAZ = new ArizonaState();
		revenue = stateAZ.tInterface.CalculateTaxes();
		
		Calculator stateAR = new ArkansasState();
		revenue = stateAR.tInterface.CalculateTaxes();
		
		Calculator stateCA = new CaliforniaState();
		revenue = stateCA.tInterface.CalculateTaxes();
		
		Calculator stateCO = new ColoradoState();
		revenue = stateCO.tInterface.CalculateTaxes();
		
		Calculator stateCT = new ConnecticutState();
		revenue = stateCT.tInterface.CalculateTaxes();
		
		
	}
}
