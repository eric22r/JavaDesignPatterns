package remotepackage;

public class FitDeviceOnCommand implements Command
{
	FitDevice fitDevice;
	
	public FitDeviceOnCommand(FitDevice fitDevice)
	{
		this.fitDevice = fitDevice;
	}
		
	public void execute()
	{
		fitDevice.on();
	}
		
	public void undo()
	{
		fitDevice.off();
	}
}
