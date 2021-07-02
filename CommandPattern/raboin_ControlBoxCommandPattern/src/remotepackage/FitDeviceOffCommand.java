package remotepackage;

public class FitDeviceOffCommand implements Command
{
	FitDevice fitDevice;
		
	public FitDeviceOffCommand(FitDevice fitDevice)
	{
		this.fitDevice = fitDevice;
	}
		
	public void execute()
	{
		fitDevice.off();
	}
		
	public void undo()
	{
		fitDevice.on();
	}
	
}
