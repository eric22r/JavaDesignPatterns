package remotepackage;

public class OffMouseCommand implements Command
{
	MouseDevice mouseDevice;
	
	public OffMouseCommand(MouseDevice mouseDevice)
	{
		this.mouseDevice = mouseDevice;
	}
	
	public void execute()
	{
		mouseDevice.off();
	}
	
	public void undo()
	{
		mouseDevice.on();
	}
}
