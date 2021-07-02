package remotepackage;

public class OnMouseCommand implements Command
{
	MouseDevice mouseDevice;
	
	public OnMouseCommand(MouseDevice mouseDevice)
	{
		this.mouseDevice = mouseDevice;
	}
	
	public void execute()
	{
		mouseDevice.on();
	}
	
	public void undo()
	{
		mouseDevice.off();
	}
}
