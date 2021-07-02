package remotepackage;

public class BrainWaveOffCommand implements Command
{
	BrainWaveDevice brainWaveDevice;
	
	public BrainWaveOffCommand(BrainWaveDevice brainWaveDevice)
	{
		this.brainWaveDevice = brainWaveDevice;
	}
	
	public void execute()
	{
		brainWaveDevice.off();
	}
	
	public void undo()
	{
		brainWaveDevice.on();
	}
}
